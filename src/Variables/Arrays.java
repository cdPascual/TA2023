package Variables;

public class Arrays {

	public static void main(String[] args) {
		
		//declare and assign array
		int[] array = {4,5,6,7,8,9};
		
		//access array values
		System.out.print(array[0]);
		System.out.print(array[1]);
		System.out.print(array[2]);
		System.out.print(array[3]);
		System.out.print(array[4]);
		System.out.println(array[5]);
		
		//declare array
		int[] array2 = new int[5];
		
		//assign array
		array2[0] = 5;
		array2[1] = 5;
		array2[2] = 5;
		array2[3] = 5;
		array2[4] = 5;
		
		//access array
		System.out.println(array2[4]);
		
		String str1 = "Hello";
		
		String str2;
		
		str2 = "Hola";
		
		String str3 = new String();
		
		str3 = "Howdy";
		
		
		//String concatenation
		System.out.println(str1+"\n"+str2+"\n"+str3+1+4);
		
		
		//string manipulation
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		System.out.println(str1.replace("e", "a"));
		
		System.out.println(str1);
		
		
		
		
	
	}

}
