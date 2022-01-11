package sayiSirala;

import java.util.Scanner;

public class SayiSiralama {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("a yý gir");
		int a = s.nextInt();
		System.out.println("b yý gir");
		int b = s.nextInt();
		System.out.println("c yý gir");
		int c = s.nextInt();
		
		if((a > b) && (a > c)) {
			if(b>c) {
				System.out.println("a > b > c");
			}
			else {
				System.out.println("a > c > b");
			}
		}
		else if((b>a) && (b>c)) {
			if(a>c) {
				System.out.println("b>a>c");
			}
			else {
				System.out.println("b > c > a");
			}
		}
		else if((c>b) && (c>a)) {
			if(a>b) {
				System.out.println("c>a>b");
			}
			else {
				System.out.println("c>b>a");
			}
		}
		
		
		
		
		
	}

}
