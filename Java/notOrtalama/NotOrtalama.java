package notOrtalama;

import java.util.Scanner;

public class NotOrtalama {
	public static void main(String args[]) {
	Scanner s =  new Scanner(System.in);
	
	System.out.print("Matematik notunuzu giriniz : ");
	int matNot = s.nextInt();
	System.out.print("Fizik notunuzu giriniz : ");
	int fizikNot = s.nextInt();
	System.out.print("Kimya notunuzu giriniz : ");
	int kimyaNot = s.nextInt();
	System.out.print("Türkçe notunuzu giriniz : ");
	int turkceNot = s.nextInt();
	System.out.print("Tarih notunuzu giriniz : ");
	int tarihNot = s.nextInt();
	System.out.print("Müzik notunuzu giriniz : ");
	int muzikNot = s.nextInt();
	
	double ort = (matNot + fizikNot + kimyaNot + turkceNot + tarihNot + muzikNot) / 6 ;
	
	String sonuc = ort >= 50 ? "Geçti" : "Kaldý";
	System.out.println(sonuc);
	}
}
