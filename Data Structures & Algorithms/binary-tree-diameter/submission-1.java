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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] longestPath = new int[1];

        maxHeight(root, longestPath);

        return longestPath[0];
    }

    public int maxHeight(TreeNode root, int[] longestPath) {
        if (root == null) {
            return 0;
        }
        int leftHeight = maxHeight(root.left, longestPath);
        int rightHeight = maxHeight(root.right, longestPath);

        longestPath[0] = Math.max(longestPath[0], leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
