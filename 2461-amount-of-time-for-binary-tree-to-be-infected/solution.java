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
//DFS Approach
    private int maxTime = 0;
    public int amountOfTime(TreeNode root, int start) {
        find(root,start);
        return maxTime;
    }
    private int find(TreeNode root,int target){
        if(root==null) return -1;
        if(root.val==target){
            dfs(root,0);
            return 1;
        }
        int left = find(root.left,target);
        if(left>0){
            dfs(root.right,left+1);
            maxTime=Math.max(maxTime,left);
            return left+1;
        }
        int right = find(root.right,target);
        if(right>0){
            dfs(root.left,right+1);
            maxTime = Math.max(maxTime,right);
            return right+1;
        }
        return -1;
    }
    private void dfs(TreeNode root,int time){
        if(root==null)return ;
        maxTime = Math.max(maxTime,time);
        dfs(root.left,time+1);
        dfs(root.right,time+1);
    }
*/

class Solution {
    //BFS Approach
    public int amountOfTime(TreeNode root, int start) {
        HashMap<TreeNode, TreeNode> map = new HashMap<>();
        TreeNode cur = root;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(cur);
        while (!q.isEmpty()) {
            int c = q.size();
            while (c > 0) {
                c--;
                cur = q.poll();
                if (cur.left != null) {
                    map.put(cur.left, cur);
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                    map.put(cur.right, cur);
                }
            }
        }

        q.clear();
        int res = 0;
        Set<TreeNode> set = new HashSet<>();
        if (root.val == start) {
            q.add(root);
            set.add(root);
        } else {
            for (TreeNode key : map.keySet()) {
                if (key.val == start) {
                    q.offer(key);
                    set.add(key);
                    break;
                }
            }
        }
        while (!q.isEmpty()) {
            int c = q.size();
            res++;
            while (c > 0) {
                c--;
                cur = q.poll();
                if (cur.left != null && set.add(cur.left)) {
                    q.add(cur.left);
                }
                if (cur.right != null && set.add(cur.right)) {
                    q.add(cur.right);
                }
                TreeNode par = map.get(cur);
                if (par != null && set.add(par)) {
                    q.add(par);
                }
            }
        }
        return res - 1;
    }

}
