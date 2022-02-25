package polindromSayilar;

public class PolindromSayilar {
	
	static boolean isPolindrom(int number) {
		int temp = number, reverseNumber =0, lastNumber;
		while(temp !=0) {
			lastNumber = temp % 10;
			reverseNumber = lastNumber + (reverseNumber *10); // 53
			temp /= 10; 
		}
		if(number == reverseNumber) {
			System.out.println("Evet");
			return true;
			
		}
		else {
			return false;
		}
	}
	
	
	public static void main(String args[]){
		
		
	
		
		isPolindrom(606);
		
		
		
		
		
	}
}
