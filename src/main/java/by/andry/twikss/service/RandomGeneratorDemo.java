package by.andry.twikss.service;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

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
        return (int) (Math.random()*(200+1) - 100);
    }
}
