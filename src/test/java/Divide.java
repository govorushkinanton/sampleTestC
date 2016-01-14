import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by m18 on 14.01.2016.
 */
public class Divide {

        @Before
        public void consolePrint() {
            System.out.println("Tests started!!! ");

        }
    @Test
    public void testDivision0() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("80 / 80 must be 1", 16, calc.div(80, 80));
    }

        @Test
        public void testDivision() {
            // Class for testing
            Calculate calc = new Calculate();

            // Method to check
            assertEquals("80 / 5 must be 16", 16, calc.div(80, 5));
        }

     @Test
    public void testDivision1() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("100 / 4 must be 25", 25, calc.div(100, 4
        ));
    }

    @Test
    public void testDivision2() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("13000 / 4 must be 3250", 3250, calc.div(13000, 4
        ));}
        private void assertEquals(String s, int i, int div) {
        }


        @After
        public void consolePrint1() {
            System.out.println("Tests finished!!! ");}
}




