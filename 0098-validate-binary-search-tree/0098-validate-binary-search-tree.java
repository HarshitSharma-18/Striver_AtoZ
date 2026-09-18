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
    static TreeNode prev = null;
    static boolean ans = true;

    public boolean isValidBST(TreeNode root) {
        prev = null;
        ans = true;
        List<Integer> list = new ArrayList<>();
        inOrder(root);
        return ans;
    }


    public void inOrder(TreeNode node){
        if(node == null){
            return;
        }

        inOrder(node.left);
        if(prev == null){
            prev = node;
        }
        else{
            if(node.val <= prev.val){
                ans = false;
            }
            prev = node;
        }
        inOrder(node.right);
    }  
}