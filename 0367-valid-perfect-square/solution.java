class Solution {
    public boolean isPerfectSquare(int num) 
    {
        if(num<0)return false;
        if(num==1)return true;
        long l=1,r=num;
        while(l<=r)
        {
            long mid=(l+r)/2;
            if(mid*mid==num)return true;
            else if(mid*mid <num)l=mid+1;
            else r=mid-1;
        }
        return false;
    }
}
