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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root ==null){
            return null;
        }
        List<Integer> arr = new ArrayList<>();
        Inorder(root,arr,key);
        return divAndConquer(arr,0,arr.size()-1);
    }
    public void Inorder(TreeNode root,List<Integer> arr,int key){
        if(root == null){
            return ;
        }
        Inorder(root.left,arr,key);
        if(root.val!=key){
            arr.add(root.val);
        }
        Inorder(root.right,arr,key);
    }

    public TreeNode divAndConquer(List<Integer> arr,int left,int right){
        if(left>right){
            return null;
        }
        int mid = (left+right)/2;
        TreeNode node = new TreeNode(arr.get(mid));
        node.left = divAndConquer(arr,left,mid-1);
        node.right = divAndConquer(arr,mid+1,right);
        return node;
    }

}
