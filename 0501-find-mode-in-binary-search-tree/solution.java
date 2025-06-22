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
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        inorder(root,map);
        List<Integer> arr = new ArrayList<>();
        int maxval=0;
        for(int val:map.values()){
            maxval=Math.max(maxval,val);
        }
        for(int key:map.keySet()){
            if(map.get(key)==maxval){
                arr.add(key);
            }
        }
        int i=0;
        int[] res = new int[arr.size()];
        for(int val:arr){
            res[i++]=val;
        }
        return res;
    }
    public void inorder(TreeNode root,HashMap<Integer,Integer> map){
        if(root==null){
            return ;
        }
        inorder(root.left,map);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        inorder(root.right,map);
    }

}
