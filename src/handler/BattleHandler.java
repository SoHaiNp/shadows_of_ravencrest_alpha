package handler;

import model.EnemyModel;
import model.MenuModel;
import model.PlayerModel;
import util.ClearScreenUtil;
import util.KeyListenerUtil;

public class BattleHandler {

    private final ClearScreenUtil clearScreenUtil;
    private final KeyListenerUtil keyListenerUtil;
    private final MenuModel menuModel;

    public enum BattleState { PLAYERTURN, ENEMYTURN, ENDBATTLE }
    private BattleState currentBattleState;

    public BattleHandler(){
        clearScreenUtil = new ClearScreenUtil();
        keyListenerUtil = new KeyListenerUtil();
        menuModel = new MenuModel();
    }

    public void battleState(PlayerModel playerCharacter, EnemyModel enemyCharacter){
        currentBattleState = BattleState.PLAYERTURN;

        while (true){
            switch (currentBattleState){
                case PLAYERTURN:
                    clearScreenUtil.clearTheScreen();
                    menuModel.displayPlayerTurnHeader(playerCharacter, enemyCharacter);
                    playerTurn(playerCharacter, enemyCharacter);
                    break;
                case ENEMYTURN:
                    clearScreenUtil.clearTheScreen();
                    menuModel.displayEnemyTurnHeader(playerCharacter, enemyCharacter);
                    enemyTurn(enemyCharacter, playerCharacter);
                    break;
                case ENDBATTLE:
                    clearScreenUtil.clearTheScreen();
                    //TODO Adicionar fluxo de contagem de experiência e retorno para exploração...
                    menuModel.displayPlayerTurnHeader(playerCharacter, enemyCharacter);
                    System.out.println("Fim da batalha...");
                    return;
            }
        }
    }

    public void playerTurn(PlayerModel playerCharacter, EnemyModel enemyCharacter){

        switch (keyListenerUtil.getChosenOption()){
            case 1:
                // Atacou...
                playerAttack(playerCharacter, enemyCharacter);
                if (!isEnemyDead(enemyCharacter)){
                    menuModel.displayPlayerDamageCalculationFooter(playerCharacter);
                    keyListenerUtil.optionToProceed();
                    setCurrentBattleState(BattleState.ENEMYTURN);
                } else {
                    setCurrentBattleState(BattleState.ENDBATTLE);
                }
                break;
            case 2:
                // Defendeu...
                break;
            case 3:
                // Fugiu...
                break;
        }
    }

    public void enemyTurn(EnemyModel enemyCharacter, PlayerModel playerCharacter){
        enemyAttack(enemyCharacter, playerCharacter);

        if(!isPlayerDead(playerCharacter)){
            menuModel.displayEnemyDamageCalculationFooter(enemyCharacter);
            keyListenerUtil.optionToProceed();
            setCurrentBattleState(BattleState.PLAYERTURN);
        } else {
            setCurrentBattleState(BattleState.ENDBATTLE);
        }
    }

    public void playerAttack(PlayerModel playerCharacter, EnemyModel enemyCharacter){
        int playerAttackDamage = playerCharacter.getAttackPoints();
        int enemyHealthPoints = enemyCharacter.getCurrentHealthPoints();

        enemyCharacter.setCurrentHealthPoints(enemyHealthPoints - playerAttackDamage);
    }

    public void enemyAttack(EnemyModel enemyCharacter, PlayerModel playerCharacter){
        int enemyAttackDamage = enemyCharacter.getAttackPoints();
        int playerHealthPoints = playerCharacter.getCurrentHealthPoints();

        playerCharacter.setCurrentHealthPoints(playerHealthPoints - enemyAttackDamage);
    }

    public boolean isPlayerDead(PlayerModel playerCharacter){
        return playerCharacter.getCurrentHealthPoints() <= 0;
    }

    public boolean isEnemyDead(EnemyModel enemyCharacter){
        return enemyCharacter.getCurrentHealthPoints() <= 0;
    }

    public void setCurrentBattleState(BattleState currentBattleState){
        this.currentBattleState = currentBattleState;
    }

}
