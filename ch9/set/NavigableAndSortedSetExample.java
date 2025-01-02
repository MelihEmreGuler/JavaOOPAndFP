package ch9.set;

import java.util.*;

public class NavigableAndSortedSetExample {
    public static void main(String[] args) {
        Set set = new TreeSet();
        System.out.println(set.add("Mustafa"));
        System.out.println(set.add("Hatice"));
        System.out.println(set.add("Melih"));
        System.out.println(set.add("Tarık"));
        System.out.println(set.add("Mert"));
        System.out.println(set.add("Tarık"));
        System.out.println(set.add("Mert"));

        set.forEach(System.out::println);

        sortedSetProperties((SortedSet) set);
        navigableSetProperties((NavigableSet) set);
    }

    static void sortedSetProperties(SortedSet sortedSet) {
        System.out.println("SortedSet Interface Functionalities");
        System.out.println("First: " + sortedSet.first());
        System.out.println("Last: " + sortedSet.last());

        Comparator comparator = sortedSet.comparator();
        if (comparator != null)
            System.out.println(comparator.getClass().getName());

        SortedSet subSet = sortedSet.subSet("Melih", "Tarık");
        System.out.println(subSet);

        SortedSet headSet = sortedSet.headSet("Mert");
        System.out.println(headSet);

        SortedSet tailSet = sortedSet.tailSet("Mert");
        System.out.println(tailSet);
    }

    static void navigableSetProperties(NavigableSet navigableSet) {
        System.out.println("Navigable Interface Functionalities");
        System.out.printf("First : %s \n", navigableSet.first());
        System.out.printf("Last : %s \n", navigableSet.last());
        System.out.printf("Head set lower than \"Melih\" : %s\n", navigableSet.headSet("Melih"));
        System.out.printf("Head set lower than \"Melih\" including \"Melih\" : %s\n", navigableSet.headSet("Melih", true));
        System.out.printf("Head set lower than \"Melih\" excluding \"Melih\" : %s\n", navigableSet.headSet("Melih", false));
        System.out.printf("Tail set greater than or equal to \"Melih\" : %s\n", navigableSet.tailSet("Melih"));
        System.out.printf("Tail set greater than or equal to including \"Melih\" : %s\n", navigableSet.tailSet("Melih", true));
        System.out.printf("Tail set greater than or equal to excluding \"Melih\" : %s\n", navigableSet.tailSet("Melih", false));
        System.out.printf("Least element higher than \"Melih\" : %s\n", navigableSet.higher("Melih"));
        System.out.printf("Greatest element lower than \"Melih\" : %s\n", navigableSet.lower("Melih"));
        System.out.printf("Least element grater than or equal to \"Mert\" : %s\n", navigableSet.ceiling("Mert"));
        System.out.printf("Greatest element lower than or equal to \"Mert\" : %s\n", navigableSet.floor("Mert"));
        System.out.printf("Descending set : %s\n", navigableSet.descendingSet());
    }
}
