package tool;

/**
 * @author LiYingChun
 * @date 2018/3/23
 */
public class AddNode {
    public ListNode head;
    public void addNode(int val){
        ListNode newNode = new ListNode(val);
        ListNode p = head;
        if (head == null){
            head = newNode;
        }else {
            while (p.next != null){
                p = p.next;
            }
            p.next = newNode;
        }
    }
}
