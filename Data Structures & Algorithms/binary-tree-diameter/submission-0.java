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

        findMaxHeight(root, longestPath);

        return longestPath[0];
    }

    public int findMaxHeight(TreeNode root, int[] longestPath) {
        if (root == null) {
            return 0;
        }

        int leftDepth = findMaxHeight(root.left, longestPath);
        int rightDepth = findMaxHeight(root.right, longestPath);

        longestPath[0] = Math.max(longestPath[0], leftDepth + rightDepth);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}
