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
    public ListNode mergeKLists(ListNode[] lists) {
        int n =lists.length;
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ListNode itr= lists[i];
            while(itr!=null)
            {
                ans.add(itr.val);
                itr=itr.next;
            }
        }
        Collections.sort(ans);
        if(n==0 || ans.size()==0)return null;
        ListNode head= new ListNode(ans.get(0));
        ListNode ptr=head;
        for(int i=1;i<ans.size();i++)
        {
            ListNode a= new ListNode(ans.get(i));
            ptr.next=a;
            ptr=a;
        }
        ptr.next=null;
        return head;
    }
}
