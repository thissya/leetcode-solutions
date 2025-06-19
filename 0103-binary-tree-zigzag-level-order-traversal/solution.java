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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        q.add(root);
        boolean f= false;
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int n = q.size();
            while(n>0){
                TreeNode cur = q.poll();
                n--;
                temp.add(cur.val);
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
            if(f){
                f=false;
                Collections.reverse(temp);
            }else{
                f=true;
            }
            res.add(temp);
        }
        return res;
    }
}
