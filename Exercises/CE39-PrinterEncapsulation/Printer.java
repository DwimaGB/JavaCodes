public class Printer {
    
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    
    public Printer(int tonerLevel, boolean duplex){
        this.tonerLevel = (tonerLevel < 0 || tonerLevel > 100)? -1 : tonerLevel;
        this.duplex = duplex;
        pagesPrinted = 0;
    }
    
    public int getPagesPrinted(){
        return pagesPrinted;
    }
    
    public int addToner(int tonerAmount){
        if(tonerAmount <= 0 || tonerAmount > 100){
            return -1;
        }
        int newTonerLevel = tonerLevel + tonerAmount;
        if(newTonerLevel > 100) return -1;
        tonerLevel = newTonerLevel;
        return tonerLevel;
    }
    
    public int printPages(int pages){
        int pagesToPrint = pages;
        if(duplex){
            pagesToPrint = (int) Math.ceil(pages/2.0);
        }
        pagesPrinted += pages;
        return pagesToPrint;
    }
    
    
}