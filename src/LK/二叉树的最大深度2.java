package LK;

/**
 * @className: LK104 二叉树的最大深度2
 * @description: 解法2
 * @author: Dong
 * @date: 2022/8/7
 **/
public class 二叉树的最大深度2 {
    public int maxDepth(TreeNode root) {
        if (root==null) return 0;
        int depthLeft = maxDepth(root.left); //左
        int depthRight = maxDepth(root.right); //右
        return Integer.max(depthLeft,depthRight)+1;//中
    }
}
