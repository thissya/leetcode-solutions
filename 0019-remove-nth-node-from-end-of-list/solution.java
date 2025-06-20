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
        ListNode fast =head;
        ListNode slow = head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}

/*

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        int c=0;
        while(cur!=null){
            c++;
            cur=cur.next;
        }
        cur=head;
        ListNode prev = head;
        if(n==c){
            head=head.next;
            return head;
        }
        else if(n==1){
            while(cur.next!=null){
                prev=cur;
                cur=cur.next;
            }
            prev.next=null;
            return head;
        }
        n=c-n;
        int i=0;
        while(cur!=null){
            i++;
            if(i==n){
                cur.next=cur.next.next;
                break;
            }
            cur=cur.next;
        }
        return head;
    }

*/
