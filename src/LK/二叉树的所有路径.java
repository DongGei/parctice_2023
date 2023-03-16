package LK;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @className: 二叉树的所有路径
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/6/17
 **/
public class 二叉树的所有路径 {
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> re = new ArrayList<>();
        if (root == null) {
            return re;
        }
        ArrayDeque<Object> stack = new ArrayDeque<>();
        stack.addFirst(root);
        stack.addFirst(root.val + "");
        while (!stack.isEmpty()) {
            String s = (String) stack.removeFirst();
            TreeNode node = (TreeNode) stack.removeFirst();
            if (node.left != null) {
                stack.addFirst(node.left);
                stack.addFirst(s + "->" + node.left.val);

            }
            if (node.right != null) {
                stack.addFirst(node.right);
                stack.addFirst(s + "->" + node.right.val);

            }
            if (node.left == null && node.right == null) {
                re.add(s);
            }
        }
        return re;
    }
}
