class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
       unordered_map<int,int> m;
       int n=nums.size();
       for(int i=0;i<n;i++){
        m[nums[i]]++;
       }
       priority_queue<pair<int,int>> q;
       for(auto i:m){
        q.push({i.second,i.first});
       }
       vector<int> arr;
       int i=0;
       while(!q.empty() && i<k){
        arr.push_back(q.top().second);
        q.pop();
        i++;
       }
       return arr;
    }
};
