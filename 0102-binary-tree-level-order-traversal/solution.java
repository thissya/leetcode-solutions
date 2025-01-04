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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root==null)return res;
        que.add(root);
        while(!que.isEmpty()){
            int c=que.size();
            List<Integer> arr= new ArrayList<>();
            while(c!=0){
                TreeNode cur=que.poll();
                arr.add(cur.val);
                if(cur.left!=null)que.add(cur.left);
                if(cur.right!=null)que.add(cur.right);
                c--;
            }
            res.add(arr);
        }
        return res;
    }
}
