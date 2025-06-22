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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> res = new ArrayList<>();
        if(root==null){
            return -1;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int c = q.size();
            long sum =0;
            while(c>0){
                c--;
                TreeNode cur = q.poll();
                sum+=cur.val;
                if(cur.left!=null)q.add(cur.left);
                if(cur.right!=null)q.add(cur.right);
            }
            res.add(sum);
        }
        Collections.sort(res);
        int len = res.size()-k;
        long ans=-1;
        int i=0;
        for(long val:res){
            if(i==len){
                ans=val;
            }
            i++;
        }
        return ans;
    }
}
