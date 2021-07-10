package mainclasses;
import java.lang.Math;
public abstract class Enemy {
    //properties
    private String name;
    private int health;
    private int attackPower;
    private int resistSTR;
    private int resistINT;

    //constructors
    public Enemy() {}
    public Enemy(String name, int health, int attackPower, int resistSTR, int resistINT) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.resistSTR = resistSTR;
        this.resistINT = resistINT;
    }
    

    //getter setter
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHealth() {
        return this.health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getAttackPower() {
        return this.attackPower;
    }
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    public int getResistSTR() {
        return this.resistSTR;
    }
    public void setResistSTR(int resistSTR) {
        this.resistSTR = resistSTR;
    }
    public int getResistINT() {
        return this.resistINT;
    }
    public void setResistINT(int resistINT) {
        this.resistINT = resistINT;
    }

    //methods
    public abstract void attack(int turnCounter);
    public abstract void skill1(int turnCounter);
    public abstract void skill2(int turnCounter);
    
    public int decisionPick() {
        return (int)Math.floor(Math.random()*(3-1+1)+1);
    }
}
