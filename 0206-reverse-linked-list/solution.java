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
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> li = new ArrayList<>();
        ListNode list= head;
        while(list!=null){
            li.add(list.val);
            list=list.next;
        }
        ListNode dummy= new ListNode(0);
        list=dummy;
        for(int i=li.size()-1;i>=0;i--){
            ListNode temp = new ListNode(li.get(i));
            list.next=temp;
            list=list.next;
        }
        return dummy.next;
    }
}
