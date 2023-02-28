package WhileLoopChallenge;

public class Main {
    public static void main(String[] args) {
        int a =5;
        int b = 21;

            while (a<b) {

                if (isEvenNumber(a)) {
                    System.out.println(a + " is an even number");

                }
                a++;
            }

    }
    public static boolean isEvenNumber(int j){

        if( j % 2 == 0){
            return true;
        }
        return false;
    }

}
