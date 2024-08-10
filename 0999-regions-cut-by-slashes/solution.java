class Solution {
    public int regionsBySlashes(String[] grid) 
    {
        int n=grid.length;
        int ans=0;
        int arr[][]= new int[n*3][n*3];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int row=i*3;
                int col=j*3;
                if(grid[i].charAt(j)=='/')
                {
                    arr[row+2][col]=1;
                    arr[row+1][col+1]=1;
                    arr[row][col+2]=1;
                }
                else if(grid[i].charAt(j)=='\\')
                {
                    arr[row][col]=1;
                    arr[row+1][col+1]=1;
                    arr[row+2][col+2]=1;
                }
                
            }
        }  
        for(int i=0;i<n*3;i++)
        {
            for(int j=0;j<n*3;j++)
            {
                if(arr[i][j]==0)
                {
                    bfs(arr,i,j);
                    ans++;
                }
            }    
        }  
        return ans;
    }
    public void bfs(int arr[][],int row,int col)
    {
        int dir[][]={{0,1},{1,0},{-1,0},{0,-1}};
        Queue<int[]> que= new LinkedList<>();
        que.add(new int[]{row,col});
        arr[row][col]=1;
        while(!que.isEmpty())
        {
            int cell[]=que.poll();
            for(int i=0;i<4;i++)
            {
                int nrow=dir[i][0]+cell[0];
                int ncol=dir[i][1]+cell[1];
                if(nrow>=0 && ncol>=0 && nrow<arr.length && ncol<arr.length && arr[nrow][ncol]==0)
                {
                    que.add(new int[]{nrow,ncol});
                    arr[nrow][ncol]=1;
                }
            }
        }
    }
}
