package model;

import java.util.Objects;
import observer.LeafMonitor;


public class Leaf extends Offshoot {

    private String color;

    public Leaf(String color) {
        this.color = color;
        this.addObserver(new LeafMonitor());
    }

    public void changeColor(String c) {
        this.setChanged();
        this.notifyObservers(c);
        this.color = c;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Leaf leaf)) return false;
        return Objects.equals(color, leaf.color);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(color);
    }

    @Override
    public String toString() {
        return "Leaf{" + "color='" + color + '\'' + '}';
    }
}
