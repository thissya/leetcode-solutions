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
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }   
        System.out.println(set); 
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode cur = dummy.next;
        ListNode prev = dummy;
        while(cur!=null){
            if(set.contains(cur.val)){
                prev.next=cur.next;
            }else{
                prev=cur;
            }
            cur=cur.next;
        }
        return dummy.next;
    }
}
