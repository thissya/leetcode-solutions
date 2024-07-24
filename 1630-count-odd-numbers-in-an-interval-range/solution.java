class Solution 
{
    public int countOdds(int low, int high) 
    {
        return (high+1)/2 - low/2;        
    }
}
/*
int n=0;
        if(low%2==1)
        {
            n++;
            for(int i=low+1;i<high;i+=2)
            {
                n++;
            }
        }
        else{
            for(int i=low;i<high;i+=2)
            {
                n++;
            }
        }
        return n;
*/
