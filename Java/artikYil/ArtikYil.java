package artikYil;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Yýlý giriniz : ");
		int yil = s.nextInt();
		if(yil%100 == 0) {
			if(yil%400 == 0) {
				System.out.println(yil + " yýlý artýk bir yýldýr");
			}
			else {
				System.out.println(yil + " yýlý artýk bir yýl deðildir");
			}
		}
		if(yil%4 ==0 && yil%100 != 0) {
			System.out.println(yil + " yýlý artýk bir yýldýr");
		}
	}

}
