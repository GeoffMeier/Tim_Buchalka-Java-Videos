package Compositing;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;


    public void make(){
        System.out.println("Bed is being made");
    }
    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

}