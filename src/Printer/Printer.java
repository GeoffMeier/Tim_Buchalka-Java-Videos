package Printer;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >=0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if (tonerLevel + tonerAmount <0){
            return -1;
        } else if (tonerLevel + tonerAmount >100 ) {
          return -1;
        }
        tonerLevel+=tonerAmount;
        System.out.println("tonerLevel = " );
        return tonerLevel;

    }
    public int printPages(int pages){
        if (duplex){
            pages= (pages /2) + (pages%2);
        pagesPrinted += pages;
         return pages;
        }
        pagesPrinted += pages;
        return  pages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
