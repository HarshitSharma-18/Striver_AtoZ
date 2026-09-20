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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        
        if(key > root.val){
            root.right = deleteNode(root.right , key);
        }
        else if(key < root.val){
            root.left = deleteNode(root.left , key);
        }
        else{
            if(root.left == null && root.right == null) return null;

            if(root.left == null){
                return root.right;
            }
            else if(root.right ==  null){
                return root.left;
            }
            else{
                TreeNode iS = inorderSuccessor(root.right);
                root.val = iS.val;
                root.right = deleteNode(root.right , iS.val);
            }
        }

        return root;
    }

    public TreeNode inorderSuccessor(TreeNode node){
        if(node.left == null){
            return node;
        }
        return inorderSuccessor(node.left);
    }
}