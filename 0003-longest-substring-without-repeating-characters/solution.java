class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int[] hash= new int[128];
        int left=0;
        int res=0;
        for(int right=0;right<s.length();right++)
        {
            hash[s.charAt(right)]++;
            while(hash[s.charAt(right)] >1)
            {
                hash[s.charAt(left)]--;
                left++;
            }
            res=Math.max(res,right-left+1);
        }
        return res;
    }
}

/*
class Solution 
{
    public int lengthOfLongestSubstring(String str) 
    {
        String c="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ ";
        if(str.contains(c))
        {
            return c.length();
        }
        if(str.length()==1)
        {
            return 1;
        }
        StringBuilder s= new StringBuilder(str);
        StringBuilder res= new StringBuilder();
        int n=str.length();
        int old_len=res.length();
        for(int i=0;i<n-1;i++)
        {
            if(res.length() > n-i)
            {
                continue;
            }
            for(int j=n;j>i;j--)
            {
                if(norepeatation(s,i,j))
                {
                    if(old_len< (j-i))
                    {
                        old_len=j-i;
                    }
                }
            }
        }
        return old_len;
    }
    public static boolean norepeatation(StringBuilder s,int start,int end)
    {
        for(int i=start;i<end;i++)
        {
            for(int j=end-1;j>i;j--)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
*/
