package LK;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @className: LK094
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/3/6
 **/
public class LK094 {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack =new ArrayDeque<>();
        if (root == null){
            return result;
        }
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()){
            if (cur !=null){
                stack.addFirst(cur);
                cur = cur.left;
            }else {
                cur = stack.removeFirst();
                result.add(cur.val);
                cur=cur.right;
            }
        }
        return result;
    }
}
