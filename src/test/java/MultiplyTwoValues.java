import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by m18 on 14.01.2016.
 */
public class MultiplyTwoValues {
    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");

    }

    @Test
    public void testMultiplyTwoValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("8 * 5 must be 40", 40, calc.mult(8, 5));
    }

    @Test
    public void testMultiplyTwoNegativeValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("-10 * -5 must be 40", 50, calc.mult(-10, -5));
    }

    @Test
    public void testMultiplywithZero() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("15 * 0 must be 0", 0, calc.mult(15, 0));
    }

    @Test
    public void testMultiplyNegAndPosValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("-11 * 8 must be -88", -88, calc.mult(-11, 8));
    }

    private void assertEquals(String s, int i, int mult) {
    }

    @After
    public void consolePrint1() {
        System.out.println("Tests finished!!! ");


    }
}