package by.andry.twikss.service;

import java.security.SecureRandom;

public class RandomGeneratorDemo {
    private int a;
    private int b;
    private int c;

    public int getSumAllNumbers (){
        return this.a + this.b + this.c;
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
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(100) - 100;
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
