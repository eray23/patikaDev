package vucutKitleIndeks;

import java.util.Scanner;

public class VucutKitleIndeks {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Boyunuzu metre cinsinden giriniz : ");
		double boy = s.nextInt();
		System.out.println("Kilonuzu giriniz : ");
		double kilo = s.nextInt();
		
		double indeks = (kilo/(boy*boy));
		System.out.println("V�cut kitle indeksiniz : "+indeks);
	}

}
