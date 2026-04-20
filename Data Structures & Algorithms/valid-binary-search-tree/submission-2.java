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
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        inOrderTraversal(root, list);

        int i = 0;
        while (i < list.size() - 1) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            } else {
                i++;
            }
        }

        return true;
    }

    public void inOrderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left, list);
        list.add(root.val);
        inOrderTraversal(root.right, list);
    }
}
