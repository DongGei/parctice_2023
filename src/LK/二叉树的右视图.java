package LK;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @className: 二叉树的右视图
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/3
 **/
public class 二叉树的右视图 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> re = new ArrayList<>();
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        if (root == null) return re;
        queue.addFirst(root);
        while (!queue.isEmpty()) {
            int n = queue.size();//这个长度反应出来的是每一层的个数
            // 对这层的每一个进行处理，先进队的先处理，处理就是放值和放子节点
            for (int i = 0; i < n; i++) {
                root = queue.removeLast();
                re.add(root.val);
                if(root.right!=null) queue.addFirst(root.right);
            }
        }
        return re;
    }
}
