/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        queue<TreeNode*> q;
        vector<vector<int>> res;
        if(root==NULL)return res;
        q.push(root);
        while(!q.empty()){
            int c=q.size();
            vector<int> arr;
            while(c!=0){
                TreeNode* cur=q.front();
                q.pop();
                arr.push_back(cur->val);
                if(cur->left)q.push(cur->left);
                if(cur->right)q.push(cur->right);
                c--;
            }
            res.push_back(arr);
        }    
        return res;
    }
};
