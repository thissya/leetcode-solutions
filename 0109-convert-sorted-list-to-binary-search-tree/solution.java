/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> arr =  new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }    

        if(arr.size()==0){
            return null;
        }
        return divAndConquer(arr,0,arr.size()-1);
    }

    public TreeNode divAndConquer(List<Integer> arr,int left,int right){
        if(right<left){
            return null;
        }
        int mid=(left+right)/2;
        TreeNode node =  new TreeNode(arr.get(mid));
        node.left = divAndConquer(arr,left,mid-1);
        node.right = divAndConquer(arr,mid+1,right);
        return node;
    }
}
