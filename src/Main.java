import java.net.Proxy;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        /*
        * Станислав, не совсем понимаю, почему я не могу создать фрукт вот так:
        * Fruit apple1 = new Apple();
        * Ведь по логике я создаю ФРУКТ типа ЯБЛОКО. Метод apple1.getClass() говорит, что это class Apple.
        * Но компилятор подчеркивает apple1, когда я пытался его добавить в Box<Apple> appleBox1 = new Box<>(new ArrayList<>());
        * В итоге сделал так, как ниже:
        * */

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();


        Box<Apple> appleBox1 = new Box<>(new ArrayList<>());
        Box<Apple> appleBox2 = new Box<>(new ArrayList<>());
        Box<Apple> appleBox3 = new Box<>(new ArrayList<>());
        Box<Orange> orangeBox1 = new Box<>(new ArrayList<>());

        /*Метод добавления фрукта в корзину*/
        appleBox1.add(apple1);
        appleBox1.add(apple2);
        appleBox1.add(apple3);

        orangeBox1.add(orange1);
        orangeBox1.add(orange2);


        /*Метод сравнения корзин*/
        boolean compareBoxes = appleBox2.compare(appleBox1);
        System.out.println("Результат сравнения коробок: " + compareBoxes);
        System.out.println();


        System.out.println("Количество элементов в первой корзине: " + appleBox1.getFruits().size());
        System.out.println("Количество элементов во второй корзине: " + appleBox2.getFruits().size());
        System.out.println();


        /*Метод выведения элементов экземпляра класса */
        appleBox1.printEl(appleBox1);
        System.out.println();


        /*Метод перемещения фруктов из одной корзины в другую */
        appleBox1.move(appleBox2);

        System.out.println("Количество элементов в первой корзине: " + appleBox1.getFruits().size());
        System.out.println("Количество элементов во второй корзине: " + appleBox2.getFruits().size());

    }
}