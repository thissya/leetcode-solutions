class Solution 
{
    public int numMagicSquaresInside(int[][] grid) 
    {
        int row=grid.length;
        int col=grid[0].length;
        int ans=0;
        for(int i=0;i<=row-3;i++)
        {
            for(int j=0;j<=col-3;j++)
            {
                if(isvalid(grid,i,j))
                {
                    ans++;
                }
            }
        }
        return ans;
    }
    public boolean isvalid(int[][] grid,int rs,int cs)
    {
        boolean[] val= new boolean[10];
        for(int i=rs;i<rs+3;i++)
        {
            for(int j=cs;j<cs+3;j++)
            {
                int n1=grid[i][j];
                if(n1<1 || n1>9 || val[n1])
                {
                    return false;
                }
                val[n1]=true;
            }
        }
        int sum=grid[rs][cs]+grid[rs][cs+1]+grid[rs][cs+2];
        for(int i=rs;i<rs+3;i++)
        {
            if((grid[i][cs]+grid[i][cs+1]+grid[i][cs+2] )!=sum)return false;
        }
        for(int i=cs;i<cs+3;i++)
        {
            if((grid[rs][i]+grid[rs+1][i]+grid[rs+2][i])!=sum)return false;
        }
        if((grid[rs][cs] + grid[rs+1][cs+1] +grid[rs+2][cs+2])!=sum)
        {
            return false;
        }
        return true;
    }
}
