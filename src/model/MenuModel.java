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

    public void displayPlayerTurnHeader(PlayerModel playerCharacter, EnemyModel enemyCharacter){
        MENUTEXTUTIL.playerTurnHeaderText(playerCharacter, enemyCharacter);
    }

    public void displayEnemyTurnHeader(PlayerModel playerCharacter, EnemyModel enemyCharacter){
        MENUTEXTUTIL.enemyTurnHeaderText(playerCharacter, enemyCharacter);
    }

    public void displayPlayerDamageCalculationFooter(PlayerModel playerCharacter){
        MENUTEXTUTIL.playerDamageCalculationFooterText(playerCharacter);
    }

    public void displayEnemyDamageCalculationFooter(EnemyModel enemyCharacter){
        MENUTEXTUTIL.enemyDamageCalculationFooterText(enemyCharacter);
    }

}
