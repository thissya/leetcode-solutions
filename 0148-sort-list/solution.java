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
import java.util.*;
class Solution {
    public ListNode sortList(ListNode head) 
    {
        int[] arr= new int[100000];
        int n=0;    
        ListNode temp=head;
        while(temp!=null)
        {
            arr[n++]=temp.val;
            temp=temp.next;
        }
        int[] arr1= new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=arr[i];
        }
        Arrays.sort(arr1);
        temp=head;
        int i=0;
        while(temp!=null)
        {
            temp.val=arr1[i++];
            temp=temp.next;
        }
        return head;
    }
}
