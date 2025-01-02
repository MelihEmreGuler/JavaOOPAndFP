package ch9.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        Collection collection = new HashSet();
        collection.add("one");
        collection.add("five");
        collection.add("eleven");
        collection.add("nineteen");

        System.out.println(collection);

        Iterator it = collection.iterator();

        //collection.add("two"); //ConcurrentModificationException
        //collection.remove("five"); //ConcurrentModificationException

        while (it.hasNext()){
            String s = (String) it.next();
            System.out.println("Element: " + s);
            if (s.startsWith("o"))
                it.remove();
        }

        System.out.println(collection);


    }
}
