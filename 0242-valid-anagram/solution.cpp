class Solution {
public:
    bool isAnagram(string s, string t) {
        unordered_map<char,int> map;
        int n=s.length();
        int m=t.length();
        if(n!=m)return false;
        for(int i=0;i<n;i++){
            map[s.at(i)]++;
            map[t.at(i)]--;
        }
        for(int i=0;i<n;i++){
            if(map[s.at(i)]!=0){
                return false;
            }
        }
        return true;
    }
};
