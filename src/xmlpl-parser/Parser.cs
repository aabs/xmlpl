using System.Linq;
using System.Collections.Generic;
using System.Diagnostics;
using System.Diagnostics.Contracts;
// Set the name of your grammar here (and at the end of this grammar):


using System;

namespace xmlpl_parser {



public partial class Parser {
	public const int _EOF = 0;
	public const int _ident = 1;
	public const int _number = 2;
	public const int _string = 3;
	public const int maxT = 33;

	const bool T = true;
	const bool x = false;
	const int minErrDist = 2;
	
	public Scanner scanner;
	public Errors  errors;

	public Token t;    // last recognized token
	public Token la;   // lookahead token
	int errDist = minErrDist;

public StackMachine Machine { get; set; }

// If you want your generated compiler case insensitive add the
// keyword IGNORECASE here.




	public Parser(Scanner scanner) {
		this.scanner = scanner;
		errors = new Errors();
	}

	void SynErr (int n) {
		if (errDist >= minErrDist) errors.SynErr(la.line, la.col, n);
		errDist = 0;
	}

	public void SemErr (string msg) {
		if (errDist >= minErrDist) errors.SemErr(t.line, t.col, msg);
		errDist = 0;
	}
	
	void Get () {
		for (;;) {
			t = la;
			la = scanner.Scan();
			if (la.kind <= maxT) { ++errDist; break; }

			la = t;
		}
	}
	
	void Expect (int n) {
		if (la.kind==n) Get(); else { SynErr(n); }
	}
	
	bool StartOf (int s) {
		return set[s, la.kind];
	}
	
	void ExpectWeak (int n, int follow) {
		if (la.kind == n) Get();
		else {
			SynErr(n);
			while (!StartOf(follow)) Get();
		}
	}


	bool WeakSeparator(int n, int syFol, int repFol) {
		int kind = la.kind;
		if (kind == n) {Get(); return true;}
		else if (StartOf(repFol)) {return false;}
		else {
			SynErr(n);
			while (!(set[syFol, kind] || set[repFol, kind] || set[0, kind])) {
				Get();
				kind = la.kind;
			}
			return StartOf(syFol);
		}
	}

	
	void LobLang() {
		Machine = new StackMachine();
		ModuleHeader();
		while (la.kind == 6) {
			Import();
		}
		FunctionDeclaration();
		while (la.kind == 1) {
			FunctionDeclaration();
		}
	}

	void ModuleHeader() {
		Expect(4);
		Expect(1);
		Expect(5);
	}

	void Import() {
		Expect(6);
		Expect(1);
		Expect(5);
	}

	void FunctionDeclaration() {
		Expect(1);
		Expect(7);
		ArgList();
		Expect(8);
		Expect(9);
		Statement();
		while (StartOf(1)) {
			Statement();
		}
		Expect(10);
	}

	void ArgList() {
		Expression();
		while (la.kind == 11) {
			Get();
			Expression();
		}
	}

	void Statement() {
		Expression();
	}

	void FunctionInvocation() {
		Expect(1);
		Expect(7);
		ArgList();
		Expect(8);
	}

	void Expression() {
		if (la.kind == 21) {
			XmlModifyingExpression();
		} else if (la.kind == 23) {
			XmlPattern();
		} else if (la.kind == 26) {
			XmlFragment();
		} else if (la.kind == 1) {
			VariableReference();
		} else if (la.kind == 1) {
			FunctionInvocation();
		} else if (la.kind == 24) {
			XmlDocument();
		} else if (la.kind == 1) {
			Binding();
		} else SynErr(34);
	}

	void VariableReference() {
		Expect(1);
	}

	void Binding() {
		VariableReference();
		Expect(12);
		Expression();
	}

	void XmlModifyingExpression() {
		PathExpression();
		switch (la.kind) {
		case 13: {
			Get();
			Value();
			break;
		}
		case 14: {
			Get();
			Value();
			break;
		}
		case 15: {
			Get();
			Value();
			break;
		}
		case 16: {
			Get();
			XmlFragment();
			break;
		}
		case 17: {
			Get();
			PathExpression();
			break;
		}
		case 18: {
			Get();
			PathExpression();
			break;
		}
		case 19: {
			Get();
			PathExpression();
			break;
		}
		case 20: {
			Get();
			Expect(1);
			break;
		}
		default: SynErr(35); break;
		}
	}

