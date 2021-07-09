package mainclasses;
import playersubclasses.*;

public class Weapon {
    //properties
    private int playerClassID;
    private String currentWeapon;
    private String[] fighterWeapons = {"Iron Sword", "Sword of Balmung", "The Excalibur"};
    private String[] rangerWeapons = {"Hunter's Bow", "Bow of Arash", "The Dawnbreaker"};
    private String[] wizardWeapons = {"Mage Rod", "Mace of Destruction", "Wrath of Vulcan"};  
    private static int weaponLvl = 0;

    public String getCurrentWeapon() {
        return this.currentWeapon;
    }

    public Weapon() {
        
    }

    public Weapon(int playerClassID){
        this.playerClassID = playerClassID;
        switch(this.playerClassID){
            //fighter
            case 1 : 
                this.currentWeapon = fighterWeapons[weaponLvl];
                break;
            //ranger
            case 2 : 
                this.currentWeapon = rangerWeapons[weaponLvl];
                break;
            //wizard
            case 3 : 
                this.currentWeapon = wizardWeapons[weaponLvl];
        }
    }

    public void upgradeWeapon() {
        if (weaponLvl<2) {
            switch (this.playerClassID) {
                // fighter
                case 1:
                    this.currentWeapon = fighterWeapons[++weaponLvl];

                    if(weaponLvl==1){
                        Fighter.setHealth(Fighter.getHealth() + 100);
                        Fighter.setAttSTR(Fighter.getAttSTR() + 50);
                    } else {
                        Fighter.setHealth(Fighter.getHealth() + 180);
                        Fighter.setHealth(Fighter.getAttSTR() + 75);
                    }
                    break;
                // ranger
                case 2:
                    this.currentWeapon = rangerWeapons[++weaponLvl];
                    
                    if (weaponLvl == 1) {
                        Ranger.setHealth(Ranger.getHealth() + 80);
                        Ranger.setAttSTR(Ranger.getAttSTR() + 60);
                    } else {
                        Ranger.setHealth(Ranger.getHealth() + 120);
                        Ranger.setAttSTR(Ranger.getAttSTR() + 100);
                    }
                    
                    break;
                // wizard
                case 3:
                    this.currentWeapon = wizardWeapons[++weaponLvl];
                    if (weaponLvl == 1) {
                        Wizard.setHealth(Wizard.getHealth() + 40);
                        Wizard.setAttINT(Wizard.getAttINT() + 20);
                    } else {
                        Wizard.setHealth(Wizard.getHealth() + 70);
                        Wizard.setAttINT(Wizard.getAttINT() + 40);
                    }
            }
        }
    }


    @Override
    public String toString() {
        return getCurrentWeapon();
    }

}
