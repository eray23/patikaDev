package sayiSiralama;

import java.util.Scanner;

public class SayiSiralama {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sayi;
		int enb;
		int enk;
		int birinciSayi;
		System.out.print("Ka� say� girilecek : ");
		int sayiAdedi = s.nextInt();
		System.out.print("1. Say�y� giriniz : ");
		birinciSayi = s.nextInt();
		enb = birinciSayi;
		enk = birinciSayi;
		for(int i =2; i<=sayiAdedi ;i++) {
			System.out.print(i +". Say�y� giriniz : ");
			sayi = s.nextInt();
			if(sayi > enb) {
				enb = sayi;
			}
			if(sayi<enk) {
				enk = sayi;
			}
		}
		System.out.println("En b�y�k say� : "+enb);
		System.out.println("En k���k say� : "+enk);
	}

}
