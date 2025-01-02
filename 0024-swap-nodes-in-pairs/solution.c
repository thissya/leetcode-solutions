/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* swapPairs(struct ListNode* head) {
    if(head==NULL){
        return NULL;
    }
    if(head->next==NULL){
        return head;
    }
    struct ListNode* temp=head;
    struct ListNode* newhead=head->next;
    struct ListNode* prev=NULL;
    while(temp!=NULL && temp->next!=NULL){
        struct ListNode* sec=temp->next;
        temp->next=sec->next;
        sec->next=temp;
        if(prev!=NULL){
            prev->next=sec;
        }
        prev=temp;
        temp=temp->next;
    }
    return newhead;
}
