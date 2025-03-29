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
class BSTIterator {

    public BSTIterator(TreeNode root) {
        inorder(root);
    }
    int i=0;
    public int next() {
        return arr.get(i++);
    }
    
    public boolean hasNext() {
        if(i<arr.size()){
            return true;
        }
        return false;
    }

    List<Integer> arr = new ArrayList<>();
    
    public void inorder(TreeNode root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
