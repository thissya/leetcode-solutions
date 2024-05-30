class Solution {
    public int numSteps(String s) 
    {
        int c=0,sum=0;
        for(int i=s.length()-1;i>0;i--)
        {
            int d=s.charAt(i)-'0';
            if(d+c==1)
            {
                c=1;
                sum+=2;
            }
            else{
                sum+=1;
            }
        }
        if(c==1)
        {
            sum+=1;
        }
        return sum;
    }
}
