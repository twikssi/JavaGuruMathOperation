package by.andry.twikss.service;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathOperationDemoTest extends TestCase {

    @Test
    public void testTestToString() {
        MathOperationDemo mathOperationDemo = new MathOperationDemo(10,10);

        boolean expected = true;
        boolean actual = (mathOperationDemo.toString().equals("MathOperationDemo{a=10.0, b=10.0}"));

        assertEquals(expected, actual);
    }

    public void testTestEqualsReturnTrue() {
        MathOperationDemo mathOperationDemo1 = new MathOperationDemo(10,10);
        MathOperationDemo mathOperationDemo2 = new MathOperationDemo(10,10);

        boolean expected = true;
        boolean actual = mathOperationDemo1.equals(mathOperationDemo2);

        assertEquals(expected, actual);
    }

    public void testTestEqualsReturnFalse() {
        MathOperationDemo mathOperationDemo1 = new MathOperationDemo(10,10);
        MathOperationDemo mathOperationDemo2 = new MathOperationDemo(15,10.34);

        boolean expected = false;
        boolean actual = mathOperationDemo1.equals(mathOperationDemo2);

        assertEquals(expected, actual);
    }

    public void testTestHashCode() {
        MathOperationDemo mathOperationDemo = new MathOperationDemo(10,10);

        boolean expected = true;
        boolean actual = mathOperationDemo.hashCode() == 75498433;

        assertEquals(expected, actual);
    }

    public void testGetA() {
        MathOperationDemo mathOperationDemo = new MathOperationDemo(10,10);

        boolean expected = true;
        boolean actual = mathOperationDemo.getA() == 10;

        assertEquals(expected, actual);
    }

    public void testGetB() {
        MathOperationDemo mathOperationDemo = new MathOperationDemo(10,10);

        boolean expected = true;
        boolean actual = mathOperationDemo.getB() == 10;

        assertEquals(expected, actual);
    }
}