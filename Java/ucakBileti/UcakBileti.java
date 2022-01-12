package ucakBileti;

import java.util.Scanner;

public class UcakBileti {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		double tutar;
		System.out.print("Mesafeyi yaz�n�z : ");
		double km = s.nextDouble();
		System.out.print("Tek y�n ise 1 �ift y�n ise 2 ye bas�n�z : ");
		int tip = s.nextInt();
		if(tip<1 || tip>2) {
			System.out.println("Hatal� veri girdiniz! Program� yeniden ba�lat�n..");
			System.exit(1);
		}
		
		
		System.out.print("Ya��n�z� Giriniz : ");
		int yas = s.nextInt();
		if(km<0 || yas<0) {
			System.out.println("Hatal� veri girdiniz! Program� yeniden ba�lat�n.");
			System.exit(1);
		}
		if(yas<=12) {
			if(tip == 2) {
				tutar = (((0.10*km)/2)*80/100)*2;
				System.out.println("Toplam Tutar : "+ tutar);
			}
			else {
				tutar = (0.10*km)/2;
				System.out.println("Toplam Tutar : "+ tutar);
			}
		}
		if(12<yas && yas<=24) {
			if(tip == 2) {
				tutar = (((0.10*km)*90/100)*80/100)*2;
				System.out.println("Toplam Tutar : "+ tutar);
			}
			else {
				tutar = (0.10*km)*90/100;
				System.out.println("Toplam Tutar : "+ tutar);
			}
		}
		if(yas>=65) {
			if(tip == 2) {
				tutar = (((0.10*km)*70/100)*80/100)*2;
				System.out.println("Toplam Tutar : "+ tutar);
			}
			else {
				tutar = (0.10*km)*70/100;
				System.out.println("Toplam Tutar : "+ tutar);
			}
		}
		if(yas>24 && yas<65) {
			if(tip == 2) {
				tutar = ((0.10*km)*80/100)*2;
				System.out.println("Toplam Tutar : "+ tutar);
			}
			else {
				tutar = 0.10*km;
				System.out.println("Toplam Tutar : "+ tutar);
			}
		}

	}

}
