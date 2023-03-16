package LK;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @className: LK144_2
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/3/6
 **/
public class LK144_2 {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack_deque = new ArrayDeque<>();
        stack_deque.addFirst(root);
        while (!stack_deque.isEmpty()) {
            TreeNode node = stack_deque.removeFirst();
            result.add(node.val);
            if (node.right != null){
                stack_deque.addFirst(node.right);
            }
            if (node.left != null){
                stack_deque.addFirst(node.left);
            }
        }
        return result;
    }
}
