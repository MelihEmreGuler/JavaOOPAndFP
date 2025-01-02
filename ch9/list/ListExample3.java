package ch9.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ListExample3 {
    /*
    Code the method named convertListToArray that takes an ArrayList of type Double as a parameter,
    sorts it from smallest to largest, then converts it to an array of Double and returns it.
    */
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(4d);
        arrayList.add(3d);
        arrayList.add(2d);

        Double[] array = convertListToArray(arrayList);
        for (double i : array){
            System.out.println(i);
        }
    }
    private static Double[] convertListToArray(ArrayList<Double> aList){
        aList.sort(new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return (int)(o1 - o2);
            }
        });
        //Collections.sort(aList);
        //aList.sort((o1, o2) -> (int)(o1 - o2));

        return aList.toArray(new Double[0]);
    }
}
