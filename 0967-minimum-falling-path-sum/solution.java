class Solution {
    
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=n-2;i>=0;i--){
            for(int j=0;j<m;j++){
                int left =(j==0)?Integer.MAX_VALUE:matrix[i+1][j-1];
                int down = matrix[i+1][j];
                int right = (j==m-1)?Integer.MAX_VALUE:matrix[i+1][j+1];
                matrix[i][j] = matrix[i][j]+Math.min(left,Math.min(down,right));
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            ans = Math.min(ans,matrix[0][i]);
        }
        return ans;

    }
}

/*

int n,m;
    int[][] dp;
    public int minFallingPathSum(int[][] matrix) {
        n=matrix.length;
        m=matrix[0].length;
        dp =  new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            ans = Math.min(ans,recur(0,i,matrix));
        }
        return ans;
    }

    public int recur(int i,int j,int[][] matrix){
        if(i<0 || j<0 || i>=n || j>=m){
            return Integer.MAX_VALUE;
        }
        
        if(i==n-1 ){
            return matrix[i][j];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int left=recur(i+1,j-1,matrix);
        int down=recur(i+1,j,matrix);
        int right=recur(i+1,j+1,matrix);
        dp[i][j]=matrix[i][j]+Math.min(left,Math.min(down,right));
        return dp[i][j];
    }

*/
