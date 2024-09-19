package entity;

public class EnemyCharacterEntity extends CharacterEntity{

    public EnemyCharacterEntity(String playerName, int currentHealthPoints, int maximumHealthPoints, int currentManaPoints,
                                int maximumManaPoints, int attackPoints, int defensePoints, int currentExperiencePoints,
                                int maximumExperiencePoints, int currentLevel, int maximumLevel) {

        super(playerName, currentHealthPoints, maximumHealthPoints, currentManaPoints, maximumManaPoints, attackPoints,
                defensePoints, currentExperiencePoints, maximumExperiencePoints, currentLevel, maximumLevel);

    }

}
