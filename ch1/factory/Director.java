package ch1.factory;

public class Director extends Manager{
    protected double bonus;


    public Director(int no, String name, int year, String workingDepartment, String departmentManaged, double bonus) {
        super(no, name, year, workingDepartment, departmentManaged);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }

    @Override
    public void manage(){
        System.out.println("Director manages whole conpany!");
    }

    @Override
    public void work(){
        System.out.println("Director is working!");
        manage();
    }

    public void makeAStrategicPlan(){
        System.out.println("Director makes a strategic plan for the company!");
    }
}
