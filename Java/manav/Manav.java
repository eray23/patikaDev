package manav;

import java.util.Scanner;

public class Manav {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double armutFiyat = 2.14;
		double elmaFiyat = 3.67;
		double domatesFiyat = 1.11;
		double muzFiyat = 0.95;
		double patl�canFiyat = 5.00;
		
		System.out.print("Armut ka� kilo : ");
		double armutKilo = s.nextDouble();
		System.out.print("Elma ka� kilo : ");
		double elmaKilo = s.nextDouble();
		System.out.print("Domates ka� kilo : ");
		double domatesKilo = s.nextDouble();
		System.out.print("Muz ka� kilo : ");
		double muzKilo = s.nextDouble();
		System.out.print("Patl�can ka� kilo : ");
		double patl�canKilo = s.nextDouble();
		
		double tutar = (armutFiyat * armutKilo) + (elmaKilo * elmaFiyat) + (domatesKilo*domatesFiyat) + (muzKilo*muzFiyat)+(patl�canKilo*patl�canFiyat); 
		
		System.out.println("Toplam tutar : " + tutar);
		
		

	}

}
