package edu.csi523.sdawood.assignment1;

public interface Observable {

    public void notifyListeners();

    public void registerObserver(Observer observer);
}
