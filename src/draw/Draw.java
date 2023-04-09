package draw;

import toys.Toy;
import toyscatalogue.ToysCatalogue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Draw {

    private Toy toy;
    private int start;
    private int end;

    public Toy getToy() {
        return toy;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }


}
