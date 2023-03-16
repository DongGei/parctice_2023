package LK;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @className: N叉树的层序遍历
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/15
 **/
public class N叉树的层序遍历 {
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return null;
        }
        ArrayDeque<Node> queue = new ArrayDeque<Node>();
        List<List<Integer>> re = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                Node node = queue.removeLast();
                list.add(node.val);
                for (Node child : node.children) {
                    if (child != null) {
                        queue.addFirst(child);
                    }
                }
                re.add(list);
            }
        }
        return re;
    }


    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
