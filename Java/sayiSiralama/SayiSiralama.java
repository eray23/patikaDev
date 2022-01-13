package sayiSiralama;

import java.util.Scanner;

public class SayiSiralama {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sayi;
		int enb;
		int enk;
		int birinciSayi;
		System.out.print("Kaç sayý girilecek : ");
		int sayiAdedi = s.nextInt();
		System.out.print("1. Sayýyý giriniz : ");
		birinciSayi = s.nextInt();
		enb = birinciSayi;
		enk = birinciSayi;
		for(int i =2; i<=sayiAdedi ;i++) {
			System.out.print(i +". Sayýyý giriniz : ");
			sayi = s.nextInt();
			if(sayi > enb) {
				enb = sayi;
			}
			if(sayi<enk) {
				enk = sayi;
			}
		}
		System.out.println("En büyük sayý : "+enb);
		System.out.println("En küçük sayý : "+enk);
	}

}
