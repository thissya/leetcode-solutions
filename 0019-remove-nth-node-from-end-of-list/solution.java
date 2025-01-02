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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev=head;
        ListNode temp=head;
        ListNode rem=head;
        int c=0;
        while(temp!=null){
            c++;
            if(c>n){
                prev=rem;
                rem=rem.next;
            }
            temp=temp.next;
        }
        prev.next=rem.next;
        if(rem==head){
            return head.next;
        }
        if(rem==prev){
            return null;
        }
        return head;
    }
}
