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
    public ListNode swapPairs(ListNode head) {
        ListNode prev=null;
        ListNode temp=head;
        if(head==null || head.next==null)return head;
        ListNode dummy=head.next;
        while(temp!=null && temp.next!=null){
            ListNode sec=temp.next;
            temp.next=sec.next;
            sec.next=temp;
            if(prev!=null){
                prev.next=sec;
            }
            prev=temp;
            temp=temp.next;
        }
        return dummy;
    }
}
