package model;

import java.util.Iterator;

public class Tree implements Iterable<Offshoot>{
    Branch branch;

    public Tree(Branch branch) {
        this.branch = branch;
    }

    public Iterator<Offshoot> iterator() {
        return branch.iterator();
    }
}
