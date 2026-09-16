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
    static int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        res = 0;
        helperFunc(root);

        return res;
    }

    public int helperFunc(TreeNode node){
        if(node == null){
            return 0;
        }

        int leftH = helperFunc(node.left);
        int rightH = helperFunc(node.right);

        int sum = leftH + rightH;
        res = Math.max(res , sum);

        return Math.max(leftH , rightH) + 1;
    }
}