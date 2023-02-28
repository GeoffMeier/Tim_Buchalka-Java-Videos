package inheritanceChallenge;

public class Worker {
//    public static void main(String[] args) {
//
//       Worker Geoff = new Worker("Geoff","08/09/00", "02/14/23");
//    }
   private String name;
   private String birthDate;
  protected  String endDate;
    public Worker(){}
    public Worker(String name, String birthDate){
        this.name=name;
        this.birthDate=birthDate;
        this.endDate=endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public int getAge(){
        int currentYear = 2022;
        int birthYear = Integer.parseInt(birthDate.substring(7));
        return  currentYear - birthYear;
        }
    public double collectPay(){
        return 0.00;
    }

    public void terminate(String endDate){
        this.endDate=endDate;
    }
}
