package hesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {
	
	
	static void alan() {
		Scanner s = new Scanner(System.in);
		System.out.println("Kısa kenar uzunluğunu gir");
		int a = s.nextInt();
		System.out.println("Uzun kenar uzunluğunu gir");
		int b = s.nextInt();
		System.out.println("Alan : " + (a*b));
	}
	static void cevre() {
		Scanner s = new Scanner(System.in);
		System.out.println("Kısa kenar uzunluğunu gir");
		int a = s.nextInt();
		System.out.println("Uzun kenar uzunluğunu gir");
		int b = s.nextInt();
		System.out.println("Çevre : " + (2*a+2*b));
	}
	static void mod() {
		Scanner s = new Scanner(System.in);
		System.out.println("Sayıyı Giriniz : ");
		int sayi = s.nextInt();
		System.out.println("Mod değerini giriniz : ");
		int mod = s.nextInt();
		
		System.out.println("Mod : "+ sayi % mod);
	}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Alan "
        		+ "2- Çevre " + "3- Mod";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                	alan();
                    break;
                case 2:
                    cevre();
                    break;
                case 3:
                    mod();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}
