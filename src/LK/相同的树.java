package LK;

import java.util.ArrayDeque;
import java.util.LinkedList;

/**
 * @className: LK100 相同的树
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/8/6
 **/
public class 相同的树 {
    //思想：前序遍历
    public boolean isSameTree(TreeNode p, TreeNode q) {

       LinkedList<TreeNode> deque = new LinkedList<>();
       //需要使用LinkedList 模拟队列,ArrayDeque是不允许add null的。
       // ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        deque.addFirst(p);
        deque.addFirst(q);
        while (!deque.isEmpty()) {
            TreeNode l = deque.removeFirst();
            TreeNode r = deque.removeFirst();
            if (l==null&&r==null){
                continue;
            }
            if (l==null||r==null){
                return false;
            }
            if (l.val != r.val) {
                return false;
            }
            deque.addFirst(l.right); //ArrayDeque是不允许add在这里会报错 走不到下一次的l==null&&r==null
            deque.addFirst(r.right);
            deque.addFirst(l.left);
            deque.addFirst(r.left);
        }
        return true;
    }
}
