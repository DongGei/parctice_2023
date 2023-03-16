package LK;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: LK589 N叉树的前序遍历
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/8/5
 **/


public class N叉树的前序遍历 {

    public List<Integer> preorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        order(root, list);
        return list;
    }

    private void order(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        List<Node> children = root.children;
        for (int i = 0; i < children.size(); i++) {
            Node node = children.get(i);
            order(node, list);
        }
    }


    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<LK.Node> _children) {
            val = _val;
           // children = _children;
        }
    }
}