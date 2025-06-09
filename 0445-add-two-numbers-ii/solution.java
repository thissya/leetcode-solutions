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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        int c=0;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
    
        while(l1!=null || l2!=null || c!=0){
            int sum=c;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            int cur =  sum%10;
            c=sum/10;
            ListNode newnode = new ListNode(cur);
            current.next= newnode;
            current = newnode;
        }
        
        return reverse(dummy.next);

    }
    public static ListNode reverse (ListNode head){
        ListNode prev = null;
        while(head!=null){
            ListNode newnode = head.next;
            head.next = prev;
            prev=  head;
            head= newnode;
        }
        return prev;
    }
}
