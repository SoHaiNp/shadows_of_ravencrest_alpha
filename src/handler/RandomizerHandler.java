package handler;

import java.util.Random;

public class RandomizerHandler {

    private final Random randomizerHandler;

    public RandomizerHandler(){
        randomizerHandler = new Random();
    }

    public int randomize(int randomRange){
        return randomizerHandler.nextInt(randomRange) + 1;
    }

}
