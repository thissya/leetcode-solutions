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

/*
    public int sumRootToLeaf(TreeNode root) {
        //BFS
        Stack<TreeNode> stk = new Stack<>();
        TreeNode cur = root;
        int sum =0;
        Stack<Integer> stk2 = new Stack<>();
        TreeNode prev=null;
        while(cur!=null || !stk.isEmpty()){
            while(cur!=null){
                stk.push(cur);
                stk2.push(cur.val);
                cur=cur.left;
            }

            cur=stk.peek();
            
            if((cur.left==null && cur.right==null) ){
                String binstr = "";
                for(int bit:stk2){
                    binstr+=bit;
                }
                System.out.println(binstr);
                sum+=Integer.parseInt(binstr,2);
            }
            
            if(cur.right!=null && cur.right!=prev)
                cur=cur.right;
            else{
                stk.pop();
                stk2.pop();
                prev=cur;
                cur=null;
            }
        }
        return sum;
    }
*/
class Solution {
    private int sum = 0;
    public int sumRootToLeaf(TreeNode root) {
        dfs(root,new ArrayList<>());
        return sum;
    }
    private void dfs(TreeNode root,List<Integer> arr){
        if(root==null)return;
        arr.add(root.val);
        if(root.left==null && root.right==null){
            String str = "";
            for(int i:arr){
                str+=i;
            }
            sum+=Integer.parseInt(str,2);
        }
        dfs(root.left,arr);
        dfs(root.right,arr);
        arr.remove(arr.size()-1);
    }
}
