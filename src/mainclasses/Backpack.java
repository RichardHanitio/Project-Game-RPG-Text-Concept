package mainclasses;

public class Backpack {
    int healthPotion = 5;
    int manaPotion = 3;
    Weapon weapon;


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

    public void usePotionHealth() {
        int Health = Player.getHealth();
        healthPotion--;
    }

    public void usePotionMana() {
        Player.getMana() += 3;
        manaPotion--;
    }

    public void openBackpack() {
       switch(pilihan){
            case 1:
                usePotionHealth();
            case 2:
                usePotionMana();
       }
    }
}
