package LK;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @className: 二叉树的层平均值
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/4
 **/
public class 二叉树的层平均值 {
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        List<Double> re = new ArrayList<>();
        if (root==null) return re;
        queue.addFirst(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            Double sum=0.0;
            for (int i=0;i<size;i++){
                TreeNode node = queue.removeLast();
                sum+=node.val;
                if (node.left!=null) queue.addFirst(node.left);
                if (node.right!=null) queue.addFirst(node.right);
            }
            double avg=sum/size;
            re.add(avg);
        }
        return re;
    }
}
