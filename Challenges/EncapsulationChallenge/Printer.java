public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        if(tonerLevel <= 0){
            this.tonerLevel = 0;
        }
        else if(tonerLevel >= 100){
            this.tonerLevel = 100;
        }
        else{
            this.tonerLevel = tonerLevel;
        }

        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        int tonerSum = tonerAmount + tonerLevel;
        if(tonerSum < 0 || tonerSum > 100 ){
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages){
        int sheetsNeeded;
        if(duplex){
            System.out.println("It's a duplex printer");
            sheetsNeeded = (int)Math.ceil(pages/2.0);
            pagesPrinted += pages;
        }
        else{
            sheetsNeeded = pages;
            pagesPrinted += pages;
        }

        return sheetsNeeded;
    }
}
