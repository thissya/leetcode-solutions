class Solution {
    public int myAtoi(String s) 
    {
        int i=0,n=0,sign=1;
        while(i < s.length() && s.charAt(i) == ' ' )
        {
            i++;
        }
        if(i < s.length() && (s.charAt(i)=='-' || s.charAt(i)=='+'))
        {
            if(s.charAt(i)=='-'){
                sign=-1;}
            i++;
        }
        while(i <s.length() && s.charAt(i)>='0' && s.charAt(i)<='9' )
        {
            int rem=s.charAt(i)-'0';
            if(n>((Integer.MAX_VALUE-rem)/10))
            {
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            n=n*10+rem;
            i++;
        }
        return n*sign;
    }
}
