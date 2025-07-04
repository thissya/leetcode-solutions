class Solution {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        backtrack(board,0);
        return res;
    }

    public void backtrack(char[][] board,int row){
        if(row==board.length){
            List<String> cur = new ArrayList<>();
            for(int i=0;i<board.length;i++){
                String temp = "";
                for(int j=0;j<board.length;j++){
                    temp+=board[i][j];
                }
                cur.add(temp);
            }
            res.add(cur);
            return ;
        }

        for(int i=0;i<board.length;i++){
            if(canPlace(board,row,i)){
                board[row][i]='Q';
                backtrack(board,row+1);
                board[row][i]='.';
            }
        }
    }

    public boolean canPlace(char[][] board,int row,int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        for(int r=row-1,c=col-1;r>=0 && c>=0;c--,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        for(int r=row-1,c=col+1;r>=0 && c<board.length;c++,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        return true;
    }

}
