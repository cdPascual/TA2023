package nestedClass;

public class Outer {
	
	Inner inner = new Inner();
	
	int outerNum = 5;

	public void outerMethod() {
		
	}
	
	Outer(){
		
	}
	
	class Inner{
		
		int innerNum = 10;
		
		Inner(){
			
		}
		
		public void innerMethod() {
			
		}
		
	}
}
