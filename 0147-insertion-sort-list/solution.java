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
    ListNode dummyhead,cur;
    public void sort(int data){
        ListNode newnode = new ListNode(data);
        if(dummyhead==null){
            dummyhead=newnode;
            cur=newnode;
        }else if(data<dummyhead.val){
            newnode.next=dummyhead;
            dummyhead=newnode;
        }
        else{
            ListNode Dummy=dummyhead;
            while(Dummy.next!=null && data>Dummy.next.val){
                Dummy=Dummy.next;    
            }
            newnode.next=Dummy.next;
            Dummy.next=newnode;
        }
    }
    public ListNode insertionSortList(ListNode head) {
        ListNode temp =head;
        while(temp!=null){
            sort(temp.val);
            temp=temp.next;
        }
        return dummyhead;
    }
}
