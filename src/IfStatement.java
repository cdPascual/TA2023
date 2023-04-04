
public class IfStatement {

	public static void main(String[] args) {
		
		int a = 5;
		
		if(a > 0) {
			System.out.println("This number is positive");
		}
		else if(a < 0){
			System.out.println("This number is negative");
		}
		else {
			System.out.println("This number is 0");
		}
		
		int b = 4;
		
		if((b%2) == 0) {
			System.out.println("This number is even");
		}
		else {
			System.out.println("This number is odd");
		}
	}

}
