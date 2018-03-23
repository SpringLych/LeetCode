package easy;

import tool.ListNode;

/**
 * @author LiYingChun
 * @date 2018/3/23
 * 206. Reverse Linked List
 */
public class ReverseLinkedList {
    /**
     *
     * @param head 头结点
     * @return cur 翻转之后的头结点
     */
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
