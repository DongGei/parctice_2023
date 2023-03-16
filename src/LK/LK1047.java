package LK;

import java.util.ArrayDeque;
import java.util.Deque;


public class LK1047 {
	public String removeDuplicates(String s) {
		Deque<Character> deque =new ArrayDeque<Character>();
		StringBuffer stringBuffer = new StringBuffer();
		for(int i = 0; i<s.length();i++) {
			if (deque.isEmpty()) {
				deque.add(s.charAt(i));
			}else {
				if (deque.getFirst() != s.charAt(i)) {
					deque.addFirst(s.charAt(i));
				}else {
					deque.removeFirst();
				}
			}
			
		}
		for (int i = deque.size(); i >0; i--) {
			stringBuffer.append(deque.removeLast());
		}
		return stringBuffer.toString();
    }
}
