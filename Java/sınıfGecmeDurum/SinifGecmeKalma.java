package sýnýfGecmeDurum;

import java.util.Scanner;

public class SinifGecmeKalma {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int notToplam=0;
		int acc=0;
		
		System.out.print("Matematik notunu gir : ");
		int mat = s.nextInt();
		if(0<=mat && mat<=100){
			acc++;
			notToplam += mat;	
		}
		System.out.print("Fizik notunu gir : ");
		int fizik = s.nextInt();
		if(0<=fizik && fizik<=100){
			acc++;
			notToplam += fizik;	
		}
		System.out.print("Türkçe notunu gir : ");
		int tr = s.nextInt();
		if(0<=tr && tr<=100){
			acc++;
			notToplam += tr;	
		}
		System.out.print("Kimya notunu gir : ");
		int kim = s.nextInt();
		if(0<=kim && kim<=100){
			acc++;
			notToplam += kim;	
		}
		System.out.print("Müzik notunu gir : ");
		int muz = s.nextInt();
		if(0<=muz && muz<=100){
			acc++;
			notToplam += muz;	
		}
		
		
		int sonuc = notToplam/acc;
		System.out.println("Hesaba katýlan ders sayýsý : " + acc);
		System.out.println("Toplam ortalamanýz : "+ sonuc);
		if(sonuc>54) {
			System.out.println("Geçtiniz. Tebrikler");
		}
		else {
			System.out.println("Maalesef kaldýnýz.");
		}
	}

}
