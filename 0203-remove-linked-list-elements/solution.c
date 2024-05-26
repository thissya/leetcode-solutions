/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {
    struct ListNode* fast=head;
    if(head== NULL)
    {
        return NULL;
    }
    struct ListNode* slow=head;
    while(head!=NULL && head->val==val)
    {
        head=head->next;
    }
    while(fast!=NULL)
    {
        if(fast->val==val)
        {
            slow->next=fast->next;   
        }
        else{
            slow=fast;
        }
        
        fast=fast->next; 
    }
    
    return head;
}
