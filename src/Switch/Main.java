package Switch;

public class Main {
    public static void main(String[] args) {
//        int value = 1;
//        if(value == 1){
//            System.out.println("Value was 1 ");
//
//        } else if (value == 2) {
//            System.out.println("Value was 2 ");
//
//        } else{
//            System.out.println("Was not 1 or 2");
//        }



        int switchValue = 3;
        
        switch (switchValue){
            case 1:
                System.out.println("value was 1");
            break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was 3,4, or 5");
                System.out.println("Actually it was a" + switchValue);
                break;
            default:
                System.out.println("was not 1,2,3,4,5");
                break;

        }
    }

    public static String getQuarter(String month){
        switch (month) {
            case "January":
            case "February":
            case "March":
                return "1st";
            case "April":
            case "May":
            case "June":
                return "2";
            case "July":
            case "August":
            case "September":
                return "3";
            case "October":
            case "November":
            case "December":
                return "4";
            default: return "Nothing";
        }
    }

    char charValue = 'a';
    public static char getChar(char charValue){
        switch (charValue){
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
                System.out.println("letters a-e were selected");
                break;
            default: System.out.println("STOP");    break;
        }
        return charValue;
    }

}
