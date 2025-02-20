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
    public void recur(List<List<Integer>> res,List<Integer> path,TreeNode root,int sum){
        if(root == null){
            return ;
        }
        sum-=root.val;
        path.add(root.val);
        if(root.left==null && root.right == null && sum==0){
            res.add(path);
        }
        recur(res,new ArrayList<>(path),root.left,sum);
        recur(res,new ArrayList<>(path),root.right,sum);
    }
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>(); 
        List<Integer> path = new ArrayList<>();
        if(root == null){
            return res;
        }        
        recur(res,path,root,sum);
        return res;
    }
}
