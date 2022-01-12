package dortBesKatlarý;

import java.util.Scanner;

public class DortBesKatlari {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Sayýyý giriniz : ");
		int sayi = s.nextInt();
		
		for(int i =1 ; i<sayi; i++) {
			if(i%4 ==0) {
				System.out.println(i+" sayýsý 4 e tam bölünür");
			}
			if(i%5 == 0) {
				System.out.println(i+" sayýsý 5 e tam bölünür");
			}
		}
		
		
	}
}
