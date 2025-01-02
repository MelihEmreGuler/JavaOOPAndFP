package ch1.factory;

public class TestHR {
    public static void main(String[] args) {

        HR hr = new HR();

        Employee e = hr.getAnEmployee();
        e.work();
    }
}
