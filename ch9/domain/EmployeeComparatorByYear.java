package ch9.domain;

import ch1.factory.Employee;

import java.util.Comparator;

public class EmployeeComparatorByYear implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getYear() - e2.getYear();
    }
}
