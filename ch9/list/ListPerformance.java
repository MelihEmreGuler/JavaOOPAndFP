package ch9.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformance {
    private static int n = 1_000_000;

    public static void main(String[] args) {
        arrayListInsertion();
        linkedListInsertion();
    }

    static void arrayListInsertion() {
        ArrayList aList = new ArrayList();
        double start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            aList.add(0, i); // add to head
            //aList.add(i); // add to end
        }
        double end = System.currentTimeMillis();
        System.out.println("Time for ArrayList is " + (end - start));
    }

    static void linkedListInsertion() {
        List lList = new LinkedList();
        double start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            lList.add(0, i); // add to head
            //lList.add(i); // add to end
        }
        double end = System.currentTimeMillis();
        System.out.println("Time for LinkedList is " + (end - start));
    }
}
