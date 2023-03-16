package LK;

import java.util.ArrayDeque;

/**
 * @className: 116填充每个节点的下一个右侧节点指针
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/8/2
 **/
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
public class 填充每个节点的下一个右侧节点指针 {

    public Node connect(Node root) {
        if(root==null) return null;
        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.addFirst(root);
        while (!deque.isEmpty()){
            int size = deque.size();
            Node per=null;
            for (int i = 0; i < size; i++) {
                Node node = deque.removeLast();
                if (node.left!=null) deque.addFirst(node.left);
                if (node.right!=null)deque.addFirst(node.right);
                if (per!=null){
                    per.next=node;
                }
                per=node;
            }
        }
        return root;
    }

}
