package ACwing;

/**
 * @className: 反转链表递归
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/10
 **/
public class 反转链表递归 {
    //看了官方题解 只能说非常巧妙
    public ListNode reverseList(ListNode head) {
        // head==null 说明本身就是空表 可以返回了
        // head.next == null 这是停止递归的条件
        if (head==null || head.next == null) {
            return head;
        }
        //不到表的最后 就一直往下走 表结构一直没变动
        //到了表的最后 把新的表头也就是原来的表尾结点return出来
        ListNode newHead = reverseList(head.next);
        //当前节点的下一个节点指向当前节点  c-->b
        head.next.next = head;
        //当前节点的下一个应该是null  b-->null
        // 这里保证了新表的最后一个指向null
        head.next = null;
        return newHead;
    }



    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
