package mainclasses;

public class Backpack {
    private int healthPotion = 5;
    private int manaPotion = 3;
    private Weapon weapon;


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

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(Weapon Weapon) {
        this.weapon = Weapon;
    }

    public void useHealthPotion(){
        this.healthPotion --;
    }
}
