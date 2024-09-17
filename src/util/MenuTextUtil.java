package util;

import model.EnemyModel;
import model.PlayerModel;

public class MenuTextUtil {

    public void mainMenuText(){
        System.out.println("""
                + ---------------------------------------- Shadows of the Raven Crest ---------------------------------------- +
                | 1. Carregar Jogo
                | 2. Novo Jogo
                | 3. Sair do Jogo
                + ------------------------------------------------------------------------------------------ +
                | By: Mochileiros
                | From: 2014 - 2024
                + ------------------------------------------------------------------------------------------ +""");
    }

    public void townMenuText(){
        System.out.println("""
                + ---------------------------------------- Mensagem ---------------------------------------- +
                | Estou na Cidade. Onde devo ir agora?
                + ---------------------------------------- Opções ---------------------------------------- +
                | 1. Casa
                | 2. Taverna
                | 3. Ferreiro
                | 4. Mercador
                | 5. Guilda do Corvo
                | 6. Viagem
                + ------------------------------------------------------------------------------------------ +""");
    }

    public void houseMenuText(){
        System.out.println("""
                + ---------------------------------------- Mensagem ---------------------------------------- +
                | Estou dentro de Casa. Onde devo ir agora?
                + ---------------------------------------- Opções ---------------------------------------- +
                | 1. Porta da Casa (Explorar a cidade)
                | 2. Mesa de Pesquisa (Status do personagem)
                | 3. Agenda (Retornar ao Menu, Salvar e Sair do Jogo)
                + ------------------------------------------------------------------------------------------ +""");
    }

    public void playerStatusMenuText(PlayerModel playerCharacter){
        System.out.println("+ ------------------------------ " + playerCharacter.getPlayerName() + " ------------------------------ +\n" +
                "| Nível: " + playerCharacter.getCurrentLevel() + "/" + playerCharacter.getMaximumLevel() + "\n" +
                "| Experiência: " + playerCharacter.getCurrentExperiencePoints() + "/" + playerCharacter.getMaximumExperiencePoints() + "\n" +
                "+ ---------------------------------------------------------------------------- +\n" +
                "| Pontos de Vida: " + playerCharacter.getCurrentHealthPoints() + "/" + playerCharacter.getMaximumHealthPoints() + "\n" +
                "| Pontos de Mana: " + playerCharacter.getCurrentManaPoints() + "/" + playerCharacter.getMaximumManaPoints() + "\n" +
                "+ ---------------------------------------------------------------------------- +\n" +
                "| Pontos de Ataque: " + playerCharacter.getAttackPoints() + "\n" +
                "| Pontos de Defesa: " + playerCharacter.getDefensePoints() + "\n" +
                "+ ---------------------------------------------------------------------------- +\n" +
                "| 1. Iventário\n" +
                "| 2. Sair do Menu do Personagem\n" +
                "+ ---------------------------------------------------------------------------- +");
                //TODO Incrementar opção de vizualização de iventário do personagem...
    }

    public void playerTurnMenuText(PlayerModel playerCharacter, EnemyModel enemyCharacter){
        System.out.println("+------------------------- Player Turn -------------------------+");
        System.out.println("| + " + playerCharacter.getPlayerName() + " +       Life: + " + playerCharacter.getCurrentHealthPoints() + "/" + playerCharacter.getMaximumHealthPoints() +
                "\n| + " + enemyCharacter.getenemyName() + " +              Life: + " + enemyCharacter.getCurrentHealthPoints() + "/" + enemyCharacter.getMaximumHealthPoints());
        System.out.println("+------------------------- Options -------------------------+");
        System.out.println("| 1. Attack the monster");
        System.out.println("| 2. Deffense position");
        System.out.println("| 3. Run from the battle\n" +
                "+ ----------------------------------------------------------+");
    }

    public void enemyTurnMenuText(PlayerModel playerCharacter, EnemyModel enemyCharacter){
        System.out.println("+------------------------- Enemy Turn -------------------------+");
        System.out.println("| + " + playerCharacter.getPlayerName() + " +       Life: + " + playerCharacter.getCurrentHealthPoints() + "/" + playerCharacter.getMaximumHealthPoints() +
                "\n| + " + enemyCharacter.getenemyName() + " +              Life: + " + enemyCharacter.getCurrentHealthPoints() + "/" + enemyCharacter.getMaximumHealthPoints());
        System.out.println("+------------------------- Options -------------------------+");
    }

}
