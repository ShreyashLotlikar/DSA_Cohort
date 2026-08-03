package org.dsa.Week9;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

// 2-Aug-26 (Sunday)
// trees
public class day16 {
    public static void main(String[] args) {

        // https://leetcode.com/problems/binary-tree-preorder-traversal/description/
        // preorderTraversal

        // Queue is used for level order traversal

        // https://leetcode.com/problems/maximum-depth-of-binary-tree/
        // maxDepth

        // https://leetcode.com/problems/balanced-binary-tree/
        // isBalanced

        //https://leetcode.com/problems/symmetric-tree/description/
        // isSymmetric

        //https://leetcode.com/problems/diameter-of-binary-tree/description/
        // diameterOfBinaryTree

    }
    /*
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }
    int height(TreeNode node) {
        if (node == null) return 0;
        int left = height(node.left);
        int right = height(node.right);
        diameter = Math.max(diameter, left+right);
        return 1 + Math.max(left, right);
    }
    */
    /*
    public boolean isSymmetric(TreeNode root) {
        return root == null || isMirror(root.left, root.right);
    }
    boolean isMirror(TreeNode a,TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return a.val == b.val
            && isMirror(a.left, b.right)
            && isMirror(a.right, b.left);
    }
    */
    /*
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }
    int checkHeight(TreeNode node) {
        if (node == null) return 0;

        int left = checkHeight(node.left);
        if (left == -1) return -1;

        int right = checkHeight(node.right);
        if (right == -1) return -1;

        if (Math.abs(left-right) > 1) return -1;
        return 1 + Math.max(left, right);
    }
    */
    /*
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));

    }
    */
    /*public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        ans.add(root.val);
        List<Integer> lst = preorderTraversal(root.left); // lst -> 2 4 5 6 7
        List<Integer> rst = preorderTraversal(root.right); // rst -> 3 9 9

        ans.addAll(lst);
        ans.addAll(rst);

        return ans;
    }*/
}
