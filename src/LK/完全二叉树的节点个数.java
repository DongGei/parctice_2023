package LK;

/**
 * @className: LK222 完全二叉树的节点个数
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/8/9
 **/
public class 完全二叉树的节点个数 {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int right = countNodes(root.right);
        int left = countNodes(root.left);
        return right + left + 1;
    }
}
