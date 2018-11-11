package easy;

import tool.TreeNode;

/**
 * @author LiYingChun
 * @date 2018/11/11
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such
 * that adding up all the values along the path equals the given sum.
 *
 * Note: A leaf is a node with no children.
 *
 * https://leetcode.com/problems/path-sum/
 */
public class P112_PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        //wrong code
        //递归终止条件错误
        // if(root==null && sum ==0) return true;
        // else return false;
        // return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);


        if(root == null) return false;
        if(root.left == null && root.right == null && sum==root.val) return true;
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }
}
