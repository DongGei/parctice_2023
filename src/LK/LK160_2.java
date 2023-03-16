package LK;

/**
 * @className: LK160_2
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/4/24
 **/
public class LK160_2 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }
        ListNode p1 = headA;
        ListNode p2 = headB;
        int n1 = 1, n2 = 1;
        while (p1 != null) {
            p1 = p1.next;
            n1++;
        }
        while (p2 != null) {
            p2 = p2.next;
            n2++;
        }
        int n3 = Math.abs(n1 - n2);
        p1 = headA;
        p2 = headB;
        if (n1 >= n2) {
            for (int i = 0; i < n3; i++) {
                p1 = p1.next;
            }
            while (p1 != null) {
                if (p1 == p2) {
                    return p1;
                }
                p1 = p1.next;
                p2 = p2.next;
            }
            return null;
        } else {
            for (int i = 0; i < n3; i++) {
                p2 = p2.next;
            }
            while (p1 != null) {
                if (p1 == p2) {
                    return p1;
                }
                p1 = p1.next;
                p2 = p2.next;
            }
            return null;
        }
    }
}
