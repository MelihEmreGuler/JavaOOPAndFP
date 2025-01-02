package ch9.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample2 {
    /*
    Take as parameter an ArrayList whose elements are Integers
    and code a (generic) FindInverse method that returns the list inverted.
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);

        System.out.println(findInverse(arrayList1));
        int[] array = concatenateLists(arrayList1, arrayList2);
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static List<Integer> findInverse(ArrayList<Integer> aList) {
        return aList.reversed();
    }

    /*
    Code a (generic) concatenateLists method that takes two ArrayLists of type Integer as parameters
    and returns the concatenated array after concatenation.
    */
    private static int[] concatenateLists(ArrayList<Integer> aList1, ArrayList<Integer> aList2) {
        int[] array = new int[aList1.size() + aList2.size()];
        for (int i = 0; i < aList1.size(); i++) {
            array[i] = aList1.get(i);
        }
        for (int i = 0; i < aList2.size(); i++) {
            array[aList1.size() + i] = aList2.get(i);
        }
        return array;
    }
}
