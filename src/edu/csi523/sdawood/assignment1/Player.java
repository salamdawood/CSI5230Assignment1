package edu.csi523.sdawood.assignment1;

public class Player {
    private String playerName;
    private String symbol;
    public DataCell[] cells = new DataCell[9];

    public Player(String playerName, String symbol) {
        this.playerName = playerName;
        this.symbol = symbol;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
