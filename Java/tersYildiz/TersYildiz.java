package tersYildiz;

import java.util.Scanner;

public class TersYildiz {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Kaç basamak olacak : ");
		int n = s.nextInt();
		for(int i = n; i>0;i--) {
			for(int k =1;k<=(n-i);k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
