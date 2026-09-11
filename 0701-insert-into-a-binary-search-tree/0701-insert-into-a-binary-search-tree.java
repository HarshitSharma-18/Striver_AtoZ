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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return helperFunc(root , val);
    }

    public TreeNode helperFunc(TreeNode node , int k){
        if (node == null) {
            node = new TreeNode(k);
            return node;
        }

        if (k < node.val) {
            node.left = insertIntoBST(node.left, k);
        } else {
            node.right = insertIntoBST(node.right, k);
        }

        return node;
    }
}