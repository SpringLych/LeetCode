package easy;

/**
 * @author SpringLych
 * @date 2018/9/27
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 */
public class P155_MinStack {
    /** initialize your data structure here. */
    private class Node {
        private int data;
        private Node next;
        private int min;

        private Node(int data, Node next, int min) {
            this.data = data;
            this.next = next;
            // 记录当前节点以下的最小值
            this.min = min;
        }
    }

    private Node top;

    public void push(int x) {
        if (top == null) {
            top = new Node(x, top, x);
        } else {
            top = new Node(x, top, Math.min(x, top.min));
        }
    }

    public void pop() {
        top = top.next;
    }

    public int top() {
        return top.data;
    }

    public int getMin() {
        return top.min;
    }

    private class Test {
        private int a = 0;
    }

}
