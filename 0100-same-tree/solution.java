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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> que1 = new LinkedList<>();
        Queue<TreeNode> que2 = new LinkedList<>();
        TreeNode temp=p;
        TreeNode temp2=q;
        que1.add(temp);
        que2.add(temp2);
        while(!que1.isEmpty()|| !que2.isEmpty()){
            temp=que1.remove();
            temp2=que2.remove();
            if(temp == null && temp2!=null){
                return false;
            }else if(temp !=null && temp2==null){
                return false;
            }
            else if(temp==null && temp2==null)continue;
            if(temp.val!=temp2.val){
                return false;
            }
            que1.add(temp.left);
            que1.add(temp.right);
            que2.add(temp2.left);
            que2.add(temp2.right);
            
        }
        return true;
    }
}
