package LK;

/**
 * @className: LK160
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/4/24
 **/
public class LK160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p =headB;
        if (headA==null || headA == null){
            return null;
        }
        while (headA!=null){
            while (p !=null){
                if (headA == p)
                {
                    return headA;
                }
                p=p.next;
            }
            p=headB;
            headA=headA.next;
        }
        return null;
    }
}
