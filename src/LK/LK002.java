package LK;

/**
 * @className: LK002
 * @description: 两数相加
 * @author: Dong
 **/
public class LK002 {
    public ListNode1 addTwoNumbers(ListNode1 l1, ListNode1 l2) {
        ListNode1 p = new ListNode1();
        ListNode1 re = p;
        int jw = 0;
        while (l1 != null || l2 != null) {
            int a = 0, b = 0;
            if (l1 == null) {
                b = l2.val;
            } else if (l2 == null) {
                a = l1.val;
            } else {
                a = l1.val;
                b = l2.val;
            }
            int i = a + b + jw;
            jw = i / 10;

            ListNode1 node = new ListNode1();
            p.next = node;
            p = p.next;
            p.val=i%10;

            if (l1!=null){
                l1 = l1.next;
            }
            if (l2!=null){
                l2 = l2.next;
            }
        }
        if(jw==1){
            ListNode1 node = new ListNode1();
            p.next = node;
            p = p.next;
            p.val=1;
        }
        return re.next;
    }

}

class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1() {
    }

    ListNode1(int val) {
        this.val = val;
    }

    ListNode1(int val, ListNode1 next) {
        this.val = val;
        this.next = next;
    }
}