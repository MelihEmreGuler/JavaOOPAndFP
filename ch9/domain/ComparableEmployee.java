package ch9.domain;

import ch1.factory.Director;
import ch1.factory.Employee;

public class ComparableEmployee extends Employee implements Comparable {


    public ComparableEmployee(int no, String name, int year, String department) {
        super(no, name, year, department);
    }

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee) o;
        return this.no - e.getNo();

    }
}
