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

    TreeNode prev = null;

    TreeNode g1first = null;
    TreeNode g1second = null;

    TreeNode g2first = null;
    TreeNode g2second = null;

    int galat = 0;

    public void recoverTree(TreeNode root) {
        // Find the wrong nodes
        helperFunc(root);

        // Only one violation
        if (galat == 1) {

            int temp = g1first.val;
            g1first.val = g1second.val;
            g1second.val = temp;

        } 
        
        // Two violations
        else {

            int temp = g1first.val;
            g1first.val = g2second.val;
            g2second.val = temp;
        }
    }

    public void helperFunc(TreeNode root){
        if (root == null) {
            return;
        }

        // Left
        helperFunc(root.left);

        // Current node
        if (prev == null) {

            prev = root;

        } else {

            if (root.val < prev.val) {

                if (galat == 0) {

                    g1first = prev;
                    g1second = root;

                    galat++;

                } else {

                    g2first = prev;
                    g2second = root;

                    galat++;
                }
            }

            prev = root;
        }

        // Right
        helperFunc(root.right);
    }
}