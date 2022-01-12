package basamaklarToplami;

import java.util.Scanner;

public class BasamaklarToplami {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("sayýyý giriniz : ");
		int sayi = s.nextInt();
		
		int i=0;
		while(sayi>0) {
			i +=sayi %10;
			sayi =sayi/10;
		}
		
		System.out.println("sonuc : " + i);
		

	}

}
