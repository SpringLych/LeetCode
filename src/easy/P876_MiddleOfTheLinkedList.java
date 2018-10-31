package easy;

import tool.ListNode;

import java.util.HashMap;

/**
 * @author 25715
 * @date 2018/10/31
 *
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 *
 * If there are two middle nodes, return the second middle node.
 *
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class P876_MiddleOfTheLinkedList {
    /*
    使用HashMap，键为链表的第几个节点的索引，值为对应的链表节点
     */
    public ListNode middleNode(ListNode head) {
        if(head == null) return null;
        HashMap<Integer, ListNode> map = new HashMap<>();
        int ind = 0;
        while(head!=null){
            map.put(ind++,head);
            head = head.next;
        }
        return map.get(ind/2);
    }

    /*
    一种通用的查找链表中点的解法
     */
    public ListNode middleNodeFast(ListNode head) {
        //mid为起点到full的中点
        ListNode mid = head, ful = head;
        while(ful != null && ful.next != null){
            mid = mid.next;
            ful = ful.next.next;
        }
        return mid;
    }
}
