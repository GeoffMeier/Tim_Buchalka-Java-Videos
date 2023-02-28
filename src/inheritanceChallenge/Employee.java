package inheritanceChallenge;

public class Employee extends Worker{


  private  long employeeId;
   private String hireDate;
private static int employeeNo = 1;
    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hireDate='" + hireDate + '\'' +
                ", employeeId='" + employeeId + '\'' +
                '}' + super.toString();
    }

    public long getEmployee() {
        return employeeId;
    }

    public void setEmployee(long employee) {
        this.employeeId = employee;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}

