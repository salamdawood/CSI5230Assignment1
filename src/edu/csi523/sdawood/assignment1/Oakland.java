package edu.csi523.sdawood.assignment1;

import javax.swing.*;

public class Oakland {

    public static void CreateTTTGUI()
    {
        TTTGame tttGame = new TTTGame();
        JFrame myFrame=new JFrame("Test");

        myFrame.pack();
        myFrame.setVisible(true);
        tttGame.init();
        myFrame.add(tttGame);
        int frameWidth = 300;
        int frameHeight = 430;
        myFrame.setSize(frameWidth, frameHeight);

    }

    public static void main(String[] args) {

        CreateTTTGUI();

    }


}
