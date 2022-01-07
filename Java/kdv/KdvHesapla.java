package kdv;

import java.util.Scanner;

public class KdvHesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Fiyatý giriniz : ");
		float tutar = s.nextFloat();
		float toplam;
		if(tutar<1000) {
			toplam = tutar + tutar*18/100;
		}
		else {
			toplam = tutar + tutar*8/100;
		}
		System.out.println("KDV ile toplam tutar : " + toplam);
	}

}
