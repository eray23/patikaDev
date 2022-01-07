package ucgenAlanHesapla;

import java.util.Scanner;
import java.lang.Math;

public class UcgenAlan {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Üçgenin birinci kenarýný giriniz : ");
		int a = s.nextInt();
		System.out.println("Üçgenin ikinci kenarýný giriniz : ");
		int b = s.nextInt();
		System.out.println("Üçgenin üçüncü kenarýný giriniz : ");
		int c = s.nextInt();
		
		float u = (a+b+c)/2;
		float alanKare = u  *(u-a)*(u-b)*(u-c);
		float alan = (float) Math.sqrt(alanKare);
		System.out.print("Üçgenin Alaný : " + alan);
	}

}
