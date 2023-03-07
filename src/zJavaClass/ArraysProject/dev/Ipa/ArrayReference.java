package zJavaClass.ArraysProject.dev.Ipa;

public class ArrayReference {
    public static void main(String... args) {
String[] splitStrings = "Hello World Again".split(" ");
        System.out.println(splitStrings);
printText(splitStrings);
    }
    private static void printText(String[] textList){
        for (String t : textList){
            System.out.println(t);
        }

    }

}
