class Solution {
    public boolean isPalindrome(int x)
    {
        if(x<0)
        {
            return false;
        }
        else
        {
            int n=x;
            int rev=0,rem;
            while(x>0)
            {
                rem=x%10;
                x=x/10;
                rev=rev*10+rem;
            }
            if(rev==n)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        
    }
}
