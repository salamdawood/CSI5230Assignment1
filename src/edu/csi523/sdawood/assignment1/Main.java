package edu.csi523.sdawood.assignment1;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main extends Applet {

    Panel topPanel = new Panel();
    Panel boardPanel = new Panel();
    Panel bottomPanel = new Panel();
    Label turnLabel = new Label();
    Button startButton = new Button();
    TTTButton[] tttButton = new TTTButton[9];

    Player[] players = new Player[2];
    Player currentPlayer = null;

    DataCell[] cells = new DataCell[9];

    void swapPlayer () {

        currentPlayer = currentPlayer == players[0] ? players[1] : players[0];

        turnLabel.setText("Player: " + currentPlayer.getPlayerName());

    }

    @Override
    public void init() {

        currentPlayer = players[0] = new Player("Salam Dawood", "X");
        players[1] = new Player("John Doe", "O");

        super.init();
        resize(250, 430);
        add(topPanel);
        add(boardPanel);
        add(bottomPanel);
        // Add top panel and its components
        topPanel.setPreferredSize(new Dimension(250,90));
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        topPanel.add(turnLabel);
        turnLabel.setText("Game is not started yet!!!");
        // Add Center Board
        boardPanel.setPreferredSize(new Dimension(250, 250));
        boardPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        for (int i = 0; i < 9; i++)
        {
            tttButton[i] = new TTTButton(i);
            cells[i] = new DataCell("");
            cells[i].addObserver(tttButton[i]);
            tttButton[i].setPreferredSize(new Dimension(70,70));
            boardPanel.add(tttButton[i]);
            tttButton[i].setEnabled(false);
            tttButton[i].addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    TTTButton source = (TTTButton)e.getSource();
                    int index = source.getIndex();
                    cells[index].setValue(currentPlayer.getSymbol());
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
        bottomPanel.setPreferredSize(new Dimension(250, 90));
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        startButton.setLabel("Start Game");
        startButton.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                StartGame();
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

    public void StartGame() {
        turnLabel.setText("Player: " + currentPlayer.getPlayerName());

        for (int i=0; i<9; i++){
            //enable buttons and clear any value from last game
            tttButton[i].setLabel("");
            tttButton[i].setEnabled(true);
            //clear data cell values from previous game played
            cells[i].setValue("");

        }

    }

}
