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
    public ListNode removeZeroSumSublists(ListNode head) {
        List<Integer> arr= new ArrayList<>();
        ListNode cur = head;
        while(cur!=null){
            arr.add(cur.val);
            cur=cur.next;
        }
        boolean flag=true;
        while(flag){
            flag=false;
            for(int i=0;i<arr.size();i++){
                int sum=0;
                for(int j=i;j<arr.size();j++){
                    sum+=arr.get(j);
                    if(sum==0){
                        for(int k=j;k>=i;k--){
                            arr.remove(k);
                        }
                        flag=true;
                        break;
                    }
                }
                if(flag)break;
            }
        }

        ListNode dummy =new ListNode(0);
        head=dummy;
        for(int i=0;i<arr.size();i++){
            ListNode newnode = new ListNode(arr.get(i));
            head.next=newnode;
            head=newnode;
        }
        return dummy.next;
    }
}
