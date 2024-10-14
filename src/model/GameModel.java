package model;

import handler.ExplorationHandler;
import util.ClearScreenUtil;
import util.KeyListenerUtil;

public class GameModel {

    private boolean gamePowerState;

    private final ClearScreenUtil clearScreenUtil;
    private final KeyListenerUtil keyListenerUtil;
    private final MenuModel gameMenu;

    private final ExplorationHandler explorationHandler;

    public enum GameState { MAINMENU, TOWNMENU, HOUSEMENU, STATUSMENU, EXPLOREMENU }
    private GameState currentGameState;

    private PlayerModel debugPlayerCharacter;
    private EnemyModel debugEnemyCharacter;

    public GameModel() {
        gamePowerState = true;

        clearScreenUtil = new ClearScreenUtil();
        keyListenerUtil = new KeyListenerUtil();

        explorationHandler = new ExplorationHandler();

        gameMenu = new MenuModel();

        debugPlayerCharacter = new PlayerModel("Lucian Nicolas",100,100,
                100,100,25,25,100,
                1000,1,99);

        //TODO Implementar randomizador de monstros...
        debugEnemyCharacter = new EnemyModel("Zombie", 100, 100, 15,
                10);
    }

    public void setGamePowerState(boolean isTurnedOn){
        this.gamePowerState = isTurnedOn;
    }

    public boolean getGamePowerState(){
        return gamePowerState;
    }

    public void setCurrentGameState(GameState currentGameState){
        this.currentGameState = currentGameState;
    }

    public GameState getCurrentGameState(){
        return currentGameState;
    }

    //TODO Buscar tratamento quando inputar opções inválidas (provavelmente try-catch)...
    public void startGameState(){
        clearScreenUtil.clearTheScreen();
        gameMenu.displayMainMenu();

        switch (keyListenerUtil.getChosenOption()){
            case 1:
                setCurrentGameState(GameState.TOWNMENU);
                break;
            case 2:
                //TODO Implementar menu de Novo Jogo...
                break;
            case 3:
                setGamePowerState(false);
        }
    }

    public void townMenuState(){
        clearScreenUtil.clearTheScreen();
        gameMenu.displayTownMenu();

        switch (keyListenerUtil.getChosenOption()){
            case 1:
                setCurrentGameState(GameState.HOUSEMENU);
                break;
            case 2:
                // Taverna...
                //TODO Implementar menu de Taverna...
                break;
            case 3:
                // Ferreiro...
                //TODO Implementar menu de Ferreiro...
                break;
            case 4:
                // Mercador...
                //TODO Implementar menu de Mercador...
                break;
            case 5:
                // Guilda do Corvo...
                //TODO Implementar menu de Guilda do Corvo...
                break;
            case 6:
                setCurrentGameState(GameState.EXPLOREMENU);
                break;
        }

    }

    public void houseMenuState(){
        clearScreenUtil.clearTheScreen();
        gameMenu.displayHouseMenu();

        switch (keyListenerUtil.getChosenOption()){
            case 1:
                setCurrentGameState(GameState.TOWNMENU);
                break;
            case 2:
                setCurrentGameState(GameState.STATUSMENU);
                break;
            case 3:
                //TODO Ao seguir esse fluxo, por algum motivo não é possível encerrar o jogo quando volta para o Menu Principal...
                setCurrentGameState(GameState.MAINMENU);
                break;
        }
    }

    public void statusMenuState(){
        clearScreenUtil.clearTheScreen();
        gameMenu.displayPlayerStatusMenu(debugPlayerCharacter);

        switch (keyListenerUtil.getChosenOption()){
            case 1:
                //TODO Implementar menu de Iventário...
                break;
            case 2:
                setCurrentGameState(GameState.HOUSEMENU);
                break;
        }
    }

    public void exploreMenuState(){
        clearScreenUtil.clearTheScreen();
        //TODO Criar menu de exploração...
        System.out.println("1. Explorar\n" +
                "2. Voltar para cidade");

        switch (keyListenerUtil.getChosenOption()){
            case 1:
                // Explorar...
                explorationHandler.explorationState(debugPlayerCharacter, debugEnemyCharacter);
                break;
            case 2:
                // Voltar para cidade...
                setCurrentGameState(GameState.TOWNMENU);
                break;
        }
    }

}
