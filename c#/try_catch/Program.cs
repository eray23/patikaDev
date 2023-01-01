    class Program
    {
        public static void Main(string[] args)
        {

            try
            {
                Console.WriteLine("Bir sayı giriniz : ");
                int sayi = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Girmiş olduğunuz sayı : " + sayi);
            }
            catch (Exception e)
            {
                Console.WriteLine("Hata : " + e.Message.ToString());
            }

            try
            {
               
                int a = int.Parse("-2000000000000");
            }
            catch (ArgumentNullException e)
            {
                Console.WriteLine("Boş değer girdiniz");
                Console.WriteLine(e);
            }
            catch (FormatException e)
            {
                Console.WriteLine("Veri tipi uygun değil");
                Console.WriteLine(e);
            }
            catch (OverflowException e)
            {
                Console.WriteLine("Geçersiz değer");
                Console.WriteLine(e);
            }
            finally
            {
                Console.WriteLine("İşlem başarıyla tamamlandı.");
            }

        }
    }
