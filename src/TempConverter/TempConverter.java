package TempConverter;

import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		System.out.println("------------------------Welcome------------------------");
		System.out.println("---------Celsius->Farenheit/Farenheit->Celsius---------");
		int status = 0;
		int mode;
		double temp1;
		double temp2;
		do {
			System.out.println("Choose The Conversion Mode\n1- Celsius->Farenheit\n"
					+ "2- Farenheit->Celsius");
					
			Scanner sc = new Scanner(System.in);
			mode = sc.nextInt();
			
			while(mode !=1 && mode !=2) {
				System.out.println("invalid input. Please enter 1 or 2.");
				mode = sc.nextInt();
			}
			
			if(mode==1) {
				System.out.println("Enter Temperature To Convert");
				temp1 = sc.nextDouble();
				temp2 = ((temp1*9/5)+32);
				System.out.println(temp1+" in Farenheit is "+temp2);
			}
			else {
				System.out.println("Enter Temperature To Convert");
				temp1 = sc.nextDouble();
				temp2 = ((temp1-32)*5/9);
				System.out.println(temp1+" in Celsius is "+temp2);
			}
			System.out.println("Do You want to convert other temperatures\n1-yes\nany other number - no");
			status = sc.nextInt();
			
		}while(status ==1);
		
		System.out.println("GoodBye");
	}

}
