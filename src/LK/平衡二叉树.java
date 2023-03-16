package LK;

/**
 * @className: LK110平衡二叉树
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/8/9
 **/
public class 平衡二叉树 {
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }
    private Integer getHeight(TreeNode node){
        if (node==null) return 0;
        Integer left = getHeight(node.left);
        if (left==-1) return -1;
        Integer right = getHeight(node.right);
        if (right==-1) return -1;
        return Math.abs(left-right)>1 ? -1: 1+Integer.max(left,right);

    }
}
