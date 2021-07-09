package mainclasses;

public class Backpack {
    
    private int healthPotion = 5;
    private int manaPotion = 3;

    public Backpack() {

    }

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

    public void useHealthPotion(){
        this.healthPotion --;
    }
}
