class Solution {
    public String longestPalindrome(String str) 
    {
        if(str.length()==1)
        {
            return str;
        }
        StringBuilder s = new StringBuilder(str);
        StringBuilder res= new StringBuilder();
        int n=str.length();
        int old_size=res.length();
        for(int i=0;i<n-1;i++)
        {
            if (res.length() > n-i) // Optimization (not to be time limit Exceeded)
            {
                continue;
            }
            for(int j=n;j>i;j--)
            {
                if(palindrom(s,i,j-1))
                {
                    String temp=s.substring(i,j);
                    int new_size=j-i;
                    if(new_size>old_size)
                    {
                        StringBuilder temp_res=new StringBuilder(temp);
                        res=temp_res;
                        old_size=new_size;
                    }
                }
            }
        }
        return res.toString();
    }
    public static boolean palindrom(StringBuilder s,int i,int j)
    {
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
