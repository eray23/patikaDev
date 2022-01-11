package kullaniciGiris;

import java.util.Scanner;

public class KullaniciGiris {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		String sifre = "123456";
		System.out.print("Þifrenizi Giriniz : ");
		String girdi = s.next();
		if(girdi.equals(sifre)) {
			System.out.println("Giriþ baþarýlý");
		}
		else {
			System.out.println("Þifren yanlýþ sýfýrlamak ister misin? istiyorsan 1 istemiyorsan 0 : ");
			int sorgu = s.nextInt();
			if(sorgu == 1) {
				System.out.print("yeni þifrenizi giriniz  :  ");
				String yeni = s.next();
				if(yeni.equals(sifre)) {
					System.out.println("eski þifre yenisiyle ayný olmamalýdýr.");
				}
				else {
					sifre = yeni;
					System.out.println("þifreniz baþarýyla oluþturuldu");
				}
			}
			
		}
		
		
		
		
		

	}

}
