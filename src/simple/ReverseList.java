package simple;

import common.ListNode;

/**
 * 反转链表
 */
public class ReverseList {
    public static void main(String[] args) {
        ListNode param = new ListNode(1);
        param.next=new ListNode(2);
        param.next.next=new ListNode(3);
        param.next.next.next=new ListNode(4);
        param.next.next.next.next=new ListNode(5);
        solution(param);
    }

    public static ListNode solution(ListNode head){
        ListNode result = new ListNode(-1);

        while (head!=null){
            if (result.next==null){
                result.next = new ListNode(head.val);
            }else{
                ListNode temp = new ListNode(head.val);
                temp.next = result.next;
                result.next = temp;
            }

            head = head.next;
        }
        return result.next;
    }
}
