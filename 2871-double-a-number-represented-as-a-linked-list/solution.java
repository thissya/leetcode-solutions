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
import java.math.*;
class Solution 
{
    public ListNode doubleIt(ListNode head) 
    {
       if(head==null || head.val==0)
       {
        return head;
       }
       BigInteger num=BigInteger.ZERO;
       ListNode temp=head;
       while(temp!=null)
       {
            int val=temp.val;
            num=num.multiply(BigInteger.TEN).add(BigInteger.valueOf(val));
            temp=temp.next;
       }
       num=num.multiply(BigInteger.TWO);
       String rev=new StringBuilder(num.toString()).toString();
       ListNode dum = new ListNode(-1);
       ListNode cur=dum;
       for(int i=0;i<rev.length();i++)
       {
            char ch=rev.charAt(i);
            int a =Integer.parseInt(String.valueOf(ch));
            cur.next=new ListNode(a);
            cur=cur.next;
       }
       return dum.next;
    }
}
