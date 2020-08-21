package by.andry.twikss.service;

public class RandomGeneratorDemo {
    private double a;
    private double b;
    private double c;

    public RandomGeneratorDemo() {

    }

    public double getRandomNumber(){
        return (int) (Math.random()*(200+1)) - 100;
    }
}
