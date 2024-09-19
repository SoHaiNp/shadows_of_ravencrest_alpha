package handler;

import java.util.Random;

public class RandomizerHandler {

    private final Random encounterRandomizer;
    private final Random monsterRandomizer;
    private final Random spoilRandomizer;

    public RandomizerHandler(){
        encounterRandomizer = new Random();
        monsterRandomizer = new Random();
        spoilRandomizer = new Random();
    }

    public int randomizeEncounter(){
        return encounterRandomizer.nextInt(2) + 1;
    }

    public int randomizeMonster(){
        return monsterRandomizer.nextInt(5) + 1;
    }

    public int randomizeSpoil(){
        return spoilRandomizer.nextInt(5) + 1;
    }

}
