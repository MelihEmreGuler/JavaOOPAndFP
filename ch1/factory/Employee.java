package ch1.factory;

import java.util.Objects;

public class Employee implements Comparable{
    protected int no;
    protected String name;
    protected int year;
    protected String department;

    public static final int BASE_SALARY = 500;

    public Employee(int no, String name, int year) {
        this.no = no;
        this.name = name;
        this.year = year;
    }

    public Employee(int no, String name, int year, String department) {
        this(no, name, year);
        this.department = department;
    }

    public double calculateSalary() {
        return year * BASE_SALARY;
    }

    public String getName() {
        return name;
    }

    public int getNo(){
        return no;
    }

    public int getYear(){
        return year;
    }

    public void work() {
        System.out.println("Employee is working!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return no == employee.no;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(no);
    }



    @Override
    public String toString() {
        return "Employee{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Employee other = (Employee) o;
        return Integer.compare(no, other.no);
    }
}
