using System.Security.Cryptography.X509Certificates;

namespace OdevBir
{
    class OdevBir
    {
        static void birinci()
        {
            Console.WriteLine("kaç adet sayı girilecek: ");
            int n = Convert.ToInt32(Console.ReadLine());

            int[] dizi = new int[n];
            for (int i = 0; i < n; i++)
            {
                Console.WriteLine("Dizinin " + i + ". elemanını giriniz: ");
                dizi[i] = Convert.ToInt32(Console.ReadLine());
            }
            Console.WriteLine("");
            for (int j = 0; j < n; j++)
            {
                if (dizi[j] % 2 == 0)
                {
                    Console.Write(dizi[j] + "-");
                }
            }
        }

        static void ikinci()
        {
            int k;
            Console.WriteLine("n sayısını giriniz: ");
            int n = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("m sayısını giriniz: ");
            int m = Convert.ToInt32(Console.ReadLine());

            for (int i = 0; i < n; i++)
            {

                Console.WriteLine(i + ". elemanı giriniz: ");
                k = Convert.ToInt32(Console.ReadLine());
                if (k % m == 0)
                {
                    Console.WriteLine("girdiğiniz " + k + " sayısı " + m + " sayısına tam bölünür");
                }
            }
        }
        static void ucuncu()
        {
            Console.WriteLine("n sayısını giriniz: ");
            int n = Convert.ToInt32(Console.ReadLine());
            string kelime = "";
            for (int i = 0; i < n; i++)
            {
                Console.WriteLine(i + ". elemanı giriniz: ");
                kelime += Convert.ToString(Console.ReadLine());
            }
            Console.WriteLine("birleştirilmiş kelime :  "+ kelime);

        }
        static void dorduncu()
        {
            Console.WriteLine("Stringi giriniz: ");
            string input = Console.ReadLine();

            int rakamSay = input.Count(char.IsDigit);
            int harfSay = input.Count(char.IsLetter);

            Console.WriteLine("Rakam adedi: " + rakamSay);
            Console.WriteLine("Harf adedi: " + harfSay);

        }
        public static void Main(string[] args)
        {
            birinci();
            ikinci();
            ucuncu();
            dorduncu();

        }
    }
}