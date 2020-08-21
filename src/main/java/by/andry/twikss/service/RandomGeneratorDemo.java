package by.andry.twikss.service;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.util.Random;

public class RandomGeneratorDemo {
    private Logger logger = LoggerFactory.getLogger(RandomGeneratorDemo.class);
    private int a;
    private int b;
    private int c;

    public int getSumAllNumbers (){
        int sum = this.a + this.b + this.c;
        logger.info("Sum all random numbers = " + sum);
        return sum;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public RandomGeneratorDemo() {
        this.a = getRandomNumber();
        this.b = getRandomNumber();
        this.c = getRandomNumber();

    }

    public int getRandomNumber(){
        Random random = new Random();
        return random.nextInt(100) - 100;
    }

    @Override
    public String toString() {
        return "RandomGeneratorDemo{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
