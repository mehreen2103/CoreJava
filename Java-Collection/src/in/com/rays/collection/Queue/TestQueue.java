package in.com.rays.collection.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueue {
	
	public static void main(String[] args) {
		
	Queue q = new ArrayDeque();
	
	for (char c = 'a'; c <='z';c++) {
		q.offer(c);
	}
	
	System.out.println("q: "+ q);
	System.out.println("peek: "+ q.peek());
	System.out.println("q: "+q);
	System.out.println("poll: "+ q.poll());
	System.out.println("q: "+q);
	
	System.out.println("------------");
	
	while (!q.isEmpty()) {
		System.out.println(q.poll());
		
	}
	System.out.println("q: "+ q);
	}

}
