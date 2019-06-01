package Course;

import Barier.Bars;
import Compet.Competetor;

public class CorseRun implements Bars ,Competetor{


    @Override
    public int run(int p) {
        return p;
    }

    @Override
    public void swim(int p) {

    }

    @Override
    public void showresults() {

    }


    @Override
    public boolean doit(Competetor c) {
        return false;
    }
}
