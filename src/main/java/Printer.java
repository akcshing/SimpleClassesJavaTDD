public class Printer {

    private int numberOfSheets;
    private int toner;

    public Printer(int numberOfSheets, int toner) {
        this.numberOfSheets = numberOfSheets;
        this.toner = toner;
    }

    public int getNumberOfSheets() {
        return this.numberOfSheets;
    }

    public int getToner() {
        return this.toner;
    }

    public String print(int numberOfPages, int numberOfCopies) {
        int printSheets = numberOfPages * numberOfCopies;
            if (printSheets > this.numberOfSheets) {
                return "Not enough paper";
            }
        this.numberOfSheets -= printSheets;
        this.toner -= printSheets;
            return "Printing...";
    }

    public void refill(int numberOfRefill) {
        this.numberOfSheets += numberOfRefill;
    }
}
