package Barier;

import Compet.Competetor;

public class River implements Bars {
    private int length;

    public River(int length) {
       // super(55);
        this.length = length;
    }


    @Override
    public boolean doit(Competetor c) {
        return false;
    }
}
