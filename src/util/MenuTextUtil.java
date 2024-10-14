package util;

import model.EnemyModel;
import model.PlayerModel;

public class MenuTextUtil {

    public void mainMenuText(){
        System.out.println("""
            + ------------------------------------ Sombras do Brasão do Corvo ------------------------------------- +
            |                                                                                                       |
            | Uma escuridão antiga cresce nas sombras da Guilda do Corvo. Os corajosos que ousarem investigar       |
            | poderão revelar segredos há muito esquecidos... ou encontrar um destino pior que a morte.             |
            |                                                                                                       |
            | A Guilda do Corvo, protetora das civilizações, agora enfrenta um mal de dentro. Entre monstros        |
            | disfarçados e aliados corrompidos, o destino da paz está em suas mãos.                                |
            |                                                                                                       |
            + ----------------------------------------------------------------------------------------------------- +
            | 1. Novo Jogo                                                                                          |
            | 2. Carregar Jogo                                                                                      |
            | 3. Opções                                                                                             |
            | 4. Créditos                                                                                           |
            | 5. Sair                                                                                               |
            + ----------------------------------------------------------------------------------------------------- +
            | Escolha uma opção:                                                                                    |
            + ----------------------------------------------------------------------------------------------------- +""");
    }

    public void townMenuText(){
        System.out.println("""
            + ---------------------------------------- Cidade Brasão do Corvo ----------------------------------------- +
            |                                                                                                           |
            | A cidade Brasão do Corvo é um refúgio de paz, cercado por florestas sombrias e montanhas. Seus becos e    |
            | ruas escondem histórias antigas, enquanto os habitantes se mantém distantes do medo das criaturas da      |
            | noite.                                                                                                    |
            |                                                                                                           |
            | A Guilda do Corvo mantém a ordem, mas os sussurros sobre traições e segredos correm pelas tavernas e      |
            | becos. Enquanto a névoa cobre a cidade, você deve decidir seu próximo passo.                              |
            |                                                                                                           |
            + --------------------------------------------- Opções ---------------------------------------------------- +
            | 1. Casa                                                                                                   |
            | 2. Taverna                                                                                                |
            | 3. Ferreiro                                                                                               |
            | 4. Mercador                                                                                               |
            | 5. Guilda do Corvo                                                                                        |
            | 6. Viagem                                                                                                 |
            + --------------------------------------------------------------------------------------------------------- +
            | Escolha uma opção:                                                                                        |
            + --------------------------------------------------------------------------------------------------------- +""");
    }

    public void houseMenuText(){
        System.out.println("""
            + ---------------------------------------------- Casa ----------------------------------------------------- +
            |                                                                                                           |
            | Você está em sua casa, um local de descanso e planejamento. Este é o único lugar onde o tempo parece      |
            | parar, permitindo que você recupere suas forças e planeje seus próximos passos. O ambiente é simples,     |
            | mas funcional, com uma mesa para seus estudos e uma agenda de suas tarefas.                               |
            |                                                                                                           |
            + --------------------------------------------- Opções ---------------------------------------------------- +
            | 1. Porta da Casa (Explorar a cidade)                                                                      |
            | 2. Mesa de Pesquisa (Status do personagem)                                                                |
            | 3. Agenda (Retornar ao Menu, Salvar e Sair do Jogo)                                                       |
            + --------------------------------------------------------------------------------------------------------- +
            | Escolha uma opção:                                                                                        |
            + --------------------------------------------------------------------------------------------------------- +""");
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

    public void playerTurnHeaderText(PlayerModel playerCharacter, EnemyModel enemyCharacter){
        System.out.println("+---------------------- Turno Jogador -------------------------+\n" +
                "| + " + playerCharacter.getPlayerName() + " +       Life: + " + playerCharacter.getCurrentHealthPoints() + "/" + playerCharacter.getMaximumHealthPoints() + "\n" +
                "| + " + enemyCharacter.getenemyName() + " +              Life: + " + enemyCharacter.getCurrentHealthPoints() + "/" + enemyCharacter.getMaximumHealthPoints() + "\n" +
                "+------------------------- Opções -------------------------+\n" +
                "| 1. Atacar o inimigo\n" +
                "| 2. Defender\n" +
                "| 3. Fugir da batalha\n" +
                "+----------------------------------------------------------+");
    }

    public void enemyTurnHeaderText(PlayerModel playerCharacter, EnemyModel enemyCharacter){
        System.out.println("+---------------------- Turno Inimigo -------------------------+\n" +
                "| + " + playerCharacter.getPlayerName() + " +       Life: + " + playerCharacter.getCurrentHealthPoints() + "/" + playerCharacter.getMaximumHealthPoints() + "\n" +
                "| + " + enemyCharacter.getenemyName() + " +              Life: + " + enemyCharacter.getCurrentHealthPoints() + "/" + enemyCharacter.getMaximumHealthPoints());
    }

    public void playerDamageCalculationFooterText(PlayerModel playerCharacter){
        System.out.println("+------------------------- Mensagem -------------------------+\n" +
                "| Você CAUSOU + " + playerCharacter.getAttackPoints() + " + de dano...\n" +
                "| Pressione um número para passar o turno...\n" +
                "+-----------------------------------------------------------+");
    }

    public void enemyDamageCalculationFooterText(EnemyModel enemyCharacter){
        System.out.println("+------------------------- Mensagem -------------------------+\n" +
                "| Você SOFREU + " + enemyCharacter.getAttackPoints() + " + de dano...\n" +
                "| Pressione um número para passar o turno...\n" +
                "+-----------------------------------------------------------+");
    }

    //TODO Criar menu de contagem de experiência...

}
