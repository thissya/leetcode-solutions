class Solution {
    public int climbStairs(int n) 
    {
        int a=0,b=1,c=0,i=0;
        while(i<n)
        {
            c=a+b;
            a=b;
            b=c;
            i++;
        }
        return c;
    }
}
