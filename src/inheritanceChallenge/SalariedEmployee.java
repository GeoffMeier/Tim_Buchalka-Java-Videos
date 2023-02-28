package inheritanceChallenge;

public class SalariedEmployee extends Employee{
    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }
    @Override
    public double collectPay(){
       return (int) annualSalary / 24;
    }
    public void retire(){
        terminate("12/25/22");
        isRetired=true;
    }
}
