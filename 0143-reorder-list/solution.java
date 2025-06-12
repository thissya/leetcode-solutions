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
    public void reorderList(ListNode head) {
        Stack<ListNode> stk = new Stack<>();
        int len =0;
        ListNode cur = head;
        for(len=0;cur!=null;len++){
            stk.push(cur);
            cur=cur.next;
        }
        cur=head;
        for(int i=0;i<len/2;i++){
            ListNode temp =cur.next;
            cur.next=stk.pop();
            cur.next.next=temp;
            cur=temp;
        }
        cur.next=null;
    }
}

/*
public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return ;
        }
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode first=head;
        ListNode second=reverse(slow.next);
        slow.next=null;
        while(second!=null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next=temp1;

            first= temp1;
            second=temp2;
        }
        
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode cur = head;
        while(cur!=null){
            ListNode newnode = cur.next;
            cur.next=prev;
            prev=cur;
            cur= newnode;
        }
        return prev;
    }
*/
