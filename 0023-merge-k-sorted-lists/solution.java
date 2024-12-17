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
        PriorityQueue<Integer> heap = new PriorityQueue<>();//min heap
        //(a,b)->Integer.compare(b,a) max heap
        for(int i=0;i<lists.length;i++){
            ListNode cur=lists[i];
            while(cur!=null){
                heap.add(cur.val);
                cur=cur.next;
            }
        }

        if(heap.isEmpty()){
            return null;
        }
        
        ListNode head=null;
        ListNode cur=null;
        while(!heap.isEmpty()){
            if(head == null){
                head= new ListNode(heap.poll());
                cur=head;
            }else{
                cur.next = new ListNode(heap.poll());
                cur=cur.next;
            }
        }
        return head;
    }
}
