package daireAlan;

import java.util.Scanner;

public class DaireAlan {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Dairenin yar��ap�n� giriniz : ");
		int yaricap = s.nextInt();
		System.out.print("Daire diliminin merkez a�� �l��s�n� giriniz : ");
		int aci = s.nextInt();
		
		double pi = 3.14;
		double alan = (pi *(yaricap * yaricap) * aci) / 360;
		System.out.println("Daire diliminin alan� : "+ alan);
		
		
		
	}

}
