class Solution {
    public int divide(int dividend, int divisor) 
    {
        
        if(dividend==Integer.MIN_VALUE && divisor==-1)
        {
            return Integer.MAX_VALUE;
        }
        if(dividend==Integer.MAX_VALUE && divisor==1)
        {
            return Integer.MAX_VALUE;
        }
        if(dividend==Integer.MIN_VALUE && divisor==1)
        {
            return Integer.MIN_VALUE;
        }
        if(dividend== divisor)
        {
            return 1;
        }
        boolean sign=dividend>0 ^ divisor>0 ;
        long n=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        int res=0;
        while(n>=d)
        {
            int c=0;
            while(n>=d<<(c+1))
            {
                c++;
            }
            n-=d*(1<<c);
            res+=1<<c;
        }
        return (sign)? -res:res;
}
}
