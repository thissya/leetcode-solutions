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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        List<Integer> ans=new ArrayList<>();
        while(temp!=null)
        {
            ans.add(temp.val);
            temp=temp.next;
        }
        List<Integer> rev= new ArrayList<>(ans);
        Collections.reverse(rev);
        if(rev.equals(ans))return true;
        return false;
    }
}
