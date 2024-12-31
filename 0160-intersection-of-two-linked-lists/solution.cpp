/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    int length(ListNode *headA){
        ListNode* temp=headA;
        int c=0;
        while(temp!=NULL){
            c++;
            temp=temp->next;
        }
        return c;
    }
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        int l1=length(headA);
        int l2=length(headB);
        while(l1>l2){
            headA=headA->next;
            l1--;
        }
        while(l2>l1){
            headB=headB->next;
            l2--;
        }
        while(headA!=headB){
            headA=headA->next;
            headB=headB->next;
        }
        return headA;
    }
};

/*
    vector<ListNode *> m;
        struct ListNode* temp=headA;
        while(temp!=NULL){
            m.push_back(temp);
        }
        temp = headB;
        while()
*/
