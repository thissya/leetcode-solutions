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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = list1;
        ListNode temp1 = list2;
        ListNode curr = new ListNode();
        ListNode ans=curr;
        
        while(temp != null && temp1 != null){
            if(temp.val < temp1.val){
                ans.next=temp;
                temp = temp.next;
            }
            else{
                ans.next = temp1;
                temp1 =temp1.next;
            }
            ans = ans.next;
        }
        if(temp==null){
            ans.next=temp1;
        }else if(temp1==null){
            ans.next=temp;
        }
        return curr.next;
    }
}
