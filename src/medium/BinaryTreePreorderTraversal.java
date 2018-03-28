package medium;

import tool.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author LiYingChun
 * @date 2018/3/28
 * 144. Binary Tree Preorder Traversal
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * For example:
 * Given binary tree [1,null,2,3],
 * 1
 * \
 * 2
 * /
 * 3
 * return [1,2,3].
 * Note: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        TreeNode p = root;
        LinkedList<Integer> list = new LinkedList<>();
        Stack<TreeNode> st = new Stack<>();
        while (!st.empty() || p != null) {
            while (p != null) {
                list.add(p.val);
                st.push(p);
                p = p.left;
            }
            if (!st.empty()) {
                p = st.pop();
                p = p.right;
            }
        }
        return list;
    }
}
