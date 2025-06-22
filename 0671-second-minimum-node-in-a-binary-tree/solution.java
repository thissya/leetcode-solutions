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
    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> set = new ArrayList<>();
        inorder(root,set);
        if(set.size()<=1){
            return -1;
        }
        int i=1;
        int ans =0;
        Collections.sort(set);
        for(int val:set){
            System.out.println(val);
            if(i==2){
                ans=val;
                break;
            }
            i++;
        }
        return ans;
    }
    public void inorder(TreeNode root,List<Integer> set){
        if(root==null){
            return ;
        }
        inorder(root.left,set);
        if(!set.contains(root.val))
            set.add(root.val);
        inorder(root.right,set);
    }
}
