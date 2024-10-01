class Solution 
{
    public int mySqrt(int x) 
    {
        int l=1,r=x;
        int mid;
        while(l<=r)
        {
            mid=l+(r-l)/2;
            if((long)mid*mid > (long)x)
            {
                r=mid-1;
            }
            else if(mid*mid ==x)return mid;
            else{
                l=mid+1;
            } 
        }
        return Math.round(r);
    }
}
