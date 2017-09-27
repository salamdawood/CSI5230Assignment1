package edu.csi523.sdawood.assignment1;

import java.util.ArrayList;

public class DataCell extends java.util.Observable {
    private  String value = null;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        setChanged();
        notifyObservers(value);
    }

    public DataCell(String value) {
        this.value = value;
    }

/*public class dataCellObserable implements Observable {

    public void notifyListeners() {

    }

    public void registerObserver(Observer observer) {

    }
}*/
}
