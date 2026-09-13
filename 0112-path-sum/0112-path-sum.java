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
    static boolean ans = false;
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        ans = false;
        helperFunc(root , 0 , targetSum);
        return ans;
    }

    public static void helperFunc(TreeNode node, int sum , int targetSum){
        if (node == null) {
            return;
        }

        sum = sum + node.val;

        if(node.left == null && node.right == null){
            if(sum == targetSum){
                ans = true;
            }
            return;
        }

        if(!ans){
            helperFunc(node.left , sum , targetSum);
        }
        if(!ans){
            helperFunc(node.right , sum , targetSum);
        }
    }
}