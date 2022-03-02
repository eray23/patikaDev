package recursiveUs;

import java.util.Scanner;

public class RecursiveUs {
	
	static int Us(int x, int y) {
		
		
		if(y==0) {
			return 1;
		}
		return x* Us(x, y-1);
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("tabanı gir : ");
		int x = s.nextInt();
		System.out.println("üs değerini gir : ");
		int y = s.nextInt();
		
		System.out.println(Us(x,y));
		
		
		
		
		
		

	}

}
