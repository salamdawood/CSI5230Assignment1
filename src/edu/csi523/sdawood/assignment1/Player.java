package edu.csi523.sdawood.assignment1;

public class Player {
    private String playerName;
    private String symbol;

<<<<<<< HEAD
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
=======
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
>>>>>>> 5df63b7715ca73f8f079704728fee16693daac93
    }
}
