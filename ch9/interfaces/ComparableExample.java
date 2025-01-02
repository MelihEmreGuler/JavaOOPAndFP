package ch9.interfaces;

import ch1.factory.Employee;
import ch9.domain.ComparableEmployee;

import java.util.Date;

public class ComparableExample {
    public static void main(String[] args) {
        Integer i5 = 5;
        Integer i7 = 7;
        System.out.println("Compare 5 to 7: " + i5.compareTo(i7));

        System.out.println();

        Character c1 = 'M';
        Character c2 = 'E';
        System.out.println("Compare 'M' to 'E': " + c1.compareTo(c2));

        System.out.println();

        String s1 = "Melih";
        String s2 = "Emre";
        System.out.println("Compare \"Melih\" to \"Emre\": " + s1.compareTo(s2));

        System.out.println();

        Date date1 = new Date();
        Date date2 = new Date(date1.getTime() - 10);
        System.out.println("Compare date1 to date2: " + date1.compareTo(date2));

        System.out.println();

        ComparableEmployee e1 = new ComparableEmployee(1, "Melih", 2001, "Development");
        Employee e2 = new ComparableEmployee(2, "Mert", 2017, "Development");
        System.out.println("Compare e1 to e2: " + e1.compareTo(e2));

    }
}
