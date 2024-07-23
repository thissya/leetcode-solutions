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
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        ListNode  curr= dummy;
        ListNode temp1,temp2;
        while(curr.next!=null && curr.next.next!=null)
        {
            temp1=curr.next;
            temp2=curr.next.next;
            temp1.next=temp2.next;
            temp2.next=curr.next; //temp2.next=temp1
            curr.next=temp2; //
            curr=curr.next.next; //cur=temp1
        }
        return dummy.next;
    }
}
