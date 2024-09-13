import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleTest {
    @Test public void testFunctionA_XPositiveY() {
        Example example = new Example(7, 2);
        int result = example.Function_A(12);
        assertEquals(19, result); // y + a = 12 + 7 = 19
    }
    @Test public void testFunctionA_NegativeY() {
        Example example = new Example(7, 2);
        int result = example.Function_A(-8);
        assertEquals(-15, result); // y - a = -8 - 7 = -15
    }
    @Test public void testFunctionB_XLessThan6() {
        Example example = new Example(7, 2);
        int result = example.Function_B(5);
        assertEquals(7, result); // x + b = 5 + 2 = 7
    }
    @Test public void testFunctionB_XGreaterThan6() {
        Example example = new Example(7, 2);
        int result = example.Function_B(9);
        assertEquals(7, result); // x - b = 9 - 2 = 7
    }

}