class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxele=0;
        int sum=0;
        for(int r:weights){
            maxele=Math.max(maxele,r);
            sum+=r;
        }
        int l=maxele;
        int r=sum;
        while(l<r){
            int mid=(l+r)/2;
            int dayc=1,cap=0;
            for(int w:weights){
                if(cap+w > mid){
                    dayc++;
                    cap=0;
                }
                cap+=w;
            }
            if(dayc<=days){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}

//similar to boquet sum 
