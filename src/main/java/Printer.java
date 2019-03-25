public class Printer {

    private int numberOfSheets;

    public Printer(int numberOfSheets) {
        this.numberOfSheets = numberOfSheets;
    }

    public int getNumberOfSheets() {
        return this.numberOfSheets;
    }

    public String print(int numberOfPages, int numberOfCopies) {
        int printSheets = numberOfPages * numberOfCopies;
            if (printSheets > this.numberOfSheets) {
                return "Not enough paper";
            }
        this.numberOfSheets -= printSheets;
            return "Printing...";
    }

    public void refill(int numberOfRefill) {
        this.numberOfSheets += numberOfRefill;
    }
}
