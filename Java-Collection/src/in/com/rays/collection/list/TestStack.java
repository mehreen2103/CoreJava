package in.com.rays.collection.list;

import java.util.Stack;

//LIFO (Last In First Out)
public class TestStack {
	
	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		for (char c = 'a'; c<= 'z';c++) {
			s.push(c);
		}
		System.out.println("Stack: "+ s);
		System.out.println("Peek: "+s.peek());
		System.out.println("Stack: "+ s);
		System.out.println("pop: "+s.pop());
		System.out.println("Stack: "+ s);
		
		System.out.println("---------------------");
		
		Stack s2 = new Stack();
		
		while (!s.isEmpty()) {
			s2.push(s.pop());
		}
		System.out.println("Stack: "+ s);
		System.out.println("s2: "+ s2);
	}

}
