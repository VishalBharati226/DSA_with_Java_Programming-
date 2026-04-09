class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++)
            Arrays.fill(board[i], '.');
        backtrack(0, n, board, res);
        return res;
    }

    private void backtrack(int row, int n, char[][] board, List<List<String>> res){
        if(row == n){
            List<String> temp = new ArrayList<>();
            for(int i=0;i<n;i++)
                temp.add(new String(board[i]));
            res.add(temp);
            return;
        }

        for(int j=0;j<n;j++){
            if(isSafe(board, row, j, n)){
                board[row][j] = 'Q';
                backtrack(row+1, n, board, res);
                board[row][j] = '.';
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col, int n){
        // check column
        for(int i=0;i<row;i++)
            if(board[i][col]=='Q') return false;
        // diag left
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
            if(board[i][j]=='Q') return false;
        // diag right
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++)
            if(board[i][j]=='Q') return false;
        return true;
    }
}