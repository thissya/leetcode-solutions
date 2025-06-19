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
        List<Integer> arr1 = bfs(p);
        List<Integer> arr2 = bfs(q);
        return arr1.equals(arr2);
    }
    public List<Integer> bfs(TreeNode root){
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        List<Integer> temp = new ArrayList<>();
        while(!q.isEmpty()){
            int c = q.size();
            while(c>0){
                c--;
                TreeNode cur = q.poll();
                if(cur==null){
                    temp.add(1000001);
                }else{
                    temp.add(cur.val);
                    q.add(cur.left);
                    q.add(cur.right);
                }
            }
        }
        return temp;
    }
}

/*

public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> t1 = new LinkedList<>();
        Queue<TreeNode> t2 = new LinkedList<>();
        
        t1.add(p);
        t2.add(q);

        while(!t1.isEmpty() || !t2.isEmpty()){
            TreeNode cur1 = t1.poll();
            TreeNode cur2 = t2.poll();
            if(cur1==null && cur2==null){
                continue;
            }
            else if(cur1!=null && cur2==null){
                return false;
            }
            else if(cur1==null && cur2!=null){
                return false;
            }

            if(cur1.val!=cur2.val){
                return false;
            }
            t1.add(cur1.left);
            t1.add(cur1.right);
            t2.add(cur2.left);
            t2.add(cur2.right);
        }
        return true;
    }

*/

