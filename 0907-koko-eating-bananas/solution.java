class Solution {
    public int max(int[] piles){
        int max=0;
        for(int j=0;j<piles.length;j++){
            if(piles[j]>max)max=piles[j];
        }
        return max;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=max(piles);
        int n=piles.length;
        int l=1;
        int r=max;
        while(l<r){
            int mid=(l+r)/2;
            int sum=0;
            for(int j:piles){
                int val=(j/mid)+((j%mid!=0) ? 1:0);
                sum+=val;
                if(sum>h)break;
            }
            if(sum<=h){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}




