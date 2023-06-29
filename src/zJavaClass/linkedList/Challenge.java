package zJavaClass.linkedList;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.LinkedList;
import java.util.Scanner;

public class Challenge  {






    public static void main(String[] args) {
var list = new LinkedList<Town>();
addTown(list);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available actions: \n" +
                "(F) forward \n" +
                "(B) backwards \n" +
                "(L) list \n" +
                "(Menu)");


    }
public static void addTown(LinkedList<Town>list){
        list.add(0,new Town("Sydney",0));
    list.add(1,new Town("Adelaide",1374));
    list.add(2,new Town("Alice Springs",2771));
    list.add(3,new Town("Brisbane",917));
    list.add(4,new Town("Darwin",3972));
    list.add(5,new Town("Melbourne",877));
    list.add(6,new Town("Perth",3923));
    System.out.println(list);
}
}

