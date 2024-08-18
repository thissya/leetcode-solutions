class Solution {
    public long maxPoints(int[][] points) {
        int r=points.length;
        int c= points[0].length;
        long[] dp= new long[c];
        for(int i=0;i<c;i++)
        {
            dp[i]=points[0][i];
        }
        
        for(int i=1;i<r;i++)
        {
            long[] newdp = new long[c];
            long[] left = new long[c];
            long[] right= new long[c];

            left[0]=dp[0];
            for(int j=1;j<c;j++)
            {
                left[j]=Math.max(left[j-1]-1,dp[j]);
            }
            right[c-1]=dp[c-1];
            for(int j=c-2;j>=0;j--)
            {
                right[j]=Math.max(right[j+1]-1,dp[j]);
            }
            for(int j=0;j<c;j++)
            {
                newdp[j]=points[i][j]+Math.max(left[j],right[j]);
            }
            dp=newdp;
        }
        long ans=0;
        for(long i:dp)
        {
            ans=Math.max(ans,i);
        }
        return ans;
    }
}
