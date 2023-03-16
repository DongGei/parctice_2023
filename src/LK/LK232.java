package LK;

import java.util.ArrayDeque;
import java.util.Deque;

public class LK232 {
	Deque<Integer> stack_in = new ArrayDeque<Integer>();
	Deque<Integer> stack_out = new ArrayDeque<Integer>();
	public LK232() {
	
    }
    
    public void push(int x) {
    	stack_in.addFirst(x);
    }
    
    public int pop() {
    	//一个空的队列不会调用 pop 或者 peek 操作
    	if (stack_out.isEmpty()) {
			while(!stack_in.isEmpty()) {
				stack_out.addFirst(stack_in.removeFirst());
			}
			return stack_out.removeFirst();
		}else {
			return stack_out.removeFirst();
		}
    }
    
    public int peek() {
    	if (stack_out.isEmpty()) {
			while(!stack_in.isEmpty()) {
				stack_out.addFirst(stack_in.removeFirst());
			}
			return stack_out.getFirst();
		}else {
			return stack_out.getFirst();
		}
    }
    
    
    public boolean empty() {
    	return stack_in.isEmpty()&& stack_out.isEmpty();
    }
    public static void main(String[] args) {
    	LK232 myQueue =new LK232();
    	myQueue.push(1); // queue is: [1]
    	myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
    	myQueue.peek(); // return 1
    	myQueue.pop(); // return 1, queue is [2]
    	myQueue.empty(); // return false

    	
    }
}
