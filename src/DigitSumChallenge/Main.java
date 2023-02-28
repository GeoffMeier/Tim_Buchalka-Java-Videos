package DigitSumChallenge;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(120));
    }

    public static int sumDigits(int number) {
        do{
//            int i = number % 10;
//            int j = number/10;
//            int sum = i++;
        for(int i = number% 10; i<=number;i++){
            int sum = i+i;
            int j = number/10;
            System.out.println(sum);
            return j;
        }



        }while(number>=0);
        return -1;
        }

    }
//