	void XmlPattern() {
		Expect(23);
		XmlFragment();
	}

	void XmlFragment() {
		XmlObject();
	}

	void XmlDocument() {
		Expect(24);
		Expect(1);
		while (la.kind == 1) {
			XmlAttribute();
		}
		Expect(25);
		XmlObject();
	}

	void PathExpression() {
		Expect(21);
		Path();
	}

	void Value() {
		if (la.kind == 1) {
			Get();
		} else if (la.kind == 7) {
			Get();
			Expression();
			Expect(8);
		} else if (la.kind == 21) {
			PathExpression();
		} else if (la.kind == 26) {
			XmlFragment();
		} else SynErr(36);
	}

	void Path() {
		Expect(1);
		while (la.kind == 22) {
			Get();
			Expect(1);
		}
	}

	void Pattern() {
		Expect(23);
		Expect(1);
	}

	void ValueOf() {
		Expect(9);
		Expect(1);
		Expect(10);
	}

	void XmlAttribute() {
		Expect(1);
		Machine.CreatePusherFunction(t.val); Machine.EnqueueBuiltinFunction("XmlAttrName"); 
		Expect(12);
		XmlAttributeValue();
	}

	void XmlObject() {
		if (la.kind == 26) {
			XmlStartTag();
			while (StartOf(2)) {
				XmlContent();
			}
			XmlEndTag();
		} else if (la.kind == 26) {
			XmlUnaryTag();
		} else SynErr(37);
	}

	void XmlStartTag() {
		Expect(26);
		Machine.EnqueueBuiltinFunction("XmlStartElement");
		Expect(1);
		Machine.CreatePusherFunction(t.val);Machine.EnqueueBuiltinFunction("XmlIdent");
		if (la.kind == 1 || la.kind == 9 || la.kind == 23) {
			XmlAttributesOrPattern();
		}
		Expect(27);
		Machine.EnqueueBuiltinFunction("XmlEndBrace");
	}

	void XmlContent() {
		if (la.kind == 26) {
			XmlObject();
			while (la.kind == 26) {
				XmlObject();
			}
		} else if (StartOf(3)) {
			XmlText();
		} else SynErr(38);
	}

	void XmlEndTag() {
		Expect(28);
		Expect(1);
		Expect(27);
	}

	void XmlUnaryTag() {
		Expect(26);
		Expect(1);
		if (la.kind == 1 || la.kind == 9 || la.kind == 23) {
			XmlAttributesOrPattern();
		}
		Expect(29);
	}

	void XmlAttributesOrPattern() {
		if (la.kind == 23) {
			Pattern();
		} else if (la.kind == 9) {
			ValueOf();
		} else if (la.kind == 1) {
			XmlAttribute();
			while (la.kind == 1) {
				XmlAttribute();
			}
		} else SynErr(39);
	}

	void XmlText() {
		if (StartOf(3)) {
			XmlText();
			XmlWord();
		} else if (StartOf(3)) {
			XmlWord();
		} else SynErr(40);
	}

	void XmlAttributeValue() {
		Expect(3);
		Machine.CreatePusherFunction(t.val); Machine.EnqueueBuiltinFunction("XmlAttrVal");  
	}

	void XmlWord() {
		if (la.kind == 1) {
			Get();
			Machine.CreatePusherFunction(t.val); Machine.EnqueueBuiltinFunction("XmlAttrVal");  
		} else if (la.kind == 12) {
			Get();
		} else if (la.kind == 30) {
			XmlCharName();
		} else if (la.kind == 32) {
			XmlCharNumber();
		} else SynErr(41);
	}

	void XmlCharName() {
		Expect(30);
		Expect(1);
		Expect(31);
	}

	void XmlCharNumber() {
		Expect(32);
		Expect(2);
		Expect(31);
	}



