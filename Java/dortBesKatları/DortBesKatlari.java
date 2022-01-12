package dortBesKatlar�;

import java.util.Scanner;

public class DortBesKatlari {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Say�y� giriniz : ");
		int sayi = s.nextInt();
		
		for(int i =1 ; i<sayi; i++) {
			if(i%4 ==0) {
				System.out.println(i+" say�s� 4 e tam b�l�n�r");
			}
			if(i%5 == 0) {
				System.out.println(i+" say�s� 5 e tam b�l�n�r");
			}
		}
		
		
	}
}
