package Collections.Queue;

import java.util.PriorityQueue;

public class UsePriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(5);
		queue.add(7);
		queue.add(1);
		queue.add(10);
		System.out.println(queue);
	}

}
