package LK;

import java.util.ArrayDeque;

/**
 * @className: 用栈实现队列
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/6/5
 **/
public class 用栈实现队列 {

    private ArrayDeque<Integer> s1; //in
    private ArrayDeque<Integer> s2; //out

    public 用栈实现队列() {
        s1=new ArrayDeque<>();
        s2=new ArrayDeque<>();
    }

    public void push(int x) {
        s1.addFirst(x);
    }

    public int pop() {
        if (s2.isEmpty()){
            f();
        }
       return s2.removeFirst();
    }

    public int peek() {
        if (s2.isEmpty()){
            f();
        }
        return s2.getFirst();
    }

    public boolean empty() {
        return s1.isEmpty()&&s2.isEmpty();
    }
    private void f(){
        while (!s1.isEmpty()){
            s2.addFirst(s1.removeFirst());
        }
    }
}
