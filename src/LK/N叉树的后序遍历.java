package LK;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: LK590 N叉树的后序遍历
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/8/6
 **/
public class N叉树的后序遍历 {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        oredr(root,list);
        return list;
    }

    private void oredr(Node root, ArrayList<Integer> list) {
        if (root==null){
            return;
        }
        List<Node> children = root.children;
        for (int i = 0; i < children.size(); i++) {
            Node node = children.get(i);
            oredr(node,list);
        }
        list.add(root.val);
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
