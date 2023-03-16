package LK;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @className: 二叉树的层序遍历2
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/3
 **/
public class 二叉树的层序遍历2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> re = new ArrayList<>();
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        if (root == null) return null;
        queue.addFirst(root);
        while (queue.isEmpty()) {
            ArrayList<Integer> arraylist = new ArrayList<>();

            int n = queue.size();//这个长度反应出来的是每一层的个数
            // 对这层的每一个进行处理，先进队的先处理，处理就是放值和放子节点
            for (int i = 0; i < n; i++) {
                root = queue.removeLast();
                arraylist.add(root.val);
                queue.addFirst(root.left);
                queue.addFirst(root.right);
            }
            //处理完一层后放到大list里
            re.add(0, arraylist);

        }
        List<List<Integer>> reQ= new ArrayList<>();
        for (int i=re.size();i>0;i--) {
            reQ.add(re.get(i-1));
        }
        return re;
    }
}
