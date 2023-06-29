package zJavaClass.linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);
        printItinerary(placesToVisit);
        System.out.println(placesToVisit);
    }

    public static void addMoreElements(LinkedList<String>list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");
    }

    public static void removeElements(LinkedList<String> list) {
        list.remove(3);
        list.remove("Darwin");
    }
    public static void printItinerary(LinkedList<String>list){
        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i<list.size(); i++){
            System.out.println("--> From: " + list.get(i-1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

}
