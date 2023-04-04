package Collections.List;

import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(0);
		list.add(5);
		list.add(9);
		list.add(6);
		
		System.out.println(list);
		list.remove(1);

		
	}

}
