package edu.csi523.sdawood.assignment1;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;


public class TTTGame extends Applet {

    JPanel topPanel = new JPanel ();
    JPanel boardPanel = new JPanel();
    JPanel bottomPanel = new JPanel();
    Label turnLabel = new Label();
    Button startButton = new Button();
    Button[] tttButton = new Button[9];

    @Override
    public void init() {
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
            tttButton[i] = new Button();
            tttButton[i].setPreferredSize(new Dimension(70,70));
            boardPanel.add(tttButton[i]);
        }

        //Add bottom Layout
        bottomPanel.setPreferredSize(new Dimension(250,90));
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        startButton.setLabel("Start Game");
//        startButton.addMouseListener(new MouseListener() {
//
//        });
        bottomPanel.add(startButton);
    }

    public void CreateBoard(){
        init();
    }

}



