import handler.BattleHandler;
import model.GameModel;

public class Main {
    public static void main(String[] args) {
        GameModel gameInstance = new GameModel();
        gameInstance.startGameState();
        BattleHandler debugBattleHandler = new BattleHandler();

        if (gameInstance.getGamePowerState()){

            debugBattleHandler.battleState(gameInstance.getDebugPlayerCharacter(), gameInstance.getDebugEnemyCharacter());

/*            while(true){
                switch (gameInstance.getCurrentGameState()){
                    case MAINMENU:
                        gameInstance.startGameState();
                        break;
                    case TOWNMENU:
                        gameInstance.townMenuState();
                        break;
                    case HOUSEMENU:
                        gameInstance.houseMenuState();
                        break;
                    case STATUSMENU:
                        gameInstance.statusMenuState();
                        break;
                }
            }*/
        }
    }
}