namespace xmlpl_parser
{
    public abstract class SymTabEntry
    {
        public string Name { get; set; }
        public string DefiningModule { get; set; }
        public int Line { get; set; }
    }
}