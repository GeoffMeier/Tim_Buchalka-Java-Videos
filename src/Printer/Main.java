package Printer;

public class Main {
    public static void main(String[] args) {
Printer printer = new Printer(50,false);
System.out.println(printer.getPagesPrinted());
        System.out.println(printer.printPages(50));
    }
}
