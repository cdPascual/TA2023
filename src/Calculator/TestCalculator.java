package Calculator;

import java.util.Scanner;

public class TestCalculator {

	//method provided by java. starting point of application
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("Please enter a number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		calc.add();
		
		calc.subtract();
		
		int num1 = calc.multiply(5,2);
		
		double num2 = calc.divide(4,6);
		
		System.out.println("you entered "+input);
		System.out.println(num1+", "+num2);

	}

}
