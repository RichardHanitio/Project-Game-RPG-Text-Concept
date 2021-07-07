package mainclasses;

public class Backpack {
    public static int healthPotion = 5;
    public static int manaPotion = 3;
    Weapon weapon;


    public Backpack() {
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(Weapon Weapon) {
        this.weapon = Weapon;
    }

}
