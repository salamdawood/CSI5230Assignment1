package edu.csi523.sdawood.assignment1;

import javax.swing.*;

public class Oakland {

    public void CreateTTTGUI()
    {

    }

    public static void main(String[] args) {

        TTTGame tttGame = new TTTGame();
        JFrame myFrame=new JFrame("Test");
        myFrame.add(tttGame);
        myFrame.pack();
        myFrame.setVisible(true);
        tttGame.init();

    }


}
