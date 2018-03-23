package easy;

import tool.AddNode;
import tool.ListNode;

/**
 * @author LiYingChun
 * @date 2018/3/23
 * 83. Remove Duplicates from Sorted List
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicatesfromSortedList {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        ListNode cNext ;

        while (cur != null){
            cNext = cur.next;
            while (cNext != null && cur.val == cNext.val){
                cNext = cNext.next;
            }
            cur.next = cNext;
            cur = cur.next;
        }
        return head;
    }

    public static void main(String[] args){
        AddNode re = new AddNode();
        re.addNode(1);
        re.addNode(1);
        re.addNode(1);
        re.addNode(2);
        re.addNode(2);
        re.addNode(3);
        re.addNode(3);
        re.addNode(3);
        ListNode head = re.head;
        deleteDuplicates(head);
        while (head != null){
            System.out.print(head.val + "->");
            head = head.next;
        }

    }
}
