package easy;

import tool.ListNode;

/**
 * @author 25715
 * @date 2018/10/24
 *
 * Merge two sorted linked lists and return it as a new list. The new list should be made
 * by splicing together the nodes of the first two lists.
 *
 * Example:
 *
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 *
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class P21_MergeTwoSortedLists {
    /**
     * 使用递归的解法
     * @param l1 l1
     * @param l2 l2
     * @return res
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        else if(l2 == null) return l1;
        ListNode res = null;
        // 得到两个链表中值较小的节点，并把它合并到已合并的链表之后
        // 因此合并的过程是重复的，就可以使用递归
        if(l1.val < l2.val){
            res = l1;
            res.next = mergeTwoLists(l1.next, l2);
        }else{
            res = l2;
            res.next = mergeTwoLists(l1,l2.next);
        }
        return res;
    }
}
