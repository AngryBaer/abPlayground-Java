import model.Branch;
import model.Leaf;
import model.Offshoot;
import model.Tree;

public class Main {
    public static void main(String[] args) {

        Branch branch1 = new Branch();
        Branch branch2 = new Branch();

        Leaf leaf1 = new Leaf("green");
        Leaf leaf2 = new Leaf("yellow");
        Leaf leaf3 = new Leaf("orange");

        branch1.addOffshoot(branch2);
        branch1.addOffshoot(leaf1);
        branch2.addOffshoot(leaf2);
        branch2.addOffshoot(leaf3);

        Tree tree1 = new Tree(branch1);

        printLeaves(branch1);
        // Leaf{color='yellow'}
        // Leaf{color='orange'}
        // Leaf{color='green'}

        sprayTree(tree1);
        // Spraying: Leaf{color='yellow'}
        // Spraying: Leaf{color='orange'}
        // Spraying: Leaf{color='green'}

        // change color of all leaves to red
        // notify the monitor of all changes
        branch1.changeColor("red");

        printLeaves(branch1);
        // Leaf{color='red'}
        // Leaf{color='red'}
        // Leaf{color='red'}
    }

    private static void printLeaves(Offshoot start) {
        // recursive function to list all Leaves in a branch.
        if (start instanceof Leaf) {
            System.out.println(start);
        } else if (start instanceof Branch branch) {
            for (Offshoot o: branch.getOffshoots()) {
                printLeaves(o);
            }
        }

    }

    private static void sprayTree(Tree tree) {
        // use internal tree iterator to reach every Leaf.
        for (Offshoot o: tree) {
            o.sprayWithPesticide();
        }
    }
}
