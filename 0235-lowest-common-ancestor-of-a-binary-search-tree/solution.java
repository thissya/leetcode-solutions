/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode lca = root;
        TreeNode curp = root;
        TreeNode curq = root;

        while(curp.val!=p.val || curq.val!=q.val){
            if(curp.val==curq.val){
                lca=curp;
            }

            if(p.val>curp.val)curp=curp.right;
            else if(p.val<curp.val)curp=curp.left;

            if(q.val>curq.val)curq=curq.right;
            else if(q.val<curq.val)curq=curq.left;
        }
        return lca;
    }
}

/*

public TreeNode lowestCommonAncestor(TreeNode root, TreeNode n1, TreeNode n2) {
        HashMap<TreeNode,TreeNode> map = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int c = q.size();
            while(c>0){
                c--;
                TreeNode cur = q.poll();
                if(cur.left!=null){
                    map.put(cur.left,cur);
                    q.add(cur.left);
                } 
                if(cur.right!=null){
                    map.put(cur.right,cur);
                    q.add(cur.right);
                }
            }
        }
        Set<TreeNode> set = new HashSet<>();
        while(map.get(n1)!=null){
            set.add(n1);
            n1=map.get(n1);
        }
        set.add(n1);
        while(set.add(n2)){
            n2=map.get(n2);
        }
        return n2;
    }

*/
