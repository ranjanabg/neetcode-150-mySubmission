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
    public int goodNodes(TreeNode root) {
        int goodNode = root.val;

        return traversal(root, goodNode);

    }

    public int traversal(TreeNode root, int goodNode) {

        if (root == null) {
            return 0;
        }

        int count = (root.val >= goodNode) ? 1 : 0;
        goodNode = Math.max(root.val, goodNode);

        count += traversal(root.left, goodNode);
        count += traversal(root.right, goodNode);

        return count;
    }
}
