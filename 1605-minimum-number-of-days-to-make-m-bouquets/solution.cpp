class Solution {
public:
    int minDays(vector<int>& bloomDay, int m, int k) {
        int n=bloomDay.size();
        if(n< (long)m*k){
            return -1;
        }

        int max = *max_element(bloomDay.begin(),bloomDay.end());
        int l=1,r=max;
        int ans=-1;
        while(l<r){
            int mid=(l+r)/2;
            int bc=0,nofb=0;
            for(auto bloom:bloomDay){
                if(bloom<=mid){
                    bc++;
                }
                else{
                    bc=0;
                }
                
                if(bc==k){
                    nofb++;
                    bc=0;
                }
            }
            if(nofb>=m){
                r=mid;
                ans=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
};
