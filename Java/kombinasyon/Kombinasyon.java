package kombinasyon;

import java.util.Scanner;

public class Kombinasyon {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("n yi giriniz : ");
		int n = s.nextInt();
		System.out.println("r yi giriniz : ");
		int r = s.nextInt();
		
		int faktoriyelN =1;
		int faktoriyelR =1;
		int faktoriyelFark = 1;
		int komb;
		for(int i =1; i<=n;i++){
			faktoriyelN *= i;
		}
		for(int j =1; j<=r;j++){
			faktoriyelR *= j;
		}
		for(int k =1; k<=(n-r);k++) {
			faktoriyelFark *= k;
		}
		komb = faktoriyelN /(faktoriyelR*(faktoriyelFark));
		System.out.println("Sonuç : "+ komb);
	}

}
