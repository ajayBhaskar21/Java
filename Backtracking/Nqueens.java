import javax.swing.text.Style;

class Nqueens{

    static boolean isSafe(int[][] board, int n, int row, int col){
        int i, j;
        // upper Diagonal
        for (i = row, j = col; i >= 0 && j >= 0; j--, i--){
            if (board[i][j] == 1){
                return false;
            }
        }

        // lower diagonal
        for (i = row, j = col; i < n && j >= 0; j--, i++){
            if (board[i][j] == 1){
                return false;
            }
        }

        // left horizontal
        for (j = col; j >= 0; j--){
            if (board[row][j] == 1){
                return false;
            }
        }


        return true;

    }

    static void show(int[][] board, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void solve(int[][] board, int n, int col){

        if (col == n){
            
            show(board, n);
            System.out.println();
            return;
        }

        for (int row = 0; row < n; row++){

            if (isSafe(board, n, row, col)){
                board[row][col] = 1;
                solve(board, n, col + 1);
                board[row][col] = 0;

            }
        }


        
    }

    static void solveQueens(int n){

        int[][] board = new int[n][n];
        solve(board, n, 0);

        

    }

    public static void main(String[] args) {
        
        solveQueens(5);

    }
}