class Solution 
{
    public int minimumDeletions(String s) {
        int c=0;
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='b')c++;
            else if(c>0)
            {
                ans++;
                c--;
            }
        }
        return ans;
    }
}
