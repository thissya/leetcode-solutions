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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode first = head;
        ListNode sec = reverse(slow);
        int sum =0;
        while(sec!=null){
            int val = first.val+sec.val;
            sum=Math.max(val,sum);
            first=first.next;
            sec=sec.next;
        }
        return sum ;
    }
    public ListNode reverse(ListNode head){
        ListNode prev= null;
        ListNode cur=head;
        while(cur!=null){
            ListNode newnode = cur.next;
            cur.next=prev;
            prev=cur;
            cur=newnode;
        }
        return prev;
    }
}
