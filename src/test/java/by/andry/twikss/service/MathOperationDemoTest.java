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

    @Test
    public void testTestEqualsReturnTrue() {
        MathOperationDemo mathOperationDemo1 = new MathOperationDemo(10,10);
        MathOperationDemo mathOperationDemo2 = new MathOperationDemo(10,10);

        boolean expected = true;
        boolean actual = mathOperationDemo1.equals(mathOperationDemo2);

        assertEquals(expected, actual);
    }

    @Test
    public void testTestEqualsReturnFalse() {
        MathOperationDemo mathOperationDemo1 = new MathOperationDemo(10,10);
        MathOperationDemo mathOperationDemo2 = new MathOperationDemo(15,10.34);

        boolean expected = false;
        boolean actual = mathOperationDemo1.equals(mathOperationDemo2);

        assertEquals(expected, actual);
    }

    @Test
    public void testTestHashCode() {
        MathOperationDemo mathOperationDemo = new MathOperationDemo(10,10);

        boolean expected = true;
        boolean actual = mathOperationDemo.hashCode() == 75498433;

        assertEquals(expected, actual);
    }

    @Test
    public void testTestGetA() {
        MathOperationDemo mathOperationDemo = new MathOperationDemo(10,10);

        boolean expected = true;
        boolean actual = mathOperationDemo.getA() == 10;

        assertEquals(expected, actual);
    }

    @Test
    public void testTestGetB() {
        MathOperationDemo mathOperationDemo = new MathOperationDemo(10,10);

        boolean expected = true;
        boolean actual = mathOperationDemo.getB() == 10;

        assertEquals(expected, actual);
    }

    @Test
    public void testGetSumAandB() {
        MathOperationDemo mathOperationDemo = new MathOperationDemo(10,15);

        boolean expected = true;
        boolean actual = mathOperationDemo.getSumAandB() == 25;

        assertEquals(expected, actual);
    }

    @Test
    public void testGetDeductionAminusB() {
        MathOperationDemo mathOperationDemo = new MathOperationDemo(15,10);

        boolean expected = true;
        boolean actual = mathOperationDemo.getDeductionAminusB() == 5;

        assertEquals(expected, actual);
    }

    @Test
    public void testGetMultiplicationAandB() {
        MathOperationDemo mathOperationDemo = new MathOperationDemo(15,10);

        boolean expected = true;
        boolean actual = mathOperationDemo.getMultiplicationAandB() == 150;

        assertEquals(expected, actual);
    }

    @Test
    public void testGetDivisionAandB() {
        MathOperationDemo mathOperationDemo = new MathOperationDemo(15,10);

        boolean expected = true;
        boolean actual = mathOperationDemo.getDivisionAandB() == 1.5;

        assertEquals(expected, actual);
    }

    @Test
    public void testSetA() {
        MathOperationDemo mathOperationDemo = new MathOperationDemo(10,3);
        mathOperationDemo.setA(5);

        boolean expected = true;
        boolean actual = mathOperationDemo.getA() == 5;

        assertEquals(expected, actual);
    }
}