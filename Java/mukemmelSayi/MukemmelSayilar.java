package mukemmelSayi;

import java.util.Scanner;

public class MukemmelSayilar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Say�y� giriniz : ");
		int sayi = s.nextInt();
		
		int toplam =0;
		for(int i =1; i<sayi;i++) {
			if(sayi%i ==0) {
				toplam += i;
				System.out.println("--->"+i);
			}
		}
		System.out.println("Toplam : "+toplam);
		if(sayi == toplam) {
			System.out.println(sayi+" Say�s� m�kemmel say�d�r");
		}
		else {
			System.out.println(sayi + " Say�s� m�kemmel de�ildir");
		}
		
		
	}
	

}
