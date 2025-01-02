package ch1.factory;

public class TestPayrollOffice {
    public static void main(String[] args) {
        PayrollOffice payrollOffice = new PayrollOffice();

        Employee e1 = new Employee(1, "Melih", 2);
        payrollOffice.paySalary(e1);

        Manager m1 = new Manager(2, "Mert", 8, "Production");
        payrollOffice.paySalary(m1);

        Director d1 = new Director(3, "Tarık", 5, "Management", "Management", 3000);
        payrollOffice.paySalary(d1);

    }
}
