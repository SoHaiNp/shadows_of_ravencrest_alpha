package model;

import util.MenuTextUtil;

public class MenuModel {

    private final MenuTextUtil MENUTEXTUTIL = new MenuTextUtil();

    public void displayMainMenu(){
        MENUTEXTUTIL.mainMenuText();
    }

    public void displayTownMenu(){
        MENUTEXTUTIL.townMenuText();
    }

    public void displayHouseMenu(){
        MENUTEXTUTIL.houseMenuText();
    }

    public void displayPlayerStatusMenu(PlayerModel playerModel){
        MENUTEXTUTIL.playerStatusMenuText(playerModel);
    }

    public void displayPlayerTurnMenu(PlayerModel playerCharacter, EnemyModel enemyCharacter){
        MENUTEXTUTIL.playerTurnMenuText(playerCharacter, enemyCharacter);
    }

    public void displayEnemyTurnMenu(PlayerModel playerCharacter, EnemyModel enemyCharacter){
        MENUTEXTUTIL.enemyTurnMenuText(playerCharacter, enemyCharacter);
    }

}
