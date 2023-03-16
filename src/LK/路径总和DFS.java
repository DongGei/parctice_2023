package LK;

/**
 * @className: 路径总和DFS
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/18
 **/
public class 路径总和DFS {
    //DFS
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root==null){
            //空树
            return false;
        }
        if (root.right==null&&root.left==null){
            //是叶子节点
            //看叶子节点的值 是不是我们期待的值
            return root.val==targetSum;
        }
        //不是叶子节点向下递归
        //给节点 和我们期待的值
        return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum-root.val);
    }
}
