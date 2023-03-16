package LK;

import java.util.Stack;

public class LK020 {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            char[] chars = s.toCharArray();
            for (char c : chars) {
                if(c=='('||c== '{'||c=='['){
                    stack.push(c);
                }else {
                    if(stack.empty()) return false; // chars 还没循环结束已经没有左括号去匹配  eg:如果 s="}" 应该返回false
                    if (c==')'&& stack.pop()!='(') return false;
                    if (c=='}'&& stack.pop()!='{') return false;
                    if (c==']'&& stack.pop()!='[') return false;

                }
            }
            return stack.empty();
        }
    }
}
