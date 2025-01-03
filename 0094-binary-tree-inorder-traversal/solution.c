/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

void inorder(struct TreeNode* root,int* res,int* ind){
    if(root==NULL){
        return ;
    }

    inorder(root->left,res,ind);
    res[(*ind)++] = root->val;
    inorder(root->right,res,ind);
}

int* inorderTraversal(struct TreeNode* root, int* returnSize) {
    int* res=malloc(sizeof(int)*100);
    //if(!res)return NULL;
    int ind=0;
    inorder(root,res,&ind);
    *returnSize=ind;
    return res;
}
