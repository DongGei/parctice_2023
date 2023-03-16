package LK;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @className: 在每个树行中找最大值
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/15
 **/
public class 在每个树行中找最大值 {
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> re = new ArrayList<>();
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        if (root==null){
            return  re;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            int n = queue.size();
            int max=Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.removeLast();
                max =Math.max(max,node.val);
                if (node.left!=null) queue.addFirst(node.left);
                if (node.right!=null) queue.addFirst(node.right);
            }
            re.add(max);
        }
       return  re;

    }







    public class TreeNode {
     int val;
     TreeNode left;
      TreeNode right;
     TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
