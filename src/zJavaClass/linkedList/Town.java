package zJavaClass.linkedList;

import java.util.LinkedList;

public class Town {
    private String place;
    private Integer distance;

    public Town(String place, int distance) {
        this.place = place;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return
                "place='" + place + ", distance=" + distance ;
    }


}
