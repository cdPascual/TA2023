package oops.polymorphism;

public class AdvancedCalculator extends Calculator{
	
	
	//method overriding:methods use the same name, the same number and types of parameters but different body
	@Override
	public void add(int a, int b) {
		int total = a+b;
		System.out.println(total);
	}

}
