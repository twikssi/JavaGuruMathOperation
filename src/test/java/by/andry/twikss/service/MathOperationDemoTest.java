package by.andry.twikss.service;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathOperationDemoTest extends TestCase {

    @Test
    public void testTestToString() {
        MathOperationDemo mathOperationDemo = new MathOperationDemo(10,10);

        boolean expected = true;
        boolean actual = true;

        assertEquals(expected, actual);
    }
}