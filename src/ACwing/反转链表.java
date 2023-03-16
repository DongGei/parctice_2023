package ACwing;



/**
 * @className: 反转链表
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/10
 **/
public class 反转链表 {
    public ListNode reverseList(ListNode head) {
        if(head == null||head.next == null){
            return head;
        }
        ListNode per=null;
        ListNode cur=head;
        ListNode aft=cur.next;
        while (true){
            cur.next=per;
            per=cur;
            cur=aft;
            aft=aft.next;
            if(aft==null){
                cur.next=per;
                break;
            }
        }
        return cur;
    }
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
 }




