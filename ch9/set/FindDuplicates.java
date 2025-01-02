package ch9.set;

import java.util.Set;
import java.util.TreeSet;

public class FindDuplicates {
    public static void main(String[] args) {
        Set set = new TreeSet();

        for (String arg : args) {
            if (!set.add(arg))
                System.out.println("Duplicate detected: " + arg);
        }
        System.out.println("size: " + set.size() + " distinct: " + set);

    }
}
