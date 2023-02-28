package sum3and5challenge;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int add = 0;
        for (int i =1; i <= 1000; i++){

            if(i % 3 ==0 && i % 5==0){
                count+=1;

                System.out.println("The number divisible by 3 and 5 was: "+ i + ", the count is at: " + count);
                    add+=i;
            } if (count == 5){
                System.out.println(add);
                break;
            }
        }
    }
}
