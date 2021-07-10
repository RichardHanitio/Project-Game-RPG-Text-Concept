package mainclasses;

public class Backpack {
    //properties
    private int healthPotion = 5;
    private int manaPotion = 3;

    //constructors
    public Backpack() {}

    //getter setter
    public int getHealthPotion() {
        return this.healthPotion;
    }
    public void setHealthPotion(int healthPotion) {
        this.healthPotion = healthPotion;
    }
    public int getManaPotion() {
        return this.manaPotion;
    }
    public void setManaPotion(int manaPotion) {
        this.manaPotion = manaPotion;
    }
}
