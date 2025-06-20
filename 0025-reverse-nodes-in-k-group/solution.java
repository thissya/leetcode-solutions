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
    public ListNode head1=null;
    public ListNode cur1=null;
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<ListNode> stk = new Stack<>();
        ListNode cur=head;
        while(cur!=null){
            while(stk.size()!=k && cur!=null){
                ListNode newnode = cur;
                cur=cur.next;
                newnode.next=null;
                stk.push(newnode);
            }
            
            if(stk.size()==k){
                while(!stk.isEmpty()){
                    if(head1==null){
                        head1=stk.pop();
                        cur1=head1;
                    }else{
                        cur1.next=stk.pop();
                        cur1=cur1.next;
                    }
                }
                
            }else{
                Stack<ListNode> stk2= new Stack<>();
                while(!stk.isEmpty()){
                    stk2.push(stk.pop());
                }
                while(!stk2.isEmpty()){
                    if(head1==null){
                        head1=stk2.pop();
                        cur1=head1;
                    }else{
                        cur1.next=stk2.pop();
                        cur1=cur1.next;
                    }
                }
            }
        }
        return head1;
    }
}
