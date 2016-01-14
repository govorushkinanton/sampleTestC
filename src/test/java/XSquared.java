import org.junit.After;
import org.junit.Test;

import java.text.DecimalFormat;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by m18 on 14.01.2016.
 */
public class XSquared {
    @Test
    public void Square() {

        Calculate calc = new Calculate();

        assertEquals(16, calc.pow(4));

    }
    @Test
    public void Square1() {

        Calculate calc = new Calculate();

        assertEquals(225, calc.pow(15));

    }
    @Test
    public void Square2() {

        Calculate calc = new Calculate();

        assertEquals(4, calc.pow(2));}
    @Test
    public void Square3() {

        Calculate calc = new Calculate();

        assertEquals(100, calc.pow(10));}
    @Test
    public void Square4() {

        Calculate calc = new Calculate();

        assertEquals(100, calc.pow(10));}}
