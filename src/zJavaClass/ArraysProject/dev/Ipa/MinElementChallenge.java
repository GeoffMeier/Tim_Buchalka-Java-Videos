package zJavaClass.ArraysProject.dev.Ipa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(readIntegers()));
int[] reading = new int[5];


    }
    public static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a list of numbers, separated by commas: ");
        String input = scanner.nextLine();
       String[] splits = input.split(",");
       int[] values = new int[splits.length];
        System.out.println(splits);
        for (int i = 0; i< splits.length; i++){
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
        }
private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int el : array){
            if(el < min){
                min = el;
            }
        }
        return min;
}
public static void reversedArray(int[] array){
        int maxIndex = array.length - 1;
        int halfWay = array.length / 2;
        for (int i=0; i<halfWay;i++){
          int temp = array[i];
          array[maxIndex - i] = temp;
        System.out.println();
        }

}


    }


