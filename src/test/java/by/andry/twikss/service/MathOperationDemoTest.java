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
}