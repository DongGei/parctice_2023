package LK;

import java.util.ArrayDeque;

/**
 * @className: 226 翻转二叉树
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/8/5
 **/
public class 翻转二叉树 {
    public TreeNode invertTree(TreeNode root) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        if (root == null) return root;
        queue.addFirst(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                root = queue.removeLast();
                swap(root);
                if(root.left!=null) queue.addFirst(root.left);
                if(root.right!=null) queue.addFirst(root.right);
            }

        }
        return root;
    }

    private void swap(TreeNode node){
        TreeNode temp=node.left;
        node.left=node.right;
        node.right=temp;
    }
}
