class Solution {
    public int n,m;
    public int minimumTotal(List<List<Integer>> triangle) {
        n = triangle.size();
        m = triangle.get(n-1).size();
        int[][] dp = new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return recur(0,0,dp,triangle);
    }
    public int recur(int i,int j,int[][] dp,List<List<Integer>> triangle){
        if(i==n-1){
            return triangle.get(i).get(j);
        }
        if(dp[i][j]!= -1){
            return dp[i][j];
        }
        int first = recur(i+1,j,dp,triangle);
        int sec = recur(i+1,j+1,dp,triangle);
        dp[i][j] = triangle.get(i).get(j)+Math.min(first,sec);
        return dp[i][j];
    }
}
