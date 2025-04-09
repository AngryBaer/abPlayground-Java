package model;

import java.util.HashSet;
import java.util.Iterator;

public class Branch extends Offshoot{

    private HashSet<Offshoot> offshoots;

    public Branch() {
        this.offshoots = new HashSet<>();
    }

    public Branch(HashSet<Offshoot> offshoots) {
        this.offshoots = offshoots;
    }

    public HashSet<Offshoot> getOffshoots() {
        return offshoots;
    }

    public void setOffshoots(HashSet<Offshoot> offshoots) {
        this.offshoots = offshoots;
    }

    public void addOffshoot(Offshoot o) {
        if (!offshoots.contains(o)) {
            this.offshoots.add(o);
        }
    }

    public void changeColor(String c) {
        for (Offshoot o: this.offshoots) {
            o.changeColor(c);
        }
    }

    @Override
    public void sprayWithPesticide() {
        for (Offshoot o: this.offshoots) {
            o.sprayWithPesticide();
        }
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Branch branch)) return false;
        return offshoots.equals(branch.offshoots);
    }

    @Override
    public int hashCode() {
        return offshoots.hashCode();
    }

    @Override
    public String toString() {
        return "Branch{" + "offshoots=" + offshoots + '}';
    }

    public Iterator<Offshoot> iterator() {
        return this.offshoots.iterator();
    }
}
