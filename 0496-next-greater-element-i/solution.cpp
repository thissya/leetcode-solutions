class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        stack<int> st;
        unordered_map<int,int>m;
        for(auto val:nums2){
            while(!st.empty() && st.top() < val){
                m[st.top()]=val;
                st.pop();
            }
            st.push(val);
        }  
        while(!st.empty()){
            m[st.top()]=-1;
            st.pop();
        }
        vector<int> res;
        for(auto val:nums1){
            res.push_back(m[val]);
        }
        return res;
    }
};
