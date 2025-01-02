package ch9.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

public class MapExample {
    public static void main(String[] args) {
        processMap();
    }

    static void processMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("five", 5);
        map.put("eleven", 11);
        map.put("nineteen", 19);

        System.out.println("\nEntry set");
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        entrySet.forEach(System.out::println);

        System.out.println("\nKeys");
        Set<String> keySet = map.keySet();
        keySet.forEach(System.out::println);

        System.out.println("\nValues");
        Collection<Integer> collection = map.values();
        collection.forEach(System.out::println);

        System.out.println("Putting 20 " + map.put("twenty", 20));

        System.out.println("Value of five: " + map.get("five"));

        System.out.println("Replacing a value key-value: " + map.replace("one", 10));
        System.out.println("Replacing a non-existent key-value: " + map.replace("two", 2));

        System.out.println("Put 30 if absent: " + map.putIfAbsent("thirty", 30));
        System.out.println("Put 30 if absent: " + map.putIfAbsent("thirty", 300));

        System.out.println("\nContains key one? " + map.containsKey("one"));
        System.out.println("Contains value five? " + map.containsValue(5));

    }
}
