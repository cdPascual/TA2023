package Testing;

public class Test {

	public static void main(String[] args) {
		
		//test data
		double hourlyRate = 50;
		double numberOfHours = 40;
		double bonus = 0.2;
		
		double expectedSalary = 2000;
		double expectedFinalSalary =2400;
		
		double salary = numberOfHours *  hourlyRate;
		//expected result: 11
		
		if(salary == expectedSalary)
			System.out.println("Step1 Passed");
		else
			System.out.println("Step1 Failed");
		
		double finalSalary= salary+(salary*bonus);
		
		if(finalSalary == expectedFinalSalary)
			System.out.println("Step2 Passed");
		else
			System.out.println("Step2 Failed");
		

	}

}
