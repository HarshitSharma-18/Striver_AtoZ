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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        helperFunc(list1 , list2 , p , q);
        
        return list1.equals(list2);
    }

    void helperFunc(List<Integer> list1 ,List<Integer> list2 ,  TreeNode node1 , TreeNode node2){

        if(node1 == null && node2 == null){
            list1.add(null);
            list2.add(null);
            return;
        }
        if(node1 == null){
            list1.add(null);
            return;
        }
        if(node2 == null){
            list2.add(null);
            return;
        }

        helperFunc(list1 , list2 , node1.left , node2.left);

        list1.add(node1.val);
        list2.add(node2.val);

        helperFunc(list1 , list2 , node1.right , node2.right);
        
    }
}