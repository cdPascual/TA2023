package Loops;

public class Loops {

	public static void main(String[] args) {
		
		int count = 1;
		
		System.out.println("While Loop");
		//While Loop
		while(count<=10) {	
			System.out.println(count);
			count++;
		}
		
		System.out.println("Do While Loop");
		//do while loop
		do {
			System.out.println(count);
			count--;
			
		}while(count>0);
		
		System.out.println("For Loop");
		//For Loop
		for(int i= 0;i<10;i++) {
			System.out.println(false);
		}
		

		int[] array = {4,5,6,7,8,9};
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		
		System.out.println("--------------");
		
		for(int i = 0;i<4;i++) {
			System.out.println(i);
			System.out.println(array[i]);
		}
		
		//For Each Loop
		int[] array2 = {4,5,6,7,8,9};
		
		System.out.println("--------------");
		
		for(int a: array2) {
			System.out.println(a);
		}
		
		String[] names = {"Bob","Jack","Fred"};
		
		for(String n: names) {
			System.out.println(n);
		}
		
		//break
		for(int i=0;i<10;i++) {
			System.out.println(i);
			
			if(i==6)
				break;
		}
		
		//continue
		for(int i=0;i<10;i++) {
			
			if(i>3 && i<7)
				continue;
			System.out.println(i);
		}
		
	
		
		
		System.out.println("End");
	}

}
