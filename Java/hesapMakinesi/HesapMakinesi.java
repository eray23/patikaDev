package hesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x,y,select;
		System.out.print("1. say�y� giriniz : ");
		x = s.nextInt();
		System.out.println("2. say�y� giriniz : ");
		y = s.nextInt();
		System.out.println("Toplama i�in 1, ��karma i�in 2, �arpma i�in 3, B�lme i�in 4");
		select = s.nextInt();
		
		switch(select) {
		case 1 : 
			System.out.println("Toplama : " + (x+y));
			break;
		case 2 :
			System.out.println("��karma : " + (x-y));
			break;
		case 3 :
			System.out.println("�arpma : " + (x*y));
			break;
		case 4:
			System.out.println("b�lme : " + (x/y));
			break;
		}
		

	}

}
