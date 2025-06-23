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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();

        Stack<TreeNode> stk = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;
        while(cur!=null || !stk.isEmpty()){
            while(cur!=null){
                stk.push(cur);
                arr.add(cur.val);
                cur=cur.left;
            }
            cur=stk.peek();
            if(cur.left==null && cur.right==null){
                String str ="";
                for(int i=0;i<arr.size()-1;i++){
                    str+=arr.get(i)+"->";
                }
                str+=arr.get(arr.size()-1);
                res.add(str);
            }
            if(cur.right!=null && cur.right!=prev){
                cur=cur.right;
                continue;
            }
            else{
            //if(cur.right==null || cur.right ==prev){ 
            // else and this if statement is same condition check
                stk.pop();
                arr.remove(arr.size()-1);
                prev=cur;
                cur=null;
            }
        }
        return res;
    }
}
