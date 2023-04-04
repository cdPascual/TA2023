package Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class UseHashSet {

	public static void main(String[] args) {
		
		HashSet<Integer> set= new HashSet<>();
		
		set.add(5);
		set.add(5);
		set.add(5);
		set.add(5);
		System.out.println(set);
		
		set.add(45);
		set.add(8);
		set.add(6);
		set.add(10);
		System.out.println(set);
		
		HashSet<String> set2= new HashSet<>();
		set2.add("Green Ranger");
		set2.add("Red Ranger");
		set2.add("White Ranger");
		set2.add("Black Ranger");
		System.out.println(set2);
		
		LinkedHashSet<String> set3= new LinkedHashSet<>();
		set3.add("Green Ranger");
		set3.add("Red Ranger");
		set3.add("White Ranger");
		set3.add("Black Ranger");
		System.out.println(set3);
		

	}

}
