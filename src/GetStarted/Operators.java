package GetStarted;

public class Operators {

	public static void main(String[] args) {
		
		//java Logic
		System.out.println(45<5);
		
		//java operators
		//arithmetic op: +, -, *, /, %
		System.out.println(10 % 3);
		
		//assignment op: =
		int x = 5;
		String s;
		
		//comparison op: ==, !=, >, >=, <, <=
		System.out.println(10 == 5);
		
		
		//logical op: &&, ||, !
		System.out.println((10 == 3) && (110 > 23));
		System.out.println((10 == 3) || (10 < 23));
		
		int num1 = 10;
		int num2 = 15;
		
		//final makes variable immutable
		final int number = 2;
		
		double total2 = num1 + num2;
		
		double num3 = 10.5;
		double num4 = 15.4;
		
		total2 = (int)num3 + (int)num4;
		
		//up casting: byte > short > int > long > float > double
		//down casting: double > float > long > int > short > byte
	}
	

}
