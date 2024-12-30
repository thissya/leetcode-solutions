/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *detectCycle(struct ListNode *head) {
    struct ListNode* slow = head;
    struct ListNode* fast= head;
    int va=0;
    int f=1;
    while(fast!=NULL && fast->next!=NULL){
        slow=slow->next;
        fast=fast->next->next;
        if(slow==fast){
            f=0;
            break;
        }
    }
    if(fast==NULL || fast->next==NULL) return NULL;

    if(f==0){
        slow=head;
        while(slow!=fast){
            slow=slow->next;
            fast=fast->next;
        }
    }
    return slow;
}
