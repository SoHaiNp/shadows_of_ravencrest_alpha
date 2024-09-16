package model;

import util.ClearScreenUtil;

import java.util.Scanner;

public class GameModel {

    private boolean isTurnedOn = false;

    private final MenuModel gameMenu = new MenuModel();
    private PlayerModel playerCharacter;

    private Scanner readChosenOption;
    private int chosenOption;
    private final ClearScreenUtil clearScreen;

    public enum GameState { MAINMENU, TOWNMENU, HOUSEMENU, STATUSMENU }
    private GameState currentGameState;

    public GameModel() {
        isTurnedOn = true;
        clearScreen = new ClearScreenUtil();
        readChosenOption = new Scanner(System.in);

        //TODO Implementar um menu de criação de personagem...
        playerCharacter = new PlayerModel("Lucian Nicolas",100,90,100,50,
                25,25,100,1000,1,99);
    }

    public void setGamePower(boolean isTurnedOn){
        this.isTurnedOn = isTurnedOn;
    }
    public boolean checkIfIsTurnedOn(){
        return isTurnedOn;
    }

    public int returnChosenOption(){
        chosenOption = readChosenOption.nextInt();
        readChosenOption.nextLine();
        return chosenOption;
    }

    public void setCurrentGameState(GameState currentGameState){
        this.currentGameState = currentGameState;
    }

    public GameState getCurrentGameState(){
        return currentGameState;
    }

    //TODO Buscar tratamento quando inputar opções inválidas...
    public void startGameState(){
        clearScreen.clear();
        gameMenu.displayMainMenu();

        switch (returnChosenOption()){
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
                setGamePower(false);
        }
    }

    public void townMenuState(){
        clearScreen.clear();
        gameMenu.displayTownMenu();

        switch (returnChosenOption()){
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

        switch (returnChosenOption()){
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

        switch (returnChosenOption()){
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
