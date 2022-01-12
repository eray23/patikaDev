package harmonikSayilar;

import java.util.Scanner;

public class HarmonikSayilar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("n i giriniz : ");
		int n = s.nextInt();
		
		double toplam = 0;
		for(int i = 1; i<=n ; i++) {
			toplam = toplam + (1.0/i);
		}
		System.out.println("Toplam : "+ toplam);

	}

}
