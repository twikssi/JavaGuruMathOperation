package by.andry.twikss.service;

public class RandomGeneratorDemo {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    private double c;

    public RandomGeneratorDemo() {
        this.a = getRandomNumber();
        this.b = getRandomNumber();
        this.c = getRandomNumber();

    }

    public int getRandomNumber(){
        return (int) (Math.random()*(200+1) - 100);
    }
}
