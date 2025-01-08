class Solution {
    public boolean check(int i,int j,int r,int c,int ind,char[][] board, String word , int[][] visited){
        if(ind==word.length())return true;
        if(i<0 || i>=r ||j<0 || j>=c){
            return false;
        }
        if(board[i][j]!=word.charAt(ind))return false;
        if(visited[i][j]==1)return false;
        
        visited[i][j]=1;
        if(check(i+1,j,r,c,ind+1,board,word,visited)||check(i-1,j,r,c,ind+1,board,word,visited) || check(i,j+1,r,c,ind+1,board,word,visited)||check(i,j-1,r,c,ind+1,board,word,visited)){
            return true;
        }
        visited[i][j]=0;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int r=board.length;
        int c=board[0].length;
        int[][] visited= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                char ch=board[i][j];
                if(ch==word.charAt(0)){
                    boolean a=check(i,j,r,c,0,board,word,visited);
                    if(a==true){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
