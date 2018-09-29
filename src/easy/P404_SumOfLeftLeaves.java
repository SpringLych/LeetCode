package easy;

import tool.TreeNode;

/**
 * @author SpringLych
 * @date 2018/9/29
 * <p>
 * Find the sum of all left leaves in a given binary tree.
 * <p>
 * Example:
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * <p>
 * There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 * <p>
 * https://leetcode.com/problems/sum-of-left-leaves/description/
 */
public class P404_SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        return sumLeft(root);
    }

    /**
     * 使用递归解决
     * @param node node
     * @return res
     */
    private int sumLeft(TreeNode node){
        if(node == null) return 0;
        int res = 0;
        if(node.left != null){
            if(node.left.left == null && node.left.right == null){
                res += node.left.val;
            }else{
                res += sumLeft(node.left);
            }
        }
        res += sumLeft(node.right);
        return res;
    }
}
