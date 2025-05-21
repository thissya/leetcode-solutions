class Solution {
    public void recur1(int row,int col,int[][] mat,int c){
        if(col>=c){
            return ;
        }
        mat[row][col]=0;
        recur1(row,col+1,mat,c);
    }
    public void recur2(int row,int col,int[][] mat,int r){
        if(row>=r){
            return ;
        }
        mat[row][col]=0;
        recur2(row+1,col,mat,r);
    }
    public void setZeroes(int[][] mat) {
        List<int[]> list = new ArrayList<>();
        int r=mat.length;
        int c=mat[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==0)
                    list.add(new int[] {i,j});
            }
        }   
        for(int[] cur:list){
            int i=cur[0];
            int j=cur[1];
            recur1(i,0,mat,c);
            recur2(0,j,mat,r);
        }
    }
}
