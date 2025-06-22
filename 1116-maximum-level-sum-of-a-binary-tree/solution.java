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
    public int maxLevelSum(TreeNode root) {
        int max = Integer.MIN_VALUE;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int res =0;
        int level=0;
        while(!q.isEmpty()){
            int c=q.size();
            level++;
            int sum=0;
            while(c>0){
                c--;
                TreeNode cur = q.poll();
                sum+=cur.val;
                if(cur.left!=null)q.add(cur.left);
                if(cur.right!=null)q.add(cur.right);
            }

            if(max<sum){
                max=sum;
                res=level;
            }
        }
        return res;
    }
}
