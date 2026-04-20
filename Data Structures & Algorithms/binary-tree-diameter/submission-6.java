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
    
    public int diameterOfBinaryTree(final TreeNode root) {
        int[] maxDiameter = new int[1];
        depth(root, maxDiameter);
        
        return maxDiameter[0];        
    }

    public int depth(final TreeNode root, int[] maxDiameter) {
        if (root == null) {
            return 0;
        }

        int l = depth(root.left, maxDiameter);
        int r = depth(root.right, maxDiameter);

        // core
        maxDiameter[0] = Math.max(maxDiameter[0], l + r);

        return 1 + Math.max(l, r);
    }
}
