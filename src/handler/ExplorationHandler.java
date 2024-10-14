package handler;

import model.EnemyModel;
import model.PlayerModel;

public class ExplorationHandler {

    private RandomizerHandler randomizerHandler;
    private BattleHandler battleHandler;

    public enum ExplorationState { EXPLORE, BATTLE }
    private ExplorationState currentExplorationState;

    public ExplorationHandler(){
        //TODO Verificar possibilidade de mover essa linha para dentro do método explorationState()...
        currentExplorationState = ExplorationState.BATTLE;

        randomizerHandler = new RandomizerHandler();
        battleHandler = new BattleHandler();
    }

    public void explorationState(PlayerModel playerCharacter, EnemyModel enemyCharacter){
        //TODO Implementar randomizador de monstros...
        randomizeEncounter();

        while (true){
            switch (currentExplorationState){
                case BATTLE:
                    battleHandler.battleState(playerCharacter, enemyCharacter);
                    if (battleHandler.getCurrentBattleState() == BattleHandler.BattleState.ENDBATTLE){
                        return;
                    }
                    break;
                case EXPLORE:
                    //TODO Criar opções de coleta de itens ao explorar...
                    System.out.println("Explorando...");
                    break;
            }
        }
    }

    public void randomizeEncounter(){
        if (randomizerHandler.randomize(5) <=2 ){
            setExplorationState(ExplorationState.BATTLE);
        } else {
            setExplorationState(ExplorationState.EXPLORE);
        }
    }

    public void setExplorationState(ExplorationState currentExplorationState){
        this.currentExplorationState = currentExplorationState;
    }

}
