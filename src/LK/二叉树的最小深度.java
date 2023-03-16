package LK;

import java.util.ArrayDeque;

/**
 * @className: LK 111 二叉树的最小深度
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/8/5
 **/
public class 二叉树的最小深度 {
    public int minDepth(TreeNode root) {
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        int re=0;
        if (root==null){
            return re;
        }
        deque.addFirst(root);
        while (!deque.isEmpty()){
            re++;
            int n = deque.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = deque.removeLast();
                if (node.right!=null) deque.addFirst(node.right);
                if (node.left!=null) deque.addFirst(node.left);
                if (node.right==null&&node.left==null){
                   return re;
                }
            }
        }
        return re;
    }
}
