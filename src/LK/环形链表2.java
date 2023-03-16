package LK;

/**
 * @className: 环形链表2
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/15
 **/
public class 环形链表2 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(true){
            if(fast ==null||fast.next==null){
                return null;
            }
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                ListNode per=head;
                while(per!=slow){
                    per=per.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
    }

}
