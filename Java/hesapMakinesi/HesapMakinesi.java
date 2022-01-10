package hesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x,y,select;
		System.out.print("1. sayýyý giriniz : ");
		x = s.nextInt();
		System.out.println("2. sayýyý giriniz : ");
		y = s.nextInt();
		System.out.println("Toplama için 1, Çýkarma için 2, Çarpma için 3, Bölme için 4");
		select = s.nextInt();
		
		switch(select) {
		case 1 : 
			System.out.println("Toplama : " + (x+y));
			break;
		case 2 :
			System.out.println("Çýkarma : " + (x-y));
			break;
		case 3 :
			System.out.println("Çarpma : " + (x*y));
			break;
		case 4:
			System.out.println("bölme : " + (x/y));
			break;
		}
		

	}

}
