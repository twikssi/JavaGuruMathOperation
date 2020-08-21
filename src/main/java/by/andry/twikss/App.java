package by.andry.twikss;

import by.andry.twikss.service.RandomGeneratorDemo;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        RandomGeneratorDemo randomGeneratorDemo = new RandomGeneratorDemo();
        String sum ="" + randomGeneratorDemo.toString() + "\nSum all random numbers = " + randomGeneratorDemo.getSumAllNumbers();
        logger.info(sum);
    }
}
