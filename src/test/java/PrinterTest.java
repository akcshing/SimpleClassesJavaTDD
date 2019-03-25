import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer;

    @Before
    public void before() {
        printer = new Printer(20);
    }

    @Test
    public void canGetSheets(){
        assertEquals(20, printer.getNumberOfSheets());
    }

    @Test
    public void canPrintWithEnoughSheets() {
        printer.print(2, 5);
        assertEquals(10, printer.getNumberOfSheets());
    }
}
