package usluSayi;

import java.util.Scanner;

public class UsluSayi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Taban : ");
		int taban = s.nextInt();
		System.out.print("Üs : ");
		int us = s.nextInt();
		
		int sonuc=1;
		
		for(int i = 0; i<us; i++) {
			sonuc *= taban;
		}
		System.out.println("Sonuç : " + sonuc);
	}

}
