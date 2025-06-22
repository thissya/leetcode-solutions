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
    public int minDiffInBST(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<Integer> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            res.add(cur.val);
            if(cur.left!=null){
                q.add(cur.left);
            }
            if(cur.right!=null){
                q.add(cur.right);
            }
        }

        Collections.sort(res);
        for(int i=0;i<res.size()-1;i++){
            min = Math.min(min,res.get(i+1)-res.get(i));
        }

        return min;
    }
}
