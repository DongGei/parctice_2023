package LK;

import java.util.ArrayDeque;
import java.util.Deque;

public class LK150 {
	public static int evalRPN(String[] tokens) {
        Deque<String> deque = new ArrayDeque<String>();
        for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].equals("+") || tokens[i].equals("-") || 
					tokens[i].equals("*") || tokens[i].equals("/")) {
				int num=0;
				int a = Integer.parseInt(deque.removeFirst());
				int b = Integer.parseInt(deque.removeFirst());
				if (tokens[i].equals("+")) {
					num=a+b;
				}else if (tokens[i].equals("-")) {
					num=a-b;
				}else if (tokens[i].equals("*") ) {
					num=a*b;
				}else if (tokens[i].equals("/")) {
					//这里要注意 不是a/b哦
					num=b/a;
				}
				deque.addFirst(String.valueOf(num));
			}else {
				deque.addFirst(tokens[i]);
			}
		}
        return Integer.parseInt(deque.getFirst());
    }
	public static void main(String[] args) {
		String[] tStrings =new String[]{"4","13","5","/","+"};
		System.out.println(evalRPN(tStrings));
	}
}
