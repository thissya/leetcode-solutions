/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) 
{
    if(head->next==NULL||head==NULL)
    {
        return NULL;
    }
    struct ListNode *dummy=(struct ListNode *)malloc(sizeof(struct ListNode));
    dummy->next=head;
    struct ListNode *first,*sec;
    first=dummy;
    sec=dummy;

    for(int i=0;i<=n;i++)
    {
        if(first==NULL)
        {
            free(dummy);
            return head;
        }
        first=first->next;
    }
    while(first!=NULL)
    {
        first=first->next;
        sec=sec->next;
    }
    sec->next=sec->next->next;
    struct ListNode *new=dummy->next;
    free(dummy);
    return new;
}
