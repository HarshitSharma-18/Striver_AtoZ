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
class CBTInserter {

    TreeNode root;
    Queue<TreeNode> globalQ;

    public CBTInserter(TreeNode root) {
        this.root = root;

        Queue<TreeNode> tempQ = new LinkedList<>();
        globalQ = new LinkedList<>();

        tempQ.offer(root);

        while(!tempQ.isEmpty()){
            TreeNode node = tempQ.peek();
            tempQ.poll(); 

            if(node.left != null){
                tempQ.offer(node.left);
            }
            if(node.right != null){
                tempQ.offer(node.right);
            }

            if(node.left == null || node.right == null){
                globalQ.offer(node);
            }
        }
    }
    
    public int insert(int val) {
        TreeNode parent = globalQ.peek();
        TreeNode newNode = new TreeNode(val);
        
        if(parent.left == null){
            parent.left = newNode;
        }
        else{
            parent.right = newNode;
            globalQ.poll();
        }
        globalQ.offer(newNode);

        return parent.val;
    }
    
    public TreeNode get_root() {
        return root;
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(val);
 * TreeNode param_2 = obj.get_root();
 */