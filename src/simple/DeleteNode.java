package simple;

import common.ListNode;

/**
 * 剑指 Offer 18. 删除链表的节点
 */
public class DeleteNode {

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        int val = 5;
        new DeleteNode().solution(head,val);
    }

    public ListNode solution(ListNode head, int val) {
        if (head.val == val){
            return head.next;
        }

        while (head.next!=null){
            if (head.next.val==val){
                head.next = head.next.next;
                break;
            }
            head = head.next;
        }

        return head;
    }
}
