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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        helperFunc(list , root);
        return list;
    }

    void helperFunc(List<Integer> list , TreeNode node){

        if(node == null) return;

        helperFunc(list , node.left);

        helperFunc(list , node.right);

        list.add(node.val);
    }
}