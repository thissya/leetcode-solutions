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
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        Stack<ListNode> stk = new Stack<>();
        ListNode kthNode =null;
        ListNode cur=head;
        int i=1;
        while(cur!=null){
            if(i==k){
                kthNode=cur;
            }
            stk.add(cur);
            cur=cur.next;
            i++;
        }
        ListNode revKthNode=null;
        int n = stk.size();
        for(i=1;i<=n;i++){
            ListNode newnode=stk.pop();
            if(i==k){
                revKthNode=newnode;
                break;
            }
        }
        int temp = kthNode.val;
        kthNode.val=revKthNode.val;
        revKthNode.val=temp;
        return head;
    }
}

