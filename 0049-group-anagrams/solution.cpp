class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string,vector<string>> m;
        for(auto s:strs){
            string str=s;
            sort(str.begin(),str.end());
            m[str].push_back(s);
        }
        vector<vector<string>> res;
        for(auto val:m){
            res.push_back(val.second);
        }
        return res;
    }
};
