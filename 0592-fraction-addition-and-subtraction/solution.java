class Solution {
    public String fractionAddition(String expression) 
    {
        String frs[]=expression.split("(?=[+-])");
        long num=0,den=1;
        for(String fr:frs)
        {
            String cur[]=fr.split("/");
            long a = Long.parseLong(cur[0]);
            long b = Long.parseLong(cur[1]);
            num=num*b + a*den;
            den = den*b;
        }
        if(num==0) return "0/1";
        long gcd = gcd(Math.abs(num),Math.abs(den));
        num/=gcd;
        den/=gcd;
        return num+"/"+den;
    }
    public long gcd(long a,long b)
    {
        if(a==b)return a;
        if(a>b)return gcd(a-b,b);
        return gcd(a,b-a);
    }
}
