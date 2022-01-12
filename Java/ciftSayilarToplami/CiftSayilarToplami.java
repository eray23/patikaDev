package ciftSayilarToplami;

import java.util.Scanner;

public class CiftSayilarToplami {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		int toplam  =0;
		do {
			System.out.print("Sayý Giriniz : ");
			n = s.nextInt();
			if(n%4 == 0) {
				toplam += n;
			}
		}
		while(n%2 ==0);
		System.out.println("Toplam : "+ toplam);
	}

}
