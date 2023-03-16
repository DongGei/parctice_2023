package LK;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @className: 二叉搜索树迭代器
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/6/3
 **/
public class 二叉搜索树迭代器 {
    private int index;
    private List<Integer> list;

    public 二叉搜索树迭代器(TreeNode root) {
        index = 0;
        list = new ArrayList<>();
        inorder(root, list);
    }

    public int next() {
        return list.get(index++);
    }

    public boolean hasNext() {
        return index<list.size();
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root.left != null) inorder(root.left, list);
        list.add(root.val);
        if (root.right != null) inorder(root.right, list);
    }
}
