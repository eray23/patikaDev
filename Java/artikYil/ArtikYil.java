package artikYil;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Y�l� giriniz : ");
		int yil = s.nextInt();
		if(yil%100 == 0) {
			if(yil%400 == 0) {
				System.out.println(yil + " y�l� art�k bir y�ld�r");
			}
			else {
				System.out.println(yil + " y�l� art�k bir y�l de�ildir");
			}
		}
		if(yil%4 ==0 && yil%100 != 0) {
			System.out.println(yil + " y�l� art�k bir y�ld�r");
		}
	}

}
