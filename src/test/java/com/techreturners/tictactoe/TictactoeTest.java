package com.techreturners.tictactoe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TictactoeTest {

@Test
    public void checkWinTest(){
        Tictactoe ttt = new Tictactoe();
        int[][] board ={{0,0,1},
                {0,1,2},
                {2,1,0}};
        int winner = ttt.checkWin(board);
        assertEquals(winner,0);

}

}
