package edu.csi523.sdawood.assignment1;

import javax.swing.*;
import java.applet.Applet;

public class Player {

    private String symbol;
    private String playerName;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Player(String name, String symbol){
        this.playerName = name;
        this.symbol = symbol;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
