package ch10;

import java.util.List;
import java.util.ArrayList;

public class FruitBox {
    private List<Fruit> fruits;

    public FruitBox() {
        fruits = new ArrayList<>();
    }

    public void printFruits() {
        System.out.println("Fruits in the box:");
        for (Fruit fruit : fruits) {
            System.out.print(fruit.getName());
            if (fruit instanceof Apple) {
                System.out.print(" " + ((Apple) fruit).getColor());
            }
            System.out.println();
        }
    }

    public void add(Fruit fruit) {
        fruits.add(fruit);
    }

    public void addAll(List<? extends Fruit> fruits) {
        this.fruits.addAll(fruits);
    }


}
