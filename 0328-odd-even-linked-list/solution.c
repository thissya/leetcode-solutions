/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* oddEvenList(struct ListNode* head) {
    if(head==NULL || head->next==NULL)
    {
        return head;
    }
    struct ListNode *odd=head,*even=head->next,*connect=head->next;
    while(odd->next && even->next)
    {
        odd->next=even->next;
        even->next=odd->next->next;
        odd=odd->next;
        even=even->next;
    }
    odd->next=connect;
    return head;
    
}
