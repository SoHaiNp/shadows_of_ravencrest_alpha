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

        //TODO Revisar método while. Validar se de fato está influenciando em algo...
        while (playerCharacter.getCurrentHealthPoints() >= 0 || enemyCharacter.getCurrentHealthPoints() >= 0){
            switch (currentBattleState){
                case PLAYERTURN:
                    // Turno do Jogador...
                    clearScreenUtil.clearTheScreen();
                    menuModel.displayPlayerTurnMenu(playerCharacter, enemyCharacter);
                    playerTurn(playerCharacter, enemyCharacter);
                    break;
                case ENEMYTURN:
                    // Turno do Inimigo...
                    clearScreenUtil.clearTheScreen();
                    menuModel.displayEnemyTurnMenu(playerCharacter, enemyCharacter);
                    enemyTurn(enemyCharacter, playerCharacter);
                    break;
                case ENDBATTLE:
                    // Fim da batalha...
                    clearScreenUtil.clearTheScreen();
                    menuModel.displayPlayerTurnMenu(playerCharacter, enemyCharacter);
                    System.out.println("Fim da batalha...");
                    return;
            }
        }
    }

    public void setCurrentBattleState(BattleState currentBattleState){
        this.currentBattleState = currentBattleState;
    }

    //TODO Revisar método de turno do player. Tentar diminuir sua responsabilidade...
    public void playerTurn(PlayerModel playerCharacter, EnemyModel enemyCharacter){
        int playerAttackDamage = playerCharacter.getAttackPoints();
        int enemyHealth = enemyCharacter.getCurrentHealthPoints();

        switch (keyListenerUtil.getChosenOption()){
            case 1:
                // Atacou...
                enemyCharacter.setCurrentHealthPoints(enemyHealth -= playerAttackDamage);
                if (!isEnemyDead(enemyCharacter)){
                    System.out.println("| Você causou + " + playerAttackDamage + " + de dano...\n| Pressione 1 para passar o turno...\n+-----------------------------------------------------------+");
                    keyListenerUtil.getChosenOption();
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

    //TODO Revisar método de turno do inimigo. Tentar diminuir sua responsabilidade...
    public void enemyTurn(EnemyModel enemyCharacter, PlayerModel playerCharacter){
        int enemyAttackDamage = enemyCharacter.getAttackPoints();
        int playerHealth = playerCharacter.getCurrentHealthPoints();

        playerCharacter.setCurrentHealthPoints(playerHealth -= enemyAttackDamage);

        if(!isPlayerDead(playerCharacter)){
            System.out.println("| Você sofreu + " + enemyAttackDamage + " + de dano...\n| Pressione 1 para passar o turno...");
            if (keyListenerUtil.getChosenOption() == 1){
                setCurrentBattleState(BattleState.PLAYERTURN);
            }
        } else {
            setCurrentBattleState(BattleState.ENDBATTLE);
        }
    }

    public boolean isEnemyDead(EnemyModel enemyCharacter){
        return enemyCharacter.getCurrentHealthPoints() <= 0;
    }

    public boolean isPlayerDead(PlayerModel playerCharacter){
        return playerCharacter.getCurrentHealthPoints() <= 0;
    }

}
