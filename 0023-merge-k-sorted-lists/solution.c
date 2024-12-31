/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* merge(struct ListNode* temp1,struct ListNode* temp2){
    struct ListNode* dummy=(struct ListNode*)malloc(sizeof(struct ListNode));
    struct ListNode* cur=dummy;
    while(temp1!=NULL && temp2!=NULL){
        if(temp1->val<temp2->val){
            cur->next=temp1;
            temp1=temp1->next;
        }else{
            cur->next=temp2;
            temp2=temp2->next;
        }
        cur=cur->next;
    }
    if(temp1==NULL){
        cur->next=temp2;
    }else{
        cur->next=temp1;
    }
    return dummy->next;
}
struct ListNode* mergeKLists(struct ListNode** lists, int n) {
    struct ListNode* first=NULL;
    for(int i=0;i<n;i++){
        first=merge(first,lists[i]);
    }
    return first;
}
