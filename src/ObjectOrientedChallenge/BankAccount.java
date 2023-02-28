package ObjectOrientedChallenge;

public class BankAccount {
   private int accountNumber;
   private double accountBalance;
   private String name;
   private String email;
   private int phoneNumber;
    public BankAccount(String number, double accountBalance, String name, String email, int phoneNumber){
        System.out.println("Account with constructors called!!");
        this.accountNumber=accountNumber;
        this.accountBalance = accountBalance;
        this.name= name;
        this.email=email;
        this.phoneNumber = phoneNumber;
    }



    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double depositFunds(double num){
        System.out.println("Enter amount to deposit: " + num);
        double newBalance = this.accountBalance + num;
         setAccountBalance(newBalance);
        System.out.println("The account balance is now: ");
        return newBalance;
    }
    public double withDraw(double num){
        if (num > this.accountBalance){
            System.out.println("Access Denied! Please enter an amount less then your Account balance: " );

        } else{
            double remainingBalance = this.accountBalance - num;
            setAccountBalance(remainingBalance);
            System.out.println("You withdrew " + num + " from your account");
            System.out.println("Below is the amount you have remaining in the account ");
        }

        return num;

    }

}
