/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int height(struct TreeNode* root){
    if(root==NULL)return 0;
    return 1+fmax(height(root->left),height(root->right));
}
int diameterOfBinaryTree(struct TreeNode* root) {
    if(root==NULL)return 0;
    int lh=height(root->left);
    int rh=height(root->right);
    int lw=diameterOfBinaryTree(root->left);
    int rw=diameterOfBinaryTree(root->right);
    return fmax(lh+rh,fmax(lw,rw));
}
