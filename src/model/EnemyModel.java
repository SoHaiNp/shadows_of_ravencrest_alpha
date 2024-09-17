package model;

public class EnemyModel {

    private String enemyName;
    private int maximumHealthPoints;
    private int currentHealthPoints;
    private int attackPoints;
    private int defensePoints;

    public EnemyModel(String enemyName, int maximumHealthPoints, int currentHealthPoints, int attackPoints, int defensePoints) {
        this.enemyName = enemyName;
        this.maximumHealthPoints = maximumHealthPoints;
        this.currentHealthPoints = currentHealthPoints;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
    }

    public String getenemyName() {
        return enemyName;
    }

    public void setenemyName(String enemyName) {
        this.enemyName = enemyName;
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
