class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>> res = new ArrayList<>();
        backtrack(board,0,res);
        return res;
    }

    public void backtrack(char[][] board,int row,List<List<String>> res){
        int n = board.length;
        if(row == n){
            List<String> cur = new ArrayList<>();
            for(int i=0;i<n;i++){
                String str ="";
                for(int j =0;j<n;j++){
                    str+=board[i][j];
                }
                cur.add(str);
            }
            res.add(cur);
            return;
        }

        for(int col=0;col<n;col++){
            if(canPlace(board,row,col)){
                board[row][col]='Q';
                backtrack(board,row+1,res);
                board[row][col]='.';
            }
        }
    }

    public boolean canPlace(char[][] board,int row,int col){
        int n=board.length;
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        for(int i=row-1,j=col-1;i>=0 && j>=0 ;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

}
