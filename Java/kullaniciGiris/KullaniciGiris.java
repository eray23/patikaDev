package kullaniciGiris;

import java.util.Scanner;

public class KullaniciGiris {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		String sifre = "123456";
		System.out.print("�ifrenizi Giriniz : ");
		String girdi = s.next();
		if(girdi.equals(sifre)) {
			System.out.println("Giri� ba�ar�l�");
		}
		else {
			System.out.println("�ifren yanl�� s�f�rlamak ister misin? istiyorsan 1 istemiyorsan 0 : ");
			int sorgu = s.nextInt();
			if(sorgu == 1) {
				System.out.print("yeni �ifrenizi giriniz  :  ");
				String yeni = s.next();
				if(yeni.equals(sifre)) {
					System.out.println("eski �ifre yenisiyle ayn� olmamal�d�r.");
				}
				else {
					sifre = yeni;
					System.out.println("�ifreniz ba�ar�yla olu�turuldu");
				}
			}
			
		}
		
		
		
		
		

	}

}
