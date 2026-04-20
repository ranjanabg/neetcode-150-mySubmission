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
        int maxVal = root.val;

        return preOrder(root, maxVal);
    }

    public int preOrder(TreeNode root, int maxVal) {
        if (root  == null) {
            return 0;
        }

        int result = root.val >= maxVal ? 1 : 0;
        maxVal = Math.max(root.val, maxVal);

        result += preOrder(root.left, maxVal);
        result += preOrder(root.right, maxVal);

        return result;
    }
}
