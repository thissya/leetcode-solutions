class Solution {
    public int res;
    public int totalNQueens(int n) {
        char[][] board =  new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        backtrack(board,0,n);
        return res;
    }

    public void backtrack(char[][] board,int row,int n){
        if(row==board.length){
            res++;
            return ;
        }

        for(int col=0;col<board.length;col++){
            if(canPlace(board,row,col,n)){
                board[row][col]='Q';
                backtrack(board,row+1,n);
                board[row][col]='.';
            }
        }
    }

    public boolean canPlace(char[][] board,int row,int col,int n){
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        for(int i=row-1,j=col-1;j>=0 && i>=0 ;j--,i--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        for(int i=row-1,j=col+1;j<n && i>=0 ;j++,i--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

}
