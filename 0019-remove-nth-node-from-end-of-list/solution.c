/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode* temp=head;
    int c=0;
    if(head->next == NULL && n==1)return NULL;
    while(temp!=NULL){
        c++;
        temp=temp->next;
    }
    int len=c-n;
    int i=0;
    temp=head;
    if(len==0){
        return head->next;
    }
    while(i<len-1){
        temp=temp->next;
        i++;
    }
    temp->next=temp->next ? temp->next->next:NULL;
    return head;
}
