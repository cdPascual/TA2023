package nestedClass;

public class TestOuter {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.inner.innerMethod();
		
		
		//you cannot create an object of inner from outside the outer class
		//you must create the object inside the outer class
		//then call the object from outside the outer class.
		/*Inner inner = new Inner();*/
		
		
		
	}

}
