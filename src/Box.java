import java.util.ArrayList;
import java.util.Comparator;

public class Box<T extends Fruit> {

    public ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }


    /* Метод получения веса коробки */
    public double getWeight() {
        double sumWeight = 0;
        for (Fruit fr: fruits) {
            sumWeight += fr.getWeight();
        }
        return sumWeight;
    }

    /*Метод compare() */
    public boolean compare(Box<T> box) {
        return this.getWeight() == box.getWeight();
    }

    /* Метод перекладывания фруктов из одной коробки в другую */
    public void move(Box<T> box) {
        ArrayList<T> box1 = this.getFruits();
        for (T fr: box1) {
            box.getFruits().add(fr);
        }
        box1.clear();
    }


    /* Метод добавления фрукта в коробку*/
    public void add(T fruit) {
        fruits.add(fruit);
    }


    /* Метод выведения элементов коробки */
    public void printEl(Box<T> box){
        System.out.print("В корзине такие фрукты: ");
        for (T fr : box.getFruits()) {
            System.out.print(fr.toString() + " ");
        }
        System.out.println();
    }

}

