package katDonguler;

import java.util.Scanner;

public class UcveDordunKatlari {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int sayi= s.nextInt();
		int toplam  =0;
		int acc = 0;
		for(int i=1; i<sayi; i++) {
			if(i%3 ==0 && i%4 ==0) {
				System.out.println(i+" sayýsý 3 e ve dörde bölünmektedir.");
				
				toplam += i ;
				acc++;
			}
			
		}
		System.out.println("Ortalama : "+toplam/acc);
	}

}
