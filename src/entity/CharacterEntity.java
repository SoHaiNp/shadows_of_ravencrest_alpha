package entity;

public class CharacterEntity {

    private String playerName;

    private int currentHealthPoints;
    private int maximumHealthPoints;

    private int currentManaPoints;
    private int maximumManaPoints;

    private int attackPoints;
    private int defensePoints;

    private int currentExperiencePoints;
    private int maximumExperiencePoints;

    private int currentLevel;
    private int maximumLevel;

    public CharacterEntity(String playerName, int currentHealthPoints, int maximumHealthPoints, int currentManaPoints,
                           int maximumManaPoints, int attackPoints, int defensePoints, int currentExperiencePoints,
                           int maximumExperiencePoints, int currentLevel, int maximumLevel) {
        this.playerName = playerName;
        this.currentHealthPoints = currentHealthPoints;
        this.maximumHealthPoints = maximumHealthPoints;
        this.currentManaPoints = currentManaPoints;
        this.maximumManaPoints = maximumManaPoints;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.currentExperiencePoints = currentExperiencePoints;
        this.maximumExperiencePoints = maximumExperiencePoints;
        this.currentLevel = currentLevel;
        this.maximumLevel = maximumLevel;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getCurrentHealthPoints() {
        return currentHealthPoints;
    }

    public void setCurrentHealthPoints(int currentHealthPoints) {
        this.currentHealthPoints = currentHealthPoints;
    }

    public int getMaximumHealthPoints() {
        return maximumHealthPoints;
    }

    public void setMaximumHealthPoints(int maximumHealthPoints) {
        this.maximumHealthPoints = maximumHealthPoints;
    }

    public int getCurrentManaPoints() {
        return currentManaPoints;
    }

    public void setCurrentManaPoints(int currentManaPoints) {
        this.currentManaPoints = currentManaPoints;
    }

    public int getMaximumManaPoints() {
        return maximumManaPoints;
    }

    public void setMaximumManaPoints(int maximumManaPoints) {
        this.maximumManaPoints = maximumManaPoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    public int getCurrentExperiencePoints() {
        return currentExperiencePoints;
    }

    public void setCurrentExperiencePoints(int currentExperiencePoints) {
        this.currentExperiencePoints = currentExperiencePoints;
    }

    public int getMaximumExperiencePoints() {
        return maximumExperiencePoints;
    }

    public void setMaximumExperiencePoints(int maximumExperiencePoints) {
        this.maximumExperiencePoints = maximumExperiencePoints;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public int getMaximumLevel() {
        return maximumLevel;
    }

    public void setMaximumLevel(int maximumLevel) {
        this.maximumLevel = maximumLevel;
    }
}
