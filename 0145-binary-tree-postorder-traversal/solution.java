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
    //using Single Stack
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Stack<TreeNode> stk1 = new Stack<>();
        stk1.push(root);

        while(!stk1.isEmpty()){
            TreeNode p = stk1.pop();
            res.add(p.val);
            if(p.left!=null) stk1.add(p.left);
            if(p.right!=null) stk1.add(p.right);
        }
        Collections.reverse(res);
        return res;
    }

}

/*

// using Two Stack

public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Stack<TreeNode> stk1 = new Stack<>();
        Stack<TreeNode> stk2 = new Stack<>();
        stk1.push(root);

        while(!stk1.isEmpty()){
            TreeNode p = stk1.pop();
            stk2.push(p);
            if(p.left!=null) stk1.add(p.left);
            if(p.right!=null) stk1.add(p.right);
        }
        while(!stk2.isEmpty()){
            res.add(stk2.pop().val);
        }
        return res;
    }

*/
