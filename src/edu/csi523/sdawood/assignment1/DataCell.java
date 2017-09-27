package edu.csi523.sdawood.assignment1;

import java.util.Observable;

<<<<<<< HEAD
public class DataCell extends Observable {
    public DataCell(String value) {
        this.value = value;
    }
=======
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
>>>>>>> 5df63b7715ca73f8f079704728fee16693daac93

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        setChanged();
        notifyObservers(value);
    }

    private String value = null;

<<<<<<< HEAD
=======
    }
}*/
>>>>>>> 5df63b7715ca73f8f079704728fee16693daac93
}
