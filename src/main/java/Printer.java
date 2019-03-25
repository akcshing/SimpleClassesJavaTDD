public class Printer {

    private int numberOfSheets;

    public Printer(int numberOfSheets) {
        this.numberOfSheets = numberOfSheets;
    }

    public int getNumberOfSheets() {
        return this.numberOfSheets;
    }

    public void print(int numberOfPages, int numberOfCopies) {
        int printSheets = numberOfPages * numberOfCopies;

        this.numberOfSheets -= printSheets;
    }
}
