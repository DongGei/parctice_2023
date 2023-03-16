package LK;

/**
 * @className: 左叶子之和
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/8/10
 **/
public class 左叶子之和 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root==null){
            return 0;
        }
        int rightNum = sumOfLeftLeaves(root.right);
        int leftNum = sumOfLeftLeaves(root.left);
        if (root.left!=null&&root.left.left==null && root.left.right==null){
            return root.left.val+rightNum+leftNum;
        }
        return 0+rightNum+leftNum;
    }
}