	public void Parse() {
		la = new Token();
		la.val = "";		
		Get();
		LobLang();

    Expect(0);
	}
	
	static readonly bool[,] set = {
		{T,x,x,x, x,x,x,x, x,x,x,x, x,x,x,x, x,x,x,x, x,x,x,x, x,x,x,x, x,x,x,x, x,x,x},
		{x,T,x,x, x,x,x,x, x,x,x,x, x,x,x,x, x,x,x,x, x,T,x,T, T,x,T,x, x,x,x,x, x,x,x},
		{x,T,x,x, x,x,x,x, x,x,x,x, T,x,x,x, x,x,x,x, x,x,x,x, x,x,T,x, x,x,T,x, T,x,x},
		{x,T,x,x, x,x,x,x, x,x,x,x, T,x,x,x, x,x,x,x, x,x,x,x, x,x,x,x, x,x,T,x, T,x,x}

	};
} // end Parser


public class Errors {
	public int count = 0;                                    // number of errors detected
	public System.IO.TextWriter errorStream = Console.Out;   // error messages go to this stream
  public string errMsgFormat = "-- line {0} col {1}: {2}"; // 0=line, 1=column, 2=text
  
	public void SynErr (int line, int col, int n) {
		string s;
		switch (n) {
			case 0: s = "EOF expected"; break;
			case 1: s = "ident expected"; break;
			case 2: s = "number expected"; break;
			case 3: s = "string expected"; break;
			case 4: s = "\"module\" expected"; break;
			case 5: s = "\".\" expected"; break;
			case 6: s = "\"import\" expected"; break;
			case 7: s = "\"(\" expected"; break;
			case 8: s = "\")\" expected"; break;
			case 9: s = "\"{\" expected"; break;
			case 10: s = "\"}\" expected"; break;
			case 11: s = "\",\" expected"; break;
			case 12: s = "\"=\" expected"; break;
			case 13: s = "\"==\" expected"; break;
			case 14: s = "\"=>\" expected"; break;
			case 15: s = "\"=<\" expected"; break;
			case 16: s = "\"=?\" expected"; break;
			case 17: s = "\"->\" expected"; break;
			case 18: s = "\"-><\" expected"; break;
			case 19: s = "\"->>\" expected"; break;
			case 20: s = "\"!=\" expected"; break;
			case 21: s = "\"$\" expected"; break;
			case 22: s = "\"/\" expected"; break;
			case 23: s = "\"?\" expected"; break;
			case 24: s = "\"<?\" expected"; break;
			case 25: s = "\"?>\" expected"; break;
			case 26: s = "\"<\" expected"; break;
			case 27: s = "\">\" expected"; break;
			case 28: s = "\"</\" expected"; break;
			case 29: s = "\"/>\" expected"; break;
			case 30: s = "\"&\" expected"; break;
			case 31: s = "\";\" expected"; break;
			case 32: s = "\"&#\" expected"; break;
			case 33: s = "??? expected"; break;
			case 34: s = "invalid Expression"; break;
			case 35: s = "invalid XmlModifyingExpression"; break;
			case 36: s = "invalid Value"; break;
			case 37: s = "invalid XmlObject"; break;
			case 38: s = "invalid XmlContent"; break;
			case 39: s = "invalid XmlAttributesOrPattern"; break;
			case 40: s = "invalid XmlText"; break;
			case 41: s = "invalid XmlWord"; break;

			default: s = "error " + n; break;
		}
		errorStream.WriteLine(errMsgFormat, line, col, s);
		count++;
	}

	public void SemErr (int line, int col, string s) {
		errorStream.WriteLine(errMsgFormat, line, col, s);
		count++;
	}
	
	public void SemErr (string s) {
		errorStream.WriteLine(s);
		count++;
	}
	
	public void Warning (int line, int col, string s) {
		errorStream.WriteLine(errMsgFormat, line, col, s);
	}
	
	public void Warning(string s) {
		errorStream.WriteLine(s);
	}
} // Errors


public class FatalError: Exception {
	public FatalError(string m): base(m) {}
}

}