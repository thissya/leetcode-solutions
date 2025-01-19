class Solution {
public:
    vector<int> getRow(int rowIndex) {
        int n=rowIndex+1;
        vector<int> ans(n,0);
        ans[0]=1;
        if(n==1)return ans;
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                ans[j]+=ans[j-1];
            }
        }
        return ans;
    }
};
