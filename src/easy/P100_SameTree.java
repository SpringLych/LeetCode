package easy;

import tool.TreeNode;

/**
 * @author LiYingChun
 * @date 2018/11/11
 *
 * Given two binary trees, write a function to check if they are the same or not.
 *
 * Two binary trees are considered the same if they are structurally identical and
 * the nodes have the same value.
 *
 * https://leetcode.com/problems/same-tree
 */
public class P100_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val==q.val){
            return isSameTree(p.left, q.left) && isSameTree(p.right,q.right);
        }
        return false;
    }
}
