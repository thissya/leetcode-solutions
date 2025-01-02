/**
 * Definition for a Node.
 * struct Node {
 *     int val;
 *     struct Node *next;
 *     struct Node *random;
 * };
 */

struct Node* copyRandomList(struct Node* head) {
    if(head==NULL)return NULL;
	struct Node* temp = head;
    struct Node* nn;
    while(temp!=NULL){
        nn =(struct Node *)malloc(sizeof(struct Node));
        nn->val=temp->val;
        nn->next=temp->next;
        temp->next=nn;
        temp=nn->next;
    }
    temp=head;
    while(temp!=NULL){
        temp->next->random=temp->random? temp->random->next:NULL;
        temp=temp->next->next;
    }
    struct Node* newhead=head->next;
    struct Node* t2=head->next;
    struct Node* t1=head;
    while(t1!=NULL){
        t1->next=t2->next;
        t2->next=t1->next ? t1->next->next : NULL;
        t1 = t1->next;
        t2 = t2->next;    
    }
    
    return newhead;
}
