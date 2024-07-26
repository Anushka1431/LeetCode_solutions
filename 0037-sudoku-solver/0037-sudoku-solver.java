class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);        
    }
    static boolean solve(char[][] board){
        int row=-1;
        int col=-1;
        boolean leftisfull=true;
        int n=board.length;

        //check if its empty then put row and col there;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(board[i][j]=='.') {
                row=i;
                col=j;
                leftisfull=false;//this means it is empty
                break;//once empty cell is found exit the inner loop
               }
            }
            if(leftisfull==false){
            break;//once empty cell is foud exit from outer loop too
        }
        }
        //now if there are no empty celles left and everything is full the say true
        if(leftisfull==true){
            return true;
        }       
        //if its safe then put that row and col and play the funtion again for true
        //here iterate from 1 to 9 and put the suitable number and if the function then can return true then do that or else backtrack and set everything back to '.'
        for(char num='1';num<='9';num++){
            if(issafe(board,row,col,num)){
                board[row][col]=num;
                if(solve(board)==true){
                    return true;
                }
                else{
                    board[row][col]='.';
                }
            }
        }
        return false;
    }
    //make an issafe function which checks for row col and box and return f safe or not 
    static boolean issafe(char[][] board, int row, int col, int num){
        //check for each row
        for(int i=0;i<board.length;i++){
            if(board[row][i]==num){
                return false;
            }
        }
        //check for col
        for(int i=0;i<board.length;i++){
            if(board[i][col]==num){
                return false;
            }
        }
        //check for box 
        //for any position in the box the starting position of the block is the number - number mod the sqrt of board size
        int sqrt=(int)Math.sqrt(board.length);
        int rowstart=row-row%sqrt;
        int colstart=col-col%sqrt;
        for(int i=rowstart;i<rowstart+sqrt;i++){
            for(int j=colstart;j<colstart+sqrt;j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }

}
//explanation 
/*
solveSudoku Method:
This is the main method that starts the solving process by calling the solve method.

solve Method:
This method uses recursion and backtracking to solve the Sudoku puzzle.
It finds the first empty cell on the board. If no empty cell is found, the puzzle is solved.
For each empty cell, it tries placing each digit from '1' to '9'.
If placing a digit leads to a solution, it returns true. If not, it backtracks and tries the next digit.

isSafe Method:
This method checks if placing a digit in a given cell is valid.
It ensures the digit is not already present in the same row, column, or 3x3 sub-grid.
*/