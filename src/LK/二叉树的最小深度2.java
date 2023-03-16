package LK;

/**
 * @className: 二叉树的最小深度2
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/8/7
 **/
public class 二叉树的最小深度2 {
    public int minDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        int leftDepth = minDepth(root.left);           // 左
        int rightDepth = minDepth(root.right);         // 右
                                                        // 中
        // 当一个左子树为空，右不为空，这时并不是最低点
        if (root.left == null && root.right != null) {
            return 1 + rightDepth;
        }
        // 当一个右子树为空，左不为空，这时并不是最低点
        if (root.left != null && root.right == null) {
            return 1 + leftDepth;
        }
        int result = 1 + Integer.min(leftDepth, rightDepth);
        return result;
    }


}
