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
        int[] maxDiameter = new int[1];

        maxDepth(root, maxDiameter);

        return maxDiameter[0];
    }
    private int maxDepth(TreeNode root, int[] maxDiameter) {
        if (root == null) {
            return 0;
        }

        int ld = maxDepth(root.left, maxDiameter);
        int rd = maxDepth(root.right, maxDiameter);

        int diameter = rd + ld;
        if (diameter > maxDiameter[0]) {
            maxDiameter[0] = diameter;
        }

        return 1 + Math.max(ld, rd);
    }
}
