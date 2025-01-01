class Solution {
public:
    int maxScore(string s) {
        int ans=0;
        for(char c : s){
            if(c=='0')ans++;
        }
        int zero=0;
        int maxs=0,n=s.length();
        for(int i=1;i<n;i++){
            if(s[i-1]=='0'){
                zero++;
                ans--;
            }
            int leftsum=zero;
            int rightsum=(n-i-ans);
            maxs=std::max(maxs,leftsum+rightsum);
        }
        return maxs;
    }
};
