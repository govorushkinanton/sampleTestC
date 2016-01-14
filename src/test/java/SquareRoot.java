import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by m18 on 14.01.2016.
 */
public class SquareRoot  {

    @Test
public void Squareroot() {

    Calculate calc = new Calculate();

    // Method to check
    assertEquals(4.0, calc.Sqrt(16));

    }
    @Test
    public void Squareroot2() {

        Calculate calc = new Calculate();

        // Method to check
        assertEquals(0.0, calc.Sqrt(0));}
    @Test
    public void Squareroot3() {

        Calculate calc = new Calculate();

        // Method to check
        assertEquals(5.0, calc.Sqrt(25));}
    @Test
    public void Squareroot4() {

        Calculate calc = new Calculate();

        // Method to check
        assertEquals(11.0, calc.Sqrt(121));}}
