package in.com.rays.collection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
	
	public static void main(String[] args) {
		
		Queue q = new PriorityQueue();
		
		q.offer(1);
		q.offer(2);
		q.offer(10);
		q.offer(8);
		
		System.out.println("q: "+ q);
		System.out.println(q.peek());
	}

}
