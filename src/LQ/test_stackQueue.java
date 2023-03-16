package LQ;

import java.util.ArrayDeque;
import java.util.Deque;

public class test_stackQueue {
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<Integer>(); 
		deque.add(1);
		deque.add(2);
		deque.add(3);
		
		deque.addFirst(4);
		int i =deque.getFirst();
		System.out.println(i);
		 i =deque.getLast();
		System.out.println(i);
		
		 i =deque.removeLast();
		System.out.println(i);
		 i =deque.getLast();
		System.out.println(i);
	}
}
