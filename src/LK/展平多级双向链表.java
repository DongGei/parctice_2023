package LK;

/**
 * @className: 展平多级双向链表
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/21
 **/
public class 展平多级双向链表 {
    public Node flatten(Node head) {
        dfs(head);
        return head;
    }

    private Node dfs(Node node) {
        Node per=null;//node的前一个 表示最后一个结点
        while (node != null) {
            Node temp=null;//保存有子结点的下一个 方便调用
            if (node.child!=null){
                temp=node.next;
                node.next= node.child;
                node.child.prev=node;
                node.child=null;
                Node dfs = dfs(node.next);
                dfs.next=temp;
                if (temp!=null){
                    temp.prev=dfs;
                }

            }
             per=node;
            node=node.next;
        }
        return per;
    }
















    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }

    ;
}
