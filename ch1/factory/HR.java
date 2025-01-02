package ch1.factory;

import java.util.Random;

public class HR {
    public Employee getAnEmployee(){
        Employee e = null;

        int i = new Random().nextInt(3);

        switch (i){
            case 0:
                e = new Employee(1,"Melih", 2, "Backend");
                break;
            case 1:
                e = new Manager(2, "Mert", 8, "Development");
                break;
            case 2:
                e = new Director(3, "Tarık", 4, "Development", "Development", 3000);
                break;
        }
        return e;
    }
}
