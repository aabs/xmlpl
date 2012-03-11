using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using NUnit.Framework;
using FluentAssertions;
using Utilities;

namespace Tests
{
    [TestFixture]
    public class TestAppBus
    {
        [SetUp]
        public void SetUp()
        {
            counter = othercounter = 0;
        }
        [TearDown]
        public void TearDown()
        {
            AppBus.Default.Reset();
        }
        private int counter;

        [Test, Category("Regression")]
        public void TestCreateBus()
        {
            var ab = AppBus.Default;
            ab.Should().NotBeNull();
        }


        [Test, Category("Regression")]
        public void TestSubscribe()
        {
            var ab = AppBus.Default;
            ab.Subscribe((ISomeMessage msg) => this.HandleSomeMessage(msg));

        }

        [Test, Category("Regression")]
        public void TestInvoke()
        {
            var ab = AppBus.Default;
            counter = 0;
            ab.Subscribe((ISomeMessage msg) => this.HandleSomeMessage(msg));
            ab.Announce(new SomeMessage1
                            {
                                Message = "hello world"
                            });
            counter.Should().Be(1);
        }

        [Test, Category("Regression")]
        public void TestInvokeTwice()
        {
            var ab = AppBus.Default;
            counter = 0;
            ab.Subscribe((ISomeMessage msg) => this.HandleSomeMessage(msg));
            ab.Subscribe((ISomeMessage msg) => this.HandleSomeMessage(msg));
            ab.Announce(new SomeMessage1 { Message = "hello world" });
            counter.Should().Be(2);
        }


        [Test, Category("Regression")]
        public void TestTwoSubscriptions()
        {
            var ab = AppBus.Default;
            counter = 0;
            ab.Subscribe((ISomeMessage msg) => this.HandleSomeMessage(msg));
            ab.Subscribe((ISomeOtherMessage msg) => this.HandleSomeOtherMessage(msg));
            ab.Announce(new SomeMessage1 { Message = "hello world" });
            ab.Announce(new SomeMessage2 { Message = "hello world" });
            counter.Should().Be(1);
            othercounter.Should().Be(1);
        }


        [Test, Category("Regression")]
        public void TestWithInt()
        {
            var ab = AppBus.Default;
            counter = 0;
            ab.Subscribe((int val) => this.HandleSomeIntMessage(val));
            ab.Announce(5);
            counter.Should().Be(5);
        }

        private void HandleSomeIntMessage(int val)
        {
            counter = val;
        }


        private void HandleSomeMessage(ISomeMessage msg)
        {
            counter++;
        }

        private void HandleSomeOtherMessage(ISomeOtherMessage msg)
        {
            othercounter++;
        }

        protected int othercounter { get; set; }
    }

    internal interface ISomeOtherMessage
    {
        string Message { get; set; }
    }

    class SomeMessage2 : ISomeOtherMessage
    {
        public string Message { get; set; }
    }
    internal interface ISomeMessage
    {
        string Message { get; set; }
    }

    class SomeMessage1 : ISomeMessage
    {
        public string Message { get; set; }
    }
}
