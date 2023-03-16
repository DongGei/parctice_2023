package LK;

import java.util.ArrayDeque;

/**
 * @className: LK117 填充每个节点的下一个右侧节点指针II
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/8/3
 **/
public class 填充每个节点的下一个右侧节点指针II {
    public Node connect(Node root) {
        if (root == null) return null;
        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.add(root);
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
