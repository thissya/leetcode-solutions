/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool isPalindrome(struct ListNode* head) {
    struct ListNode* temp=head;
    int arr[100000];
    int top=0;
    while(temp!=NULL){
        arr[top++]=temp->val;
        temp=temp->next;
    }
    temp=head;
    while(temp!=NULL){
        if(arr[--top]!=temp->val){
            return false;
        }
        temp=temp->next;
    }
    return true;
}
