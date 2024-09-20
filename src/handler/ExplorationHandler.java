package handler;

import model.EnemyModel;
import model.PlayerModel;

public class ExplorationHandler {

    private RandomizerHandler randomizerHandler;
    private BattleHandler battleHandler;

    public enum ExplorationState { EXPLORE, BATTLE }
    private ExplorationState currentExplorationState;

    public ExplorationHandler(){
        currentExplorationState = ExplorationState.BATTLE;

        randomizerHandler = new RandomizerHandler();
        battleHandler = new BattleHandler();
    }

    public void explorationState(PlayerModel playerCharacter, EnemyModel enemyCharacter){
        randomizeEncounter();

        while (true){
            switch (currentExplorationState){
                case BATTLE:
                    battleHandler.battleState(playerCharacter, enemyCharacter);
                    break;
                case EXPLORE:
                    // Exploração...
                    System.out.println("Explorando...");
                    break;
            }
        }
    }

    public void randomizeEncounter(){

        if (randomizerHandler.randomize(5) <=2 ){
            // Estado de batalha...
            setExplorationState(ExplorationState.BATTLE);
        } else {
            // Estado de exploração...
            setExplorationState(ExplorationState.EXPLORE);
        }

    }

    public void setExplorationState(ExplorationState currentExplorationState){
        this.currentExplorationState = currentExplorationState;
    }

}
