package easy;

import tool.TreeNode;

/**
 * @author SpringLych
 * @date 2018/9/27
 */
public class P110_BalancedBinaryTree {
    /**
     * 判断AVl是否平衡的方法，采用递归，时间复杂度高
     *
     * @param root root
     * @return boolean
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int cmp = height(root.left) - height(root.right);
        if (cmp > 1 || cmp < -1) return false;
        else return isBalanced(root.left) && isBalanced(root.right);
    }

    private int height(TreeNode node) {
        int left = 0, right = 0;
        if (node != null) {
            left = 1 + height(node.left);
            right = 1 + height(node.right);
        }
        return left > right ? left : right;
    }
}
