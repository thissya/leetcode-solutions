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

class Pair{
    TreeNode t1;
    int ind =0;
    public Pair(TreeNode t1,int ind){
        this.t1=t1;
        this.ind=ind;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int ans =0;
        Queue<Pair> q = new LinkedList<>();
        Pair proot = new Pair(root,1);
        q.add(proot);
        while(!q.isEmpty()){
            int c = q.size();
            int min=Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            while(c>0){
                c--;
                Pair cur = q.poll();
                if(cur.ind<min){
                    min=cur.ind;
                }
                if(cur.ind>max){
                    max=cur.ind;
                }
                if(cur.t1.left!=null){
                    Pair newPair = new Pair(cur.t1.left,(cur.ind*2)+1);
                    q.add(newPair);
                }
                if(cur.t1.right!=null){
                    Pair newPair = new Pair(cur.t1.right,(cur.ind*2)+2);
                    q.add(newPair);
                }
            }
            ans=Math.max(ans,max-min+1);
        }
        return ans;
    }
}
