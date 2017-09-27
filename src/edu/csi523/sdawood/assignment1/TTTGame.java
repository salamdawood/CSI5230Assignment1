package edu.csi523.sdawood.assignment1;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TTTGame extends Applet {

    private char [][] board;
    private char currentPlayerMark = 'x';

    JPanel topPanel = new JPanel ();
    JPanel boardPanel = new JPanel();
    JPanel bottomPanel = new JPanel();
    Label turnLabel = new Label();
    Label winnerLabel = new Label();
    TTTButton[] startButton = new TTTButton[9];
    Button[] tttButton = new Button[9]; //need to change this to TTTButton
    int current = 0;
    Player [] players = new Player[2];
    Player currentPlayer = null;
    DataCell[] cells= new DataCell[9];

    void swapPlayer()
    {
        currentPlayer = currentPlayer == players[0] ? players[1] : players[0];
    }

    @Override
    public void init() {
        players[0] = new Player(playerName: "Nilesh Patel", symbol:"X");
        players[1] = new Player(playerName: "shova", symbol: "O");
        super.init();
        resize(250, 430);
        add(topPanel);
        add(boardPanel);
        add(bottomPanel);

        //Add top panel and its components
        topPanel.setPreferredSize(new Dimension(250,90));
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        topPanel.add(turnLabel);
        turnLabel.setText("Game is not started yet!!!");

        //Add Center Board
        boardPanel.setPreferredSize(new Dimension(250,250));
        boardPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        for (int i=0; i < 9; i++)
        {
            tttButton[i] = new TTTButton(i);
            cells[i] = new DataCell(value:"");
            cells[i].addObserver(tttButton[i]);
            tttButton[i].setPreferredSize(new Dimension(70,70));
            boardPanel.add(tttButton[i]);
            tttButton[i].addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    TTTButton source = (TTTButton)e.getSource();
                    int index = source.getIndex();
                    cells[index].setValue(currentPlayer.getSymbol);
                    swapPlayer();
                    source.setEnabled(false);
                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
        }

        //Add bottom Layout
        bottomPanel.setPreferredSize(new Dimension(250,90));
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        startButton.setLabel("Start Game");
      startButton.addMouseListener(new MouseListener() {

          @Override
          public void mouseClicked(MouseEvent e) {

          }

          @Override
          public void mousePressed(MouseEvent e) {

          }

          @Override
          public void mouseReleased(MouseEvent e) {

          }

          @Override
          public void mouseEntered(MouseEvent e) {

          }

          @Override
          public void mouseExited(MouseEvent e) {

          }
      });
        bottomPanel.add(startButton);
    }

    public void DisplayWinner (Player winningPlayer) {
        winnerLabel.setText("The winner is " + winningPlayer.name);
        topPanel.add(winnerLabel);
    }

}



