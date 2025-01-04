/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
void sum(struct TreeNode* root,int cr ,bool* res,int targetSum){
    if(root==NULL)return ;
    cr+=root->val;
    if(root->left==NULL && root->right==NULL){
        if(cr == targetSum){
            *res=true;
            return;
        }
    }
    sum(root->left,cr ,res,targetSum);
    sum(root->right,cr ,res,targetSum);
}
bool hasPathSum(struct TreeNode* root, int targetSum) {
    bool res=false;
    if(root==NULL)return false;
    sum(root,0,&res,targetSum);
    return res;
}
