import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTest {

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");

    }

    @Test
    public void testAddTwoPositiveValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues1() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));

    }

    @Test
    public void testAddTwoNegativeValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("-1 + -15 must be -16", -16, calc.add(-1, -15));
    }


    @Test
    public void testAddPositiveandNegativeValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("1 + -15 must be -14", -14, calc.add(1, -15));
    }

    @Test
    public void testAddPositiveandZeroValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("1 + 0 must be 1", 1, calc.add(1, 0));
    }


    @Test
    public void testAddMaxPositiveValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("10000 + 5467 must be 15467", 15467, calc.add(10000, 5467));
    }

    @Test
    public void testAddMaxTwoNegativeValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("-5000 + -467 must be -5467", -5467, calc.add(-5000, -467));
    }

    @After
    public void consolePrint1() {
        System.out.println("Tests finished!!! ");
    }
}
    //TODO
    //add new 5 tests for add() method

    //TODO
    //add tests for new methods


