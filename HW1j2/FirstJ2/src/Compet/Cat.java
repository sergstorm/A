package Compet;

public class Cat implements Competetor{
    private int runleght;
    private int swimlenght;

    public Cat(int runleght, int swimlenght) {
        this.runleght = runleght;
        this.swimlenght = swimlenght;
    }

    @Override
    public int run(int p) {
        System.out.println("Cat run");return runleght;
    }

    @Override
    public void swim(int p) {
        System.out.println("Cat swim");
    }

    @Override
    public void showresults() {

    }
}
