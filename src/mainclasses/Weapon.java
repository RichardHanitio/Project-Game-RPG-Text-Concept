package mainclasses;

public class Weapon {
    //properties
    private Player player;
    private String currentWeapon;
    private String[] fighterWeapons = {"Iron Sword", "Sword of Balmung", "The Excalibur"};
    private String[] rangerWeapons = {"Hunter's Bow", "Bow of Arash", "The Dawnbreaker"};
    private String[] wizardWeapons = {"Mage Rod", "Mace of Destruction", "Wrath of Vulcan"};  
    private static int weaponLvl = 0;

    public Weapon(){
        switch(player.getClassID()){
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
            switch (player.getClassID()) {
                // fighter
                case 1:
                    this.currentWeapon = fighterWeapons[++weaponLvl];
                    if(weaponLvl==1){
                        player.setHealth(player.getHealth() + 100);
                        player.setAttSTR(player.getAttSTR() + 50);
                    } else {
                        player.setHealth(player.getHealth() + 180);
                        player.setAttSTR(player.getAttSTR() + 75);
                    }
                    break;
                // ranger
                case 2:
                    this.currentWeapon = rangerWeapons[++weaponLvl];
                    if (weaponLvl == 1) {
                        player.setHealth(player.getHealth() + 80);
                        player.setAttSTR(player.getAttSTR() + 60);
                    } else {
                        player.setHealth(player.getHealth() + 120);
                        player.setAttSTR(player.getAttSTR() + 100);
                    }
                    break;
                // wizard
                case 3:
                    if (weaponLvl == 1) {
                        player.setHealth(player.getHealth() + 40);
                        player.setAttINT(player.getAttINT() + 20);
                    } else {
                        player.setHealth(player.getHealth() + 70);
                        player.setAttINT(player.getAttINT() + 40);
                    }
                    this.currentWeapon = wizardWeapons[++weaponLvl];
            }
        }
    }


    @Override
    public String toString() {
        return this.currentWeapon;
    }

}
