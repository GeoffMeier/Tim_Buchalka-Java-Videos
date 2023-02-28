package primeNumberChallenge;

public class Main {
    public static void main(String[] args) {
    System.out.println("0 is " + (isPrime(0) ? "" : "NOT"));
        System.out.println("1 is " + (isPrime(1) ? "" : "NOT"));
        System.out.println("2 is " + (isPrime(2) ? "" : "NOT"));
        System.out.println("3 is " + (isPrime(3) ? "" : "NOT"));

        System.out.println("8 is " + (isPrime(8) ? "" : "NOT"));

//use isPrime method to see how many times a number between 2 and 50 are prime. return total amount of prime numbers
        int count=0;
        for(int counter = 2; counter<=50; counter++){
            if (isPrime(counter)==true)
                count+=1;


            }
        System.out.println(count);
        }


//use method is prime to check to see if a number is a prime number
    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            return (wholeNumber == 2);

        }
        for(int divisor = 2 ; divisor< wholeNumber; divisor++){
            if(wholeNumber % divisor == 0){
                return false;
            }

        }


        return true;
    }

}
