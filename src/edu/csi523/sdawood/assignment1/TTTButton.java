package edu.csi523.sdawood.assignment1;

import java.awt.*;
import java.util.Observable;
import java.util.Observer;

<<<<<<< HEAD
public class TTTButton extends Button implements Observer {
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    private int index = 0;

    public TTTButton (int index) throws HeadlessException {
=======
public class TTTButton extends Button implements Observer
{

    Button [] tttButton=new Button[9];

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    private int index=0;

    public TTTButton(int index) throws HeadlessException {
>>>>>>> 5df63b7715ca73f8f079704728fee16693daac93
        this.index = index;
    }

    @Override
    public void update(Observable o, Object arg) {
        String symbol = (String) arg;
        setLabel(symbol);
<<<<<<< HEAD
=======

>>>>>>> 5df63b7715ca73f8f079704728fee16693daac93
    }
}
