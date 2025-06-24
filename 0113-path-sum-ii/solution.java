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
    private List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root,targetSum,new ArrayList<>());
        return res;
    }
    public void dfs(TreeNode root,int targetSum,List<Integer> cur){
        if(root==null)return ;
        
        cur.add(root.val);
        targetSum-=root.val;
        
        if(root.left==null && root.right==null){
            if(targetSum==0){
                res.add(new ArrayList<>(cur));
            }
        }

        dfs(root.left,targetSum,cur);
        dfs(root.right,targetSum,cur);
        cur.remove(cur.size()-1);

    }
}
