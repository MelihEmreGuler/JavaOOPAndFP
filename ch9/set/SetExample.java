package ch9.set;

import java.util.*;
import java.util.function.Predicate;

public class SetExample {
    public static void main(String[] args) {
        //processSet();
        //processUnmodifiableSet();
        //addSetToSet();
        addCollectionToSet();

    }

    static void processSet(){
        Set set = new HashSet();
        System.out.println(set.add(3));
        System.out.println(set.add(4));
        System.out.println(set.add("Melih"));
        System.out.println(set.add("Tarık"));
        System.out.println(set.add("Mert"));
        System.out.println(set.add(3));
        System.out.println(set.add("Mert"));

        System.out.println("Contains Melih: " + set.contains("Melih"));

        set.forEach(System.out::println);

        System.out.println("Filtering string objects");
        Predicate<Object> stringPredicate = s -> s instanceof String;
        set.removeIf(stringPredicate);
        set.forEach(System.out::println);


        System.out.println("Adding null to set.");
        System.out.println(set.add(null));
        System.out.println(set.add(null));
    }

    static void processUnmodifiableSet(){
        Set<String> set = Set.of("Mehmet", "Zeynep", "Tarık", "Melih", "Mert");

        //set.remove("Ali"); //UnsupportedOperationException

        //Set<String> set2 = Set.of("Mehmet", "Zeynep", "Tarık", "Melih", "Mert", null);//NullPointerException

    }

    static void addSetToSet(){
        Set set1 = new HashSet();
        set1.add("Mert");
        set1.add("Melih");
        set1.add("Tarık");

        Set set2 = new HashSet();
        set2.add(1);
        set2.add(2);
        set2.add(3);

        System.out.println("\nAdding set2 to the set1");
        System.out.println(set1.addAll(set2));
        set1.forEach(System.out::println);
    }

    static void addCollectionToSet(){
        Set set = new HashSet();
        set.add("Mert");
        set.add("Melih");
        set.add("Tarık");

        Collection coll = new ArrayList();
        coll.add("Şenel");
        coll.add("Emre");
        coll.add("Ahmet");
        coll.add("Şenel");
        coll.add("Emre");
        coll.add("Ahmet");

        System.out.println(set.addAll(coll));

        set.forEach(System.out::println);
    }
}
