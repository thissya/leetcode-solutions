class Solution 
{
    public boolean isOneBitCharacter(int[] bits) 
    {
        int n=bits.length;
        if(n==1)
        {
            return true;
        }
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(bits[i]==1)
            {
                i++;
                f=0;
            }
            else
                f=1;
        }
        return f==1?true:false;
    }
}
