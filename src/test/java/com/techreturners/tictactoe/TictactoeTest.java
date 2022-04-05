package com.techreturners.tictactoe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TictactoeTest {

@Test
    public void checkWinNotFinishedTest(){
        Tictactoe ttt = new Tictactoe();
        int[][] board ={{0,0,1},
                {0,1,2},
                {2,1,0}};
        int winner = ttt.checkWin(board);
        assertEquals(0,winner);

}

@Test
    public void checkWinOneDiagonallyTest(){
        Tictactoe ttt = new Tictactoe();
        int[][] board ={{1,0,0},
                {2,1,0},
                {0,2,1}};
        int winner = ttt.checkWin(board);
        assertEquals(1,winner);

    }

    @Test
    public void checkWinTwoColTest(){
        Tictactoe ttt = new Tictactoe();
        int[][] board ={{2,1,0},
                {2,1,2},
                {2,0,0}};
        int winner = ttt.checkWin(board);
        assertEquals(2,winner);

    }

}
