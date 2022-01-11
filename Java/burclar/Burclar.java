package burclar;

import java.util.Scanner;

public class Burclar {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("ka��nc� ayda do�du�unu gir : ");
		int ay = s.nextInt();
		System.out.println("ay�n ka��nc� g�n� do�du�unu gir : ");
		int gun = s.nextInt();
		
		if (ay == 1) {
            if (gun < 21) {
                System.out.println("o�lak");
            } else {
                System.out.println("kova");
            }
        } else if (ay == 2) {
            if (gun < 19) {
                System.out.println("kova");
            } else {
                System.out.println("bal�k");
            }
        } else if (ay == 3) {
            if (gun < 20) {
                System.out.println("bal�k");
            } else {
                System.out.println("ko�");
            }
        }else if (ay == 4) {
            if (gun < 20) {
                System.out.println("ko�");
            } else {
                System.out.println("bo�a");
            }
        }else if (ay == 5) {
            if (gun < 21) {
                System.out.println("bo�a");
            } else {
                System.out.println("ikizler");
            }
        }else if (ay == 6) {
            if (gun < 21) {
                System.out.println("ikizler");
            } else {
                System.out.println("yenge�");
            }
        }else if (ay == 7) {
            if (gun < 22) {
                System.out.println("yenge�");
            } else {
                System.out.println("aslan");
            }
        }else if (ay == 8) {
            if (gun < 22) {
                System.out.println("aslan");
            } else {
                System.out.println("ba�ak");
            }
        }else if (ay == 9) {
            if (gun < 22) {
                System.out.println("ba�ak");
            } else {
                System.out.println("terazi");
            }
        }else if (ay == 10) {
            if (gun < 22) {
                System.out.println("terazi");
            } else {
                System.out.println("akrep");
            }
        }else if (ay == 11) {
            if (gun < 21) {
                System.out.println("akrep");
            } else {
                System.out.println("yay");
            }
        }else if (ay == 12) {
            if (gun < 21) {
                System.out.println("yay");
            } else {
                System.out.println("o�lak");
            }
            }
	}

}
