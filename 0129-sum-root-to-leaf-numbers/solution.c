/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
void sum(struct TreeNode* root,int cr,int* psum){
    if(root==NULL)return ;
    if(root->left ==NULL && root->right==NULL){
        *psum += (cr*10) +root->val;
        return;
    }
    sum(root->left, cr*10+root->val , psum);
    sum(root->right, cr*10+root->val , psum);
}
int sumNumbers(struct TreeNode* root) {
   int psum=0;
   sum(root,0,&psum);
   return psum; 
}
