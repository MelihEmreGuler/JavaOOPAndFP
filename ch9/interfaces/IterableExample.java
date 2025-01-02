package ch9.interfaces;

import java.util.Collection;
import java.util.HashSet;

public class IterableExample {
    public static void main(String[] args) {
        Collection collection = new HashSet();
        collection.add("one");
        collection.add("five");
        collection.add("eleven");
        collection.add("nineteen");

        System.out.println(collection);

        for (Object o : collection)
            System.out.println(o);

        Iterable iterable = collection;
        iterable.forEach(s -> System.out.println(s + " has " + ((String)s).length() + " characters."));
    }

}
