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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> arr= new HashSet<>();
        for(int i:nums)
        {
            arr.add(i);
        }
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode cur;
        cur=dummy;
        while(cur!=null && cur.next!=null)
        {
            if(arr.contains(cur.next.val))
            {
                cur.next=cur.next.next;
            }
            else {
                cur=cur.next;
            }
        }
        return dummy.next;
    }
}
