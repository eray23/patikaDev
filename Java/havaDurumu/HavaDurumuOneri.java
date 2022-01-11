package havaDurumu;

import java.util.Scanner;

public class HavaDurumuOneri {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("hava kaç derece : ");
		int hava  = s.nextInt();
		if(hava<5) {
			System.out.println("kayak yap");
		}
		else if(5<hava && hava<15) {
			System.out.println("Sinema");
		}
		else if(15<hava && hava<25) {
			System.out.println("Piknik");
		}
		else if(25<hava) {
			System.out.println("Yüzme");
		}
		
	}

}
