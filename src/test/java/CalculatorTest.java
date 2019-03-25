import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void before() {
        this.calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(4, calculator.add(1, 3));
    }

    @Test
    public void canSubtract() {
        assertEquals(3, calculator.subtract(5, 2));
    }

    @Test
    public void canMultiply() {
        assertEquals(15, calculator.multiply(3, 5));
    }
}
