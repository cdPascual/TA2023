package Collections.List;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(0);
		list.add(5);
		list.add(9);
		list.add(6);
		list.add("jack");
		list.add(true);
		
		list.forEach((n)->System.out.println(n));
		
		System.out.println(list);
		
		System.out.println(list.size());
		ArrayList<Integer> list2 = new ArrayList<>();
		

	}

}
