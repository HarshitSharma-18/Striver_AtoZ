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
    static boolean ans = true;
    public boolean isBalanced(TreeNode root) {
        ans = true;
        helperFunc(root);
        return ans;
    }

    public int helperFunc(TreeNode node){
        if(node == null){
            return 0;
        }

        int leftH = helperFunc(node.left);
        int rightH = helperFunc(node.right);

        if(Math.abs(leftH - rightH) > 1){
            ans = false;
        }

        return Math.max(leftH , rightH) + 1;
    }
}