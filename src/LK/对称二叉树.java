package LK;

/**
 * @className: LK101 对称二叉树
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/8/6
 **/
public class 对称二叉树 {
    public boolean isSymmetric(TreeNode root) {
        return compare(root.left,root.right);
    }
    public boolean compare(TreeNode left,TreeNode right){
        if (left==null && right == null){
            return true;
        }else if (left==null || right==null){
            return false;
        }else if (left.val!=right.val){
            return false;
        }else {
            boolean compare1 = compare(left.left, right.right);
            boolean compare = compare(left.right, right.left);
            return compare && compare1;
        }

    }
}
