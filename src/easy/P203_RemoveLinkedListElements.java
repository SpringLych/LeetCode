package easy;

import tool.ListNode;

/**
 * @author SpringLych
 * @date 2018/9/27
 */
public class P203_RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        while(head.val == val && head.next != null){
            head = head.next;
        }
        if(head.val == val && head.next == null){
            head = null;
        }
        ListNode pre = new ListNode(-99);
        pre.next = head;
        ListNode cur = head;
        while(cur != null){
            if(cur.val == val){
                pre.next = cur.next;
            }else{
                pre = pre.next;
            }
            cur = cur.next;
        }
        return head;
    }
}
