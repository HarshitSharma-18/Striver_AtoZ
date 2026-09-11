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
    TreeNode ans = null;

    public TreeNode searchBST(TreeNode root, int val) {
        helperFunc(root , val);
        return ans;
    }

    public void helperFunc(TreeNode node , int k){
        if(node == null) return;
        if(node.val == k){
            ans = node;
            return;
        }

        if(node.val > k){
            helperFunc(node.left , k);
        }
        else{
            helperFunc(node.right , k);
        }
    }
}