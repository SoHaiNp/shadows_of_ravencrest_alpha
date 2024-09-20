package model;

public class PlayerModel {

    private String playerName;
    private int maximumHealthPoints;
    private int currentHealthPoints;
    private int maximumManaPoints;
    private int currentManaPoints;
    private int attackPoints;
    private int defensePoints;
    private int currentExperiencePoints;
    private int maximumExperiencePoints;
    private int currentLevel;
    private int maximumLevel;

    public PlayerModel(String playerName, int maximumHealthPoints, int currentHealthPoints, int maximumManaPoints, int currentManaPoints, int attackPoints, int defensePoints, int currentExperiencePoints, int maximumExperiencePoints, int currentLevel, int maximumLevel) {
        this.playerName = playerName;
        this.maximumHealthPoints = maximumHealthPoints;
        this.currentHealthPoints = currentHealthPoints;
        this.maximumManaPoints = maximumManaPoints;
        this.currentManaPoints = currentManaPoints;
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

    public int getMaximumHealthPoints() {
        return maximumHealthPoints;
    }

    public void setMaximumHealthPoints(int maximumHealthPoints) {
        this.maximumHealthPoints = maximumHealthPoints;
    }

    public int getCurrentHealthPoints() {
        return currentHealthPoints;
    }

    public void setCurrentHealthPoints(int currentHealthPoints) {
        this.currentHealthPoints = currentHealthPoints;
    }

    public int getMaximumManaPoints() {
        return maximumManaPoints;
    }

    public void setMaximumManaPoints(int maximumManaPoints) {
        this.maximumManaPoints = maximumManaPoints;
    }

    public int getCurrentManaPoints() {
        return currentManaPoints;
    }

    public void setCurrentManaPoints(int currentManaPoints) {
        this.currentManaPoints = currentManaPoints;
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
