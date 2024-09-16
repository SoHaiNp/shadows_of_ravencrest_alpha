package model;

public class EnemyModel {

    private String monsterName;
    private int maximumHealthPoints;
    private int currentHealthPoints;
    private int attackPoints;
    private int defensePoints;

    public EnemyModel(String monsterName, int maximumHealthPoints, int currentHealthPoints, int attackPoints, int defensePoints) {
        this.monsterName = monsterName;
        this.maximumHealthPoints = maximumHealthPoints;
        this.currentHealthPoints = currentHealthPoints;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
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
}
