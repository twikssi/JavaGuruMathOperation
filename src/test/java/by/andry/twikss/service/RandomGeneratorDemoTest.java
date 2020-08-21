package by.andry.twikss.service;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class RandomGeneratorDemoTest extends TestCase {

    @Test
    public void testGetRandomNumber() {
        RandomGeneratorDemo randomGeneratorDemo = new RandomGeneratorDemo();
        int randomNumber = randomGeneratorDemo.getRandomNumber();

        boolean expected = true;
        boolean actual = randomNumber >= -100 && randomNumber <= 100;

        assertEquals(expected, actual);
    }

    @Test
    public void testGetA() {
        RandomGeneratorDemo randomGeneratorDemo = new RandomGeneratorDemo();
        int randomNumber = randomGeneratorDemo.getA();

        boolean expected = true;
        boolean actual = randomNumber >= -100 && randomNumber <= 100;

        assertEquals(expected, actual);
    }

    @Test
    public void testGetB() {
        RandomGeneratorDemo randomGeneratorDemo = new RandomGeneratorDemo();
        int randomNumber = randomGeneratorDemo.getB();

        boolean expected = true;
        boolean actual = randomNumber >= -100 && randomNumber <= 100;

        assertEquals(expected, actual);
    }

    @Test
    public void testGetC() {
        RandomGeneratorDemo randomGeneratorDemo = new RandomGeneratorDemo();
        int randomNumber = randomGeneratorDemo.getC();

        boolean expected = true;
        boolean actual = randomNumber >= -100 && randomNumber <= 100;

        assertEquals(expected, actual);
    }

    @Test
    public void testGetSumAllNumbers() {
        RandomGeneratorDemo randomGeneratorDemo = new RandomGeneratorDemo();

        boolean expected = true;
        boolean actual = randomGeneratorDemo.getSumAllNumbers() == (randomGeneratorDemo.getA()+ randomGeneratorDemo.getB()+ randomGeneratorDemo.getC());

        assertEquals(expected, actual);
    }

    @Test
    public void testTestToString() {
        RandomGeneratorDemo randomGeneratorDemo = new RandomGeneratorDemo();

        boolean expected = true;
        boolean actual = randomGeneratorDemo.toString().equals("RandomGeneratorDemo{"+
                "a=" + randomGeneratorDemo.getA() +
                ", b=" + randomGeneratorDemo.getB() +
                ", c=" + randomGeneratorDemo.getC() +
                '}');

        assertEquals(expected, actual);
    }
}