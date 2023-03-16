package LK;

/**
 * @className: LK572 另一棵树的子树
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/8/10
 **/
public class 另一棵树的子树 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return true;   // t 为 null 一定都是 true
        if (subRoot == null) return false;  // 这里 t 一定不为 null, 只要 s 为 null，肯定是 false
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot) || isSameTree(root, subRoot);

    }

    private boolean isSameTree(TreeNode l, TreeNode r) {
        if (l == null && r == null) {
            return true;
        } else if (l == null || r == null) {
            return false;
        } else if (l.val != r.val) {
            return false;
        } else {
            return isSameTree(l.left, r.left) && isSameTree(l.right, r.right);
        }
    }
}




