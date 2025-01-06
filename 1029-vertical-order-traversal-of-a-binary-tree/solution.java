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
    public void recur(TreeNode root,HashMap<Integer,HashMap<Integer,List<Integer>>> map,int ind,int level){
        if(root==null)return ;
        map.putIfAbsent(ind,new HashMap<>());
        map.get(ind).putIfAbsent(level,new ArrayList<>());
        map.get(ind).get(level).add(root.val);
        recur(root.left,map,ind-1,level+1);
        recur(root.right,map,ind+1,level+1);
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        HashMap<Integer,HashMap<Integer,List<Integer>>> map = new HashMap<>();
        recur(root,map,0,0);
        List<List<Integer>> res= new ArrayList<>();
        
        List<Integer> vertical=new ArrayList<>(map.keySet());
        Collections.sort(vertical);
        for(int ver:vertical){
            List<Integer> arr= new ArrayList<>();
            HashMap<Integer,List<Integer>> innermap= map.get(ver);
            List<Integer> levels=new ArrayList<>(innermap.keySet());
            Collections.sort(levels);
            for(int level:levels){
                List<Integer> l2=innermap.get(level);
                Collections.sort(l2);
                arr.addAll(l2);
            }
            res.add(arr);
        }
        return res;
    }
}
