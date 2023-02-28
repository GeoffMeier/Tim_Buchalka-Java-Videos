package RecordProject;

public class Main {
    public static void main(String[] args) {
        for(int i=0; i<= 5; i++){
            Student s = new Student("S92300" + i,
                    switch(i){
                        case 1 -> "Marry";
                        case 2-> "Carol";
                        case 3 -> "Jane";

                        case 4-> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";


                    },


                    "05/11/1985",
                    "Java Masterclass");

        }
    }

}
