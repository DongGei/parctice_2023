package LK;

import java.util.ArrayDeque;

/**
 * @className: LK104 二叉树的最大深度
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/8/5
 **/
public class 二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        int re=0;
        if (root ==null){
            return re;
        }
        deque.addFirst(root);
        while (!deque.isEmpty()){
            int size = deque.size();
            re++;
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.removeLast();
                if (node.left!=null) deque.addFirst(node.left);
                if (node.right!=null) deque.addFirst(node.right);
            }
        }
        return re;
    }
}
