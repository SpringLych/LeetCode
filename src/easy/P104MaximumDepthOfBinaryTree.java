package easy;

import tool.TreeNode;

/**
 * @author SpringLych
 * @date 2018/9/27
 */
public class P104MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        else {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }

    // 更快的解决方法

    public int maxDepth2(TreeNode root) {
        int left = 0, right = 0;
        if (root != null){
            left = 1 + maxDepth2(root.left);
            right = 1 + maxDepth2(root.right);
        }
        return Math.max(left,right);
    }
}
