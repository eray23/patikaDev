namespace tip_donusum
{
    class Program
    {
        public static void Main(string[] args) {

            Console.WriteLine("-----Implicit Conversion-----");

            byte a = 7;
            sbyte b = 13;
            short c = 10;

            int d = a + b + c;
            Console.WriteLine("d: " + d);

            long e = d;
            Console.WriteLine("h: " + e);

            float f = e;
            Console.WriteLine("f: " + e);

            string g = "m.eray.vura";
            char h = 'l';
            object i = g + h + e;
            Console.WriteLine("i: " + i);

            Console.WriteLine("");
            Console.WriteLine("-----Explicit Conversion-----");

            int j = 255;
            byte k = (byte)j;
            Console.WriteLine("k: " + k);

            int l = 256;
            byte m = (byte)l;
            Console.WriteLine("m: " + m);

            float n = 23.1f;
            byte o = (byte)n;
            Console.WriteLine("o: " + o);

            int aa = 15;
            string bb = aa.ToString();
            Console.WriteLine("bb: " + bb);

            string cc = 10.4f.ToString();
            Console.WriteLine("cc: " + cc);

            Console.WriteLine("");
            Console.WriteLine("-----System.Convert-----");

            string x = "17", y = "3";
            int x1, y1;
            int total;

            x1 = Convert.ToInt32(x);
            y1 = Convert.ToInt32(y);

            total = x1 + y1;
            Console.WriteLine("Total: " + total);

            

            string text1 = "23";
            string text2 = "10.17";

            int number1 = Int32.Parse(text1);
            double number2 = Double.Parse(text2);

            Console.WriteLine("Number1: " + number1);
            Console.WriteLine("Number2: " + number2);

            Console.ReadLine();
        }
    }



}
