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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy;
        while(cur!=null && cur.next!=null){
            if(cur.val == cur.next.val){
                while((cur!=null && cur.next!=null )&& cur.val==cur.next.val){
                    cur=cur.next;
                }
                if(cur!=null && cur.next!=null){
                    prev.next=cur.next;
                    cur=prev.next;
                }else{
                    prev.next=null;
                    cur=null;
                }
            }else{
                prev=cur;
                cur=cur.next;
            }
        }
        return dummy.next;
    }
}
