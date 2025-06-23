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
        HashMap<TreeNode,TreeNode> map = new HashMap<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int c = que.size();
            while(c>0){
                c--;
                TreeNode cur = que.poll();
                if(cur.left!=null){
                    map.put(cur.left,cur);
                    que.add(cur.left);
                }
                if(cur.right!=null){
                    map.put(cur.right,cur);
                    que.add(cur.right);
                }
            }
        }
        que.clear();
        Set<TreeNode> set = new HashSet<>();
        while(map.get(p)!=null){
            set.add(p);
            p=map.get(p);
        }
        set.add(p);
        while(set.add(q)){
            q=map.get(q);
        }
        return q;
    }
}
