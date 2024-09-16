package model;

import handler.OptionHandler;
import util.ClearScreenUtil;

public class GameModel {

    private boolean gamePowerState;

    private final ClearScreenUtil clearScreen;
    private final MenuModel gameMenu = new MenuModel();
    private final OptionHandler optionHandler;

    public enum GameState { MAINMENU, TOWNMENU, HOUSEMENU, STATUSMENU }
    private GameState currentGameState;

    private PlayerModel playerCharacter;
    private EnemyModel enemyCharacter;

    public GameModel() {
        gamePowerState = true;
        clearScreen = new ClearScreenUtil();
        optionHandler = new OptionHandler();

        //TODO Implementar um menu de criação de personagem...
        playerCharacter = new PlayerModel("Lucian Nicolas",100,90,100,50,
                25,25,100,1000,1,99);
        enemyCharacter = new EnemyModel("Zombie", 20, 20, 15, 10);
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
        clearScreen.clear();
        gameMenu.displayMainMenu();

        switch (optionHandler.returnChosenOption()){
            case 1:
                System.out.println("Mudando para Cidade...");
                currentGameState = GameState.TOWNMENU;
                System.out.println("Mudou para " + getCurrentGameState());
                break;
            case 2:
                //TODO Implementar menu de Novo Jogo (relação com criação de personagem)...
                break;
            case 3:
                System.out.println("Encerrando Jogo...");
                setGamePowerState(false);
        }
    }

    public void townMenuState(){
        clearScreen.clear();
        gameMenu.displayTownMenu();

        switch (optionHandler.returnChosenOption()){
            case 1:
                System.out.println("Mudando para Cidade...");
                setCurrentGameState(GameState.HOUSEMENU);
                System.out.println("Mudou para " + getCurrentGameState());
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
                // Viagem...
                //TODO Implementar menu de Viagem...
                break;
        }

    }

    public void houseMenuState(){
        clearScreen.clear();
        gameMenu.displayHouseMenu();

        switch (optionHandler.returnChosenOption()){
            case 1:
                System.out.println("Mudando para Cidade...");
                setCurrentGameState(GameState.TOWNMENU);
                System.out.println("Mudou para " + getCurrentGameState());
                break;
            case 2:
                System.out.println("Mudando para Status...");
                setCurrentGameState(GameState.STATUSMENU);
                System.out.println("Mudou para " + getCurrentGameState());
                break;
            case 3:
                //TODO Ao seguir esse fluxo, por algum motivo não é possível encerrar o jogo quando volta para o Menu Principal...
                System.out.println("Mudando para Início...");
                setCurrentGameState(GameState.MAINMENU);
                System.out.println("Mudou para " + getCurrentGameState());
                break;
        }
    }

    public void statusMenuState(){
        clearScreen.clear();
        gameMenu.displayPlayerStatusMenu(playerCharacter);

        switch (optionHandler.returnChosenOption()){
            case 1:
                //TODO Implementar menu de Iventário...
                break;
            case 2:
                System.out.println("Mudando para Casa...");
                setCurrentGameState(GameState.HOUSEMENU);
                System.out.println("Mudou para " + getCurrentGameState());
                break;
        }
    }

}
