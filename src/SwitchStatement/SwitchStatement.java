package SwitchStatement;

public class SwitchStatement {

	public static void main(String[] args) {


		//Switch
		String day = "Wed";
		
		switch(day) {
			case "Sun":
				System.out.println("This is the first day");
				//break;
			case "Mon":
				System.out.println("This is the worst day");
				//break;
			case "Tue":
				System.out.println("This is an insignificant day");
				//break;
			case "Wed":
				System.out.println("This is Hump day");
				//break;
			case "Thu":
				System.out.println("This is the most hopeful");
				//break;
			case "Fri":
				System.out.println("This is the first good day");
			//	break;
			case "Sat":
				System.out.println("This is the best day");
			//	break;
			default:
				System.out.println("This entry is invalid");
				
			
			
		
		}
	}

}
