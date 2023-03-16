package LK;

import java.util.*;

/**
 * @className: LK145
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/3/6
 **/
public class LK145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        if (root == null){
            return result;
        }
        stack.addFirst(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.removeFirst();
            result.add(cur.val);
            if (cur.left != null){
                stack.addFirst(cur.left);
            }
            if (cur.right != null){
                stack.addFirst(cur.right);
            }
        }
        Collections.reverse(result);
        return  result;
    }
}
