package ch9.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {
    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        aList.add("Ali");
        aList.add("Veli");
        System.out.println(aList.size());
        System.out.println(aList.getFirst()); //System.out.println(aList.get(0));
        aList.set(0, "Hakan");
        aList.removeFirst(); //aList.remove(0);
        aList.add("Ayşe");
        for (String str: aList){
            System.out.println(str);
        }
    }
}
