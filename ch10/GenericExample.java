package ch10;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        numberExample();
        fruitExample();
        boxExample();
    }

    private static void boxExample() {
        Box<Fruit> box = new Box<>();
        box.setItem(new Fruit("Pear"));
        box.printItem();

    }

    private static void fruitExample() {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Pear"));
        fruits.add(new Fruit("Watermelon"));

        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red"));
        apples.add(new Apple("green"));

        FruitBox fruitBox = new FruitBox();
        fruitBox.addAll(fruits);
        fruitBox.addAll(apples);

        fruitBox.printFruits();
    }

    private static void numberExample() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(calculateAverage(list));
    }

    static Double calculateAverage(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list){
            sum += n.doubleValue(); //type erasure
        }
        return sum/list.size();
    }

}
