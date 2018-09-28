package easy;

import tool.TreeNode;

/**
 * @author SpringLych
 * @date 2018/9/28
 */
public class P226_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    private void invert(TreeNode node){
        if(node == null) return;
        TreeNode tmp = null;
        tmp = node.left;
        node.left = node.right;
        node.right = tmp;
        invertTree(node.left);
        invertTree(node.right);
    }
}
