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
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<Integer> stk = new Stack<>();

        ListNode head2 = null;
        ListNode cur2 = null;

        while (head != null) {
            while (stk.size() != k && head != null) {
                int temp = head.val;
                head = head.next;
                stk.push(temp);
            }
            if (stk.size() == k) {
                while (!stk.isEmpty()) {
                    int val = stk.pop();
                    ListNode newnode = new ListNode(val);
                    if (head2 == null) {
                        head2 = newnode;
                        cur2 = newnode;
                    } else {
                        cur2.next = newnode;
                        cur2 = newnode;
                    }
                }

            } else {
                while (!stk.isEmpty() && stk.size() < k) {
                    Stack<Integer> stk2 = new Stack<>();
                    while (!stk.isEmpty()) {
                        stk2.push(stk.pop());
                    }

                    while (!stk2.isEmpty()) {
                        int val = stk2.pop();
                        ListNode newnode = new ListNode(val);
                        if (head2 == null) {
                            head2 = newnode;
                            cur2 = newnode;
                        } else {
                            cur2.next = newnode;
                            cur2 = newnode;
                        }
                    }

                }
            }
        }
        return head2;
    }
}
