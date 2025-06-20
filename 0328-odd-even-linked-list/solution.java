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
    public ListNode oddEvenList(ListNode head) {    
        if(head==null || head.next==null){
            return head;
        }
        ListNode left = head;
        ListNode temp = head.next;
        ListNode right=head.next;
        
        while(left.next!=null && right.next!=null){
            left.next=right.next;
            left=left.next;
            right.next=left.next;
            right=right.next;
        }
        left.next=temp;
        return head;
    }
}

/*

public ListNode oddEvenList(ListNode head) {
        Queue<ListNode> q = new LinkedList<>();
        ListNode cur = head;
        while(cur!=null && cur.next!=null){
            ListNode temp = cur.next;
            cur.next=temp.next;
            if(cur.next!=null)
                cur=cur.next;
            temp.next=null;
            q.add(temp);
        }
        while(!q.isEmpty()){
            cur.next=q.poll();
            cur=cur.next;
        }
        return head;
    }
*/
