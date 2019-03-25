import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer;

    @Before
    public void before() {
        printer = new Printer(20, 40);
    }

    @Test
    public void canGetSheets(){
        assertEquals(20, printer.getNumberOfSheets());
    }

    @Test
    public void canGetToner() {
        assertEquals(40, printer.getToner());
    }

    @Test
    public void canPrintWithEnoughSheets() {
        printer.print(2, 5);
        assertEquals(10, printer.getNumberOfSheets());
    }

    @Test
    public void failToPrintWithoutEnoughSheets() {
        assertEquals("Not enough paper", printer.print(4, 6));
    }

    @Test
    public void canRefill() {
        printer.refill(10);
        assertEquals(30, printer.getNumberOfSheets());
    }

    @Test
    public void canLoseTonerOnPrinting() {
        printer.print(2, 5);
        assertEquals(30, printer.getToner());
    }
}
