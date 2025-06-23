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
    public TreeNode bstToGst(TreeNode root) {
        Stack<TreeNode> que = new Stack<>();
        TreeNode cur = root; 
        int sum=0;
        while(cur!=null || !que.isEmpty()){
            while(cur!=null){
                que.push(cur);
                cur=cur.right;
            }
            cur = que.pop();
            sum+=cur.val;
            cur.val=sum;
            if(cur.left!=null){
                cur=cur.left;
            }else{
                cur=null;
            }
        }
        return root;

    }
}
