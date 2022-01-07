package manav;

import java.util.Scanner;

public class Manav {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double armutFiyat = 2.14;
		double elmaFiyat = 3.67;
		double domatesFiyat = 1.11;
		double muzFiyat = 0.95;
		double patlýcanFiyat = 5.00;
		
		System.out.print("Armut kaç kilo : ");
		double armutKilo = s.nextDouble();
		System.out.print("Elma kaç kilo : ");
		double elmaKilo = s.nextDouble();
		System.out.print("Domates kaç kilo : ");
		double domatesKilo = s.nextDouble();
		System.out.print("Muz kaç kilo : ");
		double muzKilo = s.nextDouble();
		System.out.print("Patlýcan kaç kilo : ");
		double patlýcanKilo = s.nextDouble();
		
		double tutar = (armutFiyat * armutKilo) + (elmaKilo * elmaFiyat) + (domatesKilo*domatesFiyat) + (muzKilo*muzFiyat)+(patlýcanKilo*patlýcanFiyat); 
		
		System.out.println("Toplam tutar : " + tutar);
		
		

	}

}
