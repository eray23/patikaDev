package asalSayilar;

public class AsalSayi {

	public static void main(String[] args) {
		
		boolean b = true;
		for(int i = 2;i<100;i++) {
			for(int j=2; j<i;j++) {
				if(i%j ==0) {
					b = false;
					break;
				}
			}
			if(b) {
				System.out.println(i+" Sayýsý asaldýr");
			}
			else {
				b = true;
			}
		}

	}

}
