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
        inOrder(list , root);

        return isValid(list);
    }


    public void inOrder(List<Integer> list , TreeNode node){
        if(node == null){
            return;
        }

        inOrder(list , node.left);
        list.add(node.val);
        inOrder(list , node.right);
    }  

    public boolean isValid(List<Integer> list){
        for(int i = 0 ; i < list.size()-1 ; i++){
            if(list.get(i) >= list.get(i+1)){
                return false;
            }
        }
        return true;
    } 
}