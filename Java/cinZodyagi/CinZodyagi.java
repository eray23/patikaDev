package cinZodyagi;

import java.util.Scanner;

public class CinZodyagi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("do�um y�l�n� gir : ");
		int dogumYili = s.nextInt();
		if(dogumYili % 12 == 0) {
			System.out.println("Maymun");
		}
		else if(dogumYili % 12 == 1) {
			System.out.println("Horoz");
		}
		else if(dogumYili % 12 == 2) {
			System.out.println("K�pek");
		}
		else if(dogumYili % 12 == 3) {
			System.out.println("Domuz");
		}
		else if(dogumYili % 12 == 4) {
			System.out.println("Fare");
		}
		else if(dogumYili % 12 == 5) {
			System.out.println("�k�z");
		}
		else if(dogumYili % 12 == 6) {
			System.out.println("Kaplan");
		}
		else if(dogumYili % 12 == 7) {
			System.out.println("Tav�an");
		}
		else if(dogumYili % 12 == 8) {
			System.out.println("Ejderha");
		}
		else if(dogumYili % 12 == 9) {
			System.out.println("Y�lan");
		}
		else if(dogumYili % 12 == 10) {
			System.out.println("At");
		}
		else if(dogumYili % 12 == 11) {
			System.out.println("Koyun");
		}
		
		
			
	}

}
