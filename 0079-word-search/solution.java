class Solution {
    public boolean exist(char[][] board, String word) {
        int[][] visited= new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean res= recur(board,word,i,j,0,visited);
                    if(res)return true;
                }
            }
        }
        return false;
    }

    public boolean recur(char[][] board ,String word , int i,int j,int ind,int[][] visited){
        if(ind == word.length() )return true;
        boolean exp1 = (0<=i && i<board.length);
        boolean exp2 = (0<=j && j<board[0].length);
        
        if(!exp1 || !exp2) return false;
        if(visited[i][j]==1)return false;
        if(board[i][j]!=word.charAt(ind))return false;
        
        visited[i][j]=1;

        if(recur(board,word,i+1,j,ind+1,visited) || 
           recur(board,word,i-1,j,ind+1,visited) || 
           recur(board,word,i,j+1,ind+1,visited) || 
           recur(board,word,i,j-1,ind+1,visited))
        {
            return true;
        }
        visited[i][j]=0;
        return false; 
    }


}
