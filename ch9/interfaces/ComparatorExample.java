package ch9.interfaces;

import ch1.factory.Employee;
import ch9.domain.EmployeeComparatorByYear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        Employee e1 = new Employee(111, "Tarık", 3);
        Employee e2 = new Employee(222, "Melih", 2);
        Employee e3 = new Employee(333, "Mert", 1);

        Comparator<Employee> ec = new EmployeeComparatorByYear();

        List<Employee> employees = new ArrayList<>(Arrays.asList(e1, e2, e3));

        //Before sort
        employees.forEach(System.out::println);

        employees.sort(ec);
        System.out.println();

        //After sort
        employees.forEach(System.out::println);


    }
}
