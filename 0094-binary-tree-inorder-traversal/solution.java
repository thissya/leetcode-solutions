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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr= new ArrayList<>();
        Stack<TreeNode> s= new Stack<>();
        TreeNode cur= root;

        while(true){
            while(cur!=null){
                s.push(cur);
                cur=cur.left;
            }
            if(s.isEmpty())break;
            cur=s.peek();
            s.pop();
            arr.add(cur.val);
            cur=cur.right;
        }
        return arr;
    }
}
