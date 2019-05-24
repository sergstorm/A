package Barier;

import Compet.Competetor;

public class Wall implements Bars
{
  private int heght;

    public Wall(int heght) {
       // super(45);
        this.heght = heght;
    }

    @Override
    public boolean doit(Competetor c) {
            if (heght>c.run(23))
              return false;
            else return true;
    }
}