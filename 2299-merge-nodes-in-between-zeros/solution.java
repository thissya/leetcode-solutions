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
    public ListNode mergeNodes(ListNode head) 
    { 
        head=head.next;
        ListNode dummy = new ListNode(0);
        ListNode cur=dummy;
        int cur_sum=0;
        while(head!=null)
        {
            if(head.val==0)
            {
                if(cur_sum>0)
                {
                    ListNode newnode=new ListNode(cur_sum);
                    cur.next=newnode;
                    cur=cur.next;
                }
                cur_sum=0;
            }
            else{
                cur_sum+=head.val;
            }
            head=head.next;
        }
        return dummy.next;
    }
}
