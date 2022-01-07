package daireAlan;

import java.util.Scanner;

public class DaireAlan {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Dairenin yarýçapýný giriniz : ");
		int yaricap = s.nextInt();
		System.out.print("Daire diliminin merkez açý ölçüsünü giriniz : ");
		int aci = s.nextInt();
		
		double pi = 3.14;
		double alan = (pi *(yaricap * yaricap) * aci) / 360;
		System.out.println("Daire diliminin alaný : "+ alan);
		
		
		
	}

}
