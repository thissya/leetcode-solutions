/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* rotateRight(struct ListNode* head, int k) {
    struct ListNode *count=head;
    int n=0;
    if(head==NULL || k==0 ||head->next==NULL)
    {
        return head;
    }
    while(count->next!=NULL)
    {
        n++;
        count=count->next;
    }
    n++;    
    k%=n;
    count->next=head;
    count=head;
    for(int i=0;i<n-k-1;i++)
    {
        count=count->next;
    }
    struct ListNode *ret;
    ret=count->next;
    count->next=NULL;
    return ret;
}
