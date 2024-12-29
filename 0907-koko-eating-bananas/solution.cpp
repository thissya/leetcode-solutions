class Solution {
public:
    int minEatingSpeed(vector<int>& piles, int h) {
        int l=1;
        int r=1e9;
        while(l<r){
            int mid=(l+r)/2;
            int sum=0;
            for(auto j:piles){
                int val=(j/mid)+(j%mid !=0);
                sum+=val;
                if(sum>h)break;
            }
            if(sum<=h)r=mid;
            else{
                l=mid+1;
            }
        }
        return l;
    }
};
