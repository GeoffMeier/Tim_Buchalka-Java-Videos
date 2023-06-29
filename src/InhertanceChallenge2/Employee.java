package InhertanceChallenge2;

public class Employee extends Worker{
    private long employeeId;
    private String hireDate;

    private static  int increment = 1;
    public Employee(String birthDate, String hireDate, String name) {
        super(name,birthDate);
        this.employeeId = Employee.increment++;
        this.hireDate = hireDate;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public static int getIncrement() {
        return increment;
    }

    public static void setIncrement(int increment) {
        Employee.increment = increment;
    }
}
