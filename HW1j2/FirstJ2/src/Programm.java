import Barier.Bars;
import Barier.River;
import Barier.Wall;
import Compet.Cat;
import Compet.Competetor;
import Compet.Human;

public class Programm {
    public static void main(String[] args) {
        System.out.println("Start");

        Competetor competetor[] = {new Human(12,13),new Cat(23,55)};  // Создаем команду
        Bars bars[] = {new Wall(23),new River(345)};// Создаем полосу препятствий

        for (Bars b:bars)
        {
            for (Competetor c : competetor)
            {
                b.doit(c);
            }
        }
         // Просим команду пройти полосу

        for (Competetor c : competetor)
        {
            c.showresults();
        }
        // Показываем результаты


    }
}
