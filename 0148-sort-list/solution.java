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
    public ListNode sortList(ListNode head) {
        return split(head);
    }
    
    public ListNode split(ListNode head){
        if(head ==null || head.next == null){
            return head;
        }
        ListNode mid = findMid(head);
        ListNode left = split(head);
        ListNode right = split(mid);
        return merge(left,right);
    }

    public ListNode merge(ListNode left ,ListNode right){
        ListNode res =null,cur=null;

        while(left!=null && right!=null){
            if(left.val<right.val){
                if(res==null){
                    res=left;
                    cur=left;
                }else{
                    cur.next = left;
                    cur=cur.next;
                }
                left=left.next;
            }else{
                if(res==null){
                    res=right;
                    cur=right;
                }else{
                    cur.next=right;
                    cur=cur.next;
                }
                right = right.next;
            }
        }

        while(left!=null){
            cur.next=left;
            cur=cur.next;
            left=left.next;
        }
        while(right!=null){
            cur.next=right;
            cur=cur.next;
            right=right.next;
        }
        return res;
    }

    public ListNode findMid(ListNode head){
        ListNode prev=head;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next=null;
        return slow;
    }

}
