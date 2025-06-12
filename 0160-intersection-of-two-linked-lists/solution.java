/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       int ac=0;
       int bc=0;
       ListNode a= headA;
       ListNode b=headB;

        while(a!=null){
            ac++;
            a=a.next;
        }
        while(b!=null){
            bc++;
            b=b.next;
        }
        while(ac>bc){
            ac--;
            headA=headA.next;
        }
        while(bc>ac){
            bc--;
            headB=headB.next;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}

/*
 List<ListNode> list = new ArrayList<>();
        ListNode cur1= headA;
        while(cur1!=null){
            list.add(cur1);
            cur1=cur1.next;
        }
        ListNode cur2=headB;
        while(cur2!=null){
            if(list.contains(cur2)){
                return cur2;
            }
            cur2=cur2.next;
        }
        return null;
*/
