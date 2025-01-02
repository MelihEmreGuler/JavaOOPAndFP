package ch9.set;

import ch1.factory.Employee;

import java.util.Set;
import java.util.TreeSet;

public class SetWithDuplicates {
    public static void main(String[] args) {
        Set set = new TreeSet();
        Employee e1 = new Employee(999, "Tarık", 5);
        System.out.println(set.add(e1));
        Employee e2 = new Employee(222, "Melih", 3);
        System.out.println(set.add(e2));
        Employee e3 = new Employee(888, "Mert", 9);
        System.out.println(set.add(e3));
        Employee e4 = new Employee(444, "Ali", 2);
        System.out.println(set.add(e4));

        set.forEach(System.out::println);

        Set setByYear = new TreeSet((o1, o2) -> {
            Employee e5 = (Employee) o1;
            Employee e6 = (Employee) o2;
            return Integer.compare(e5.getYear(), e6.getYear());
        });
        System.out.println(setByYear.add(e1));
        System.out.println(setByYear.add(e2));
        System.out.println(setByYear.add(e3));
        System.out.println(setByYear.add(e4));

        setByYear.forEach(System.out::println);


    }
}
