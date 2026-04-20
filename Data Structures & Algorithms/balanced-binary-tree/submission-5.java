/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    
    public boolean isBalanced(TreeNode root) {
        boolean[] balanced = new boolean[1];
        balanced[0] = true;

        depth(root, balanced);

        return balanced[0];
    }

    public int depth(TreeNode root, boolean[] balanced) {
        if (root == null) {
            return 0;
        }

        int l = depth(root.left, balanced);
        int r = depth(root.right, balanced);

        if (balanced[0] && Math.abs(l - r) > 1) {
            balanced[0] = false;
        }

        return 1 + Math.max(l, r);
    }
}
