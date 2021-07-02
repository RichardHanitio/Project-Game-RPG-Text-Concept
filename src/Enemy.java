public abstract class Enemy {
    //properties
    private String name;
    private int health;
    private int attackPower;
    private int resistStr;
    private int resistInt;

    //constructor
    public Enemy() {
    }

    public Enemy(String name, int health, int attackPower, int resistStr, int resistInt) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.resistStr = resistStr;
        this.resistInt = resistInt;
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

    public int getResistStr() {
        return this.resistStr;
    }

    public void setResistStr(int resistStr) {
        this.resistStr = resistStr;
    }

    public int getResistInt() {
        return this.resistInt;
    }

    public void setResistInt(int resistInt) {
        this.resistInt = resistInt;
    }

    //methods
    public abstract void attack();
    public abstract void skill1();
    public abstract void skill2();
    public abstract void skill3();
    
    public int decisionPick() {
        return 0;
    }
}
