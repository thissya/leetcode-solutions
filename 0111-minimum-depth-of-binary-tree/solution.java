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
    public int minDepth(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        int ans=0;
        if(root==null)return 0;
        q.add(root);
        while(!q.isEmpty()){
            int c=q.size();
            while(c!=0){
                TreeNode cur= q.poll();
                if(cur.left==null && cur.right==null){
                    return ans+1;
                }
                if(cur.left!=null)q.add(cur.left);
                if(cur.right!=null)q.add(cur.right);
                c--;
            }
            ans++;
        }
        return ans;
    }
}
