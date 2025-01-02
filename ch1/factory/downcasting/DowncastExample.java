package ch1.factory.downcasting;

import ch1.factory.Director;
import ch1.factory.Employee;
import ch1.factory.HR;
import ch1.factory.Manager;

public class DowncastExample {
    public static void main(String[] args) {
        //Upcasting
        Employee e1 = new Employee(1, "Melih", 2, "Production");
        e1 = new Manager(1, "Melih", 2, "Production", "Production");

        Employee e2 = new Employee(2, "Mert", 8, "Production");


        //Downcasting
        //Manager m2 = (Manager) e2; // ClassCastException! //Casting 'e2' to 'Manager' will produce 'ClassCastException' for any non-null value

        HR hr = new HR();
        Employee e = hr.getAnEmployee();
        if (e instanceof Director){
            Director d1 = (Director) e;
            d1.makeAStrategicPlan();
        }else if (e instanceof Manager m1){ //Variable 'm1' can be replaced with pattern variable with Java 15
            m1.manage();
        }else
            e.work();

    }
}
