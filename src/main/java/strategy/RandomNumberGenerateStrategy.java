package strategy;

import java.util.Random;

public class RandomNumberGenerateStrategy implements NumberGenerateStrategy{
    private Random random = new Random();
    private final static int MAX_NUMBER = 9;


    @Override
    public int generate() {
        return random.nextInt(MAX_NUMBER);
    }
}
