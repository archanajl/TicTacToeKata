package com.archanajl.tictactoe;

public class Tictactoe {

    private int rowCountOne, rowCountTwo;
    private int colCountOne, colCountTwo;
    private int countZero, diagCountOne, diagCountTwo;

    public int checkWin(int[][] board){

        diagCountOne =0;
        diagCountTwo = 0;
        // check through the row and diagonals
        for(int i = 0; i < 3; i++){
             rowCountOne =0;
             rowCountTwo =0;
            for(int j = 0; j < 3; j++){
                // System.out.println(board[i][j]);
                if ((i == j) && (board[i][j] == 1)) diagCountOne++;
                if ((i == j) && (board[i][j] == 2)) diagCountTwo++;
                if(board[i][j] == 0) countZero++;
                if (board[i][j] == 1) rowCountOne++;
                if (board[i][j] == 2) rowCountTwo++;
            }
            if ((rowCountOne == 3) || (diagCountOne == 3)) return 1;
            if ((rowCountTwo == 3) || (diagCountTwo == 3)) return 2;

        }
        //Check through the columns
        for(int i = 0; i < 3; i++){
            colCountOne =0;
            colCountTwo =0;
            for(int j = 0; j < 3; j++){
                if (board[j][i] == 0) countZero++;
                if (board[j][i] == 1) colCountOne++;
                if (board[j][i] == 2) colCountTwo++;
            }
            if (colCountOne == 3) return 1;
            if (colCountTwo == 3) return 2;
        }
        // Not yet won and still zero exists, Game not yet finished
        if (countZero != 0) return 0;
        return 3;
    }
}

