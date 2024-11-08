import model.GameModel;

public class Main {
    public static void main(String[] args) {
        GameModel gameInstance = new GameModel();
        gameInstance.startGameState();

        if (gameInstance.getGamePowerState()){

            while(true){
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
                    case EXPLOREMENU:
                        gameInstance.exploreMenuState();
                }
            }
        }
    }
}