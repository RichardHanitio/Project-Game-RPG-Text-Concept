package mainclasses;

public class Weapon {
    //properties
    private String currentWeapon;
    private String[] fighterWeapons = {"Iron Sword", "Sword of Balmung", "The Excalibur"};
    private String[] rangerWeapons = {"Hunter's Bow", "Bow of Arash", "The Dawnbreaker"};
    private String[] wizardWeapons = {"Mage Rod", "Mace of Destruction", "Wrath of Vulcan"};  
    private static int weaponLvl = 0;

    public Weapon(){
        switch(Player.getClassID()){
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
            switch (Player.getClassID()) {
                // fighter
                case 1:
                    this.currentWeapon = fighterWeapons[++weaponLvl];
                    break;
                // ranger
                case 2:
                    this.currentWeapon = rangerWeapons[++weaponLvl];
                    break;
                // wizard
                case 3:
                    this.currentWeapon = wizardWeapons[++weaponLvl];
            }
        }
    }


    @Override
    public String toString() {
        return this.currentWeapon;
    }

}
