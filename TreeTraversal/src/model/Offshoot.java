package model;

import java.util.Observable;

public abstract class Offshoot extends Observable {

    public abstract void changeColor(String c);

    public void sprayWithPesticide() {
        System.out.println("Spraying: " + this);
    }

    @Override
    public String toString() {
        return "Offshoot";
    }
}
