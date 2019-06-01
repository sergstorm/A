package Compet;

public class Human implements Competetor{
   private int runleght;
   private int swimlenght;

    public Human(int runleght, int swimlenght) {
        this.runleght = runleght;
        this.swimlenght = swimlenght;
    }

    @Override
    public int run(int p) {
        System.out.println("Human Run");
        return runleght;
    }

    @Override
    public void swim(int p) {
        System.out.println("Human Swim");
    }

    @Override
    public void showresults() {

    }
}
