package inheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        Employee geoff = new Employee("Geoff","/08/09/2000", "01/01/2020");
        System.out.println(geoff);
        System.out.println(geoff.getAge());
        SalariedEmployee joe = new SalariedEmployee("Geoff","/08/09/2000", "01/01/2020",70000);
        System.out.println(joe);
        System.out.println(joe.getAge());
        System.out.println(joe.collectPay());
    }
}
