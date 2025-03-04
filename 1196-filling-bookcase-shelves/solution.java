class Solution 
{
    public int minHeightShelves(int[][] books, int shelfWidth) 
    {
        int n=books.length;
        int[] dp= new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++)
        {
            dp[i]=books[i-1][1]+ dp[i-1];
            int h=books[i-1][1];
            int w=books[i-1][0];
            for(int j=i-2; j>=0;j--)
            {
                if(w+books[j][0]>shelfWidth)
                {
                    break;
                }
                w+=books[j][0];
                h=Math.max(h,books[j][1]);
                dp[i]=Math.min(dp[i],h+dp[j]);
            }
        }
        return dp[n];
    }
}
