package edu.csi523.sdawood.assignment1;

import javax.swing.*;
import java.applet.Applet;

public class Player {

    DataCell[] cells = new DataCell[9];
    String name;
    String symbol;

    private Player Players[];
    private int currentPlayer;
    private char myMark;
    private String[][] players = { { "Player 1", "X" }, { "Player 2", "O" } };


    @Override
    public void MarkCell(int row, int col) {
        if ((row >= 0) && (row < 3)) {
            if ((col >= 0) && (col < 3)) {
                if (board[row][col] == 'x') {
                    board[row][col] = currentPlayerMark;
                }
            }
        }
    }
   /*enum Mark{
       X, O;
   }*/


    public Player(String name, String symbol){
        players = new Player[];
        currentPlayer = 0;

        symbol = (num == 0 ? 'X' : 'O');
    }

    public void register(){

    }

    public static void main (String[] args){

    }
}
