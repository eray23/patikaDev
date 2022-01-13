package yildiz;

public class Yildiz {

	public static void main(String[] args) {
		int n = 6;
		
		for(int i = 1; i<=n;i++) {
			for(int k =1;k<=(n-i);k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
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
