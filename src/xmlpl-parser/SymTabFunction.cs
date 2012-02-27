using System;
using System.Collections;
using System.Collections.Generic;

namespace xmlpl_parser
{
    public class SymTabFunction : SymTabEntry
    {
        public List<Func<Stack, Stack>> Func { get; set; }

    }
}