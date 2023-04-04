package Objects;

public class House {
	
	/*
	 Accessabilty modifiers that control access to fields and methods
	 default: allows access within the same package
	 private: allows access within the same class only
	 protected: coming soon
	 public: allow access from outside package
	 
	 Class can be public or default. It cannot be private or protected
	 */
	
	// Final is a Non access modifier
	
	//Static attributes belong to the class
	//non static attributes belong to the object;
	//Static methods use only static variables. 
	//Non static methods can use both static and non static variables.
	//you can call static attributes without creating an object because the attributes belong to the class.
	
	private int length;
	private int width;
	private String color;
	private int rooms;
	
	//Constructors
	
	//default constructor
	House(){
	}
	
	//Build constructor
	House(String n,int a){
		rooms = a;
		color = n;
	}
	
	//Setters
	public void setLength(){
		
	}
	
	public void setWidth(){
		
	}
	
	//Getters
	public int getLength(){
		return length;
	}
	
	public int getWidth(){
		return width;
	}
	
	void room() {
		
	}
	
	void bathRoom() {
			
	}
	
	void LivingRoom() {
		
	}
	
	void kitchen() {
		
	}

}
