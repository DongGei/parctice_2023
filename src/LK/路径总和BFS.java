package LK;

import java.util.ArrayDeque;

/**
 * @className: 路径总和BFS
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/18
 **/
public class 路径总和BFS {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        ArrayDeque<TreeNode> treeQueue = new ArrayDeque<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        if(root==null){
            return false;
        }
        treeQueue.addFirst(root);
        queue.addFirst(root.val);
        while (!treeQueue.isEmpty()) {
            int size = treeQueue.size(); //必须先拿一下
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = treeQueue.removeLast();
                Integer integer = queue.removeLast();
                if (integer == targetSum && treeNode.left==null && treeNode.right==null) {
                    return true;
                }
                if (treeNode.left != null) {
                    treeQueue.add(treeNode.left);
                    queue.add(treeNode.left.val + integer);
                }
                if (treeNode.right != null) {
                    treeQueue.add(treeNode.right);
                    queue.add(treeNode.right.val + integer);
                }


            }
        }
        return false;
    }
}
