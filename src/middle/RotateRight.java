package middle;

import common.ListNode;

/**
 * 61. 旋转链表
 * @author zhoujl
 */
public class RotateRight {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode temp = new RotateRight().solution(head,11);
        while (temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public ListNode solution(ListNode head, int k) {
        int listLength = getListLength(head);
        if(listLength==0){
            return head;
        }
        int tip = k%listLength;
        if (tip==0){
            return head;
        }
        int startNodeIndex = listLength -tip+1;
        ListNode temp = head;
        int i=1;
        while (i<startNodeIndex-1){
            temp = temp.next;
            i++;
        }
        ListNode newHead = temp.next;
        ListNode lastNode = temp;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = head;
        lastNode.next = null;
        return newHead;
    }

    public int getListLength(ListNode head){
        int length = 0;
        ListNode temp = head;
        while (temp!=null){
            length ++;
            temp = temp.next;
        }
        return length;
    }
}
