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
    HashMap<Integer , Integer> map = new HashMap<>();
    int index = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0 ; i < inorder.length ; i++){
            map.put(inorder[i] , i);
        }

        return helperFunc(preorder , 0 , preorder.length - 1);
    }

    public TreeNode helperFunc(int[] preorder , int low , int high){
        if(low > high){
            return null;
        }

        int inorderIndx = map.get(preorder[index]);

        TreeNode newNode = new TreeNode(preorder[index]);
        index++;

        newNode.left = helperFunc(preorder , low , inorderIndx  - 1);
        newNode.right = helperFunc(preorder , inorderIndx + 1 , high);

        return newNode;
    }
}