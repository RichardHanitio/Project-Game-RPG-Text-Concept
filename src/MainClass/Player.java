package MainClass;

public abstract class Player{
    String name;
    int health;
    int mana;
    Backpack backpack;
    int gold;

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

    public int getMana() {
        return this.mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Backpack getBackpack() {
        return this.backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    public int getGold() {
        return this.gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    //Constructor empty untuk player
    public Player(){}

    public Player(String name,int health,int mana){
        this.name = name;
        this.health = health;
        this.mana = mana;
    }

    //Method serangan player
    public abstract void attack();
    public abstract void skill1();
    public abstract void skill2();
    public abstract void skill3();
    public abstract void skill4();
    
    //Multiplier empty player
    public abstract int multiplier();

}