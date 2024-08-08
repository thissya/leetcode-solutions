class Solution 
{
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) 
    {
        int r=rStart,c=cStart;
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        int k=0,d=0,numsteps=1;
        int total=rows*cols;
        int[][] ans = new int[total][2];
        while(k<total)
        {
            for(int i=0;i<2;i++)
            {
                for(int j=0;j<numsteps;j++)
                {
                    if(r>=0 && c>=0 && r<rows && c<cols)
                    {
                        ans[k++]=new int[]{r,c};
                    }
                    if(k==total)
                    {
                        return ans;
                    }
                    r+=dir[d][0];
                    c+=dir[d][1];
                }
                d=(d+1)%4;
            }
            numsteps++;
        }
        return ans;
    }
}
