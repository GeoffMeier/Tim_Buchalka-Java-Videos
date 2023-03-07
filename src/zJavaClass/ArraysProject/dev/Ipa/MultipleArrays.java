package zJavaClass.ArraysProject.dev.Ipa;

import java.util.Arrays;

public class MultipleArrays {
    public static void main(String[] args) {
        int[][] array2 = new int[4][4];
        for (int[] outer : array2){
            System.out.println(Arrays.toString(outer));
        }
        for (int i=0; i< array2.length;i++){
            for (int inner : array2[i]){

            }
        }
    }
}
