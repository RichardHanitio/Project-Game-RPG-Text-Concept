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

    //constructors
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

    //methods
    public String getCurrentWeapon() {
        return this.currentWeapon;
    }

    public boolean upgradeWeapon() {
        if (weaponLvl<2) {
            switch (this.playerClassID) {
                // fighter
                case 1:
                    if (weaponLvl < Player.getCurrentStage()-1){
                        this.currentWeapon = fighterWeapons[++weaponLvl];

                        System.out.println("Weapon upgraded successfully!!!");
                        System.out.println(fighterWeapons[weaponLvl-1] + " => " + getCurrentWeapon());

                        if(weaponLvl==1){
                            Fighter.setMaxHealth(Fighter.getMaxHealth() + 100);
                            Fighter.setAttSTR(Fighter.getAttSTR() + 50);
                            System.out.println(
                                "Player stat added : \n" +
                                "Health\t\t+100\n" + 
                                "Attack Power\t+50"
                            );
                        } else {
                            Fighter.setMaxHealth(Fighter.getHealth() + 180);
                            Fighter.setAttSTR(Fighter.getAttSTR() + 75);
                            System.out.println(
                                "Player stat added : \n" +
                                "Health\t\t+100\n" + 
                                "Attack Power\t+50"
                            );
                        }
                        return true;
                    } else {
                        System.out.println("You can't upgrade this weapon yet...Clear next stage to upgrade!");
                        return false;
                    }
                // ranger
                case 2:
                    if (weaponLvl < Player.getCurrentStage()-1){
                        this.currentWeapon = rangerWeapons[++weaponLvl];
                        
                        System.out.println("Weapon upgraded successfully!!!");
                        System.out.println(rangerWeapons[weaponLvl-1] + " => " + getCurrentWeapon());

                        if (weaponLvl == 1) {
                            Ranger.setMaxHealth(Ranger.getMaxHealth() + 70);
                            Ranger.setAttSTR(Ranger.getAttSTR() + 45);
                            System.out.println(
                                "Player stat added : \n" +
                                "Health\t\t+70\n" + 
                                "Attack Power\t+45"
                            );
                        } else {
                            Ranger.setMaxHealth(Ranger.getMaxHealth() + 120);
                            Ranger.setAttSTR(Ranger.getAttSTR() + 70);
                            System.out.println(
                                "Player stat added : \n" +
                                "Health\t\t+120\n" +  
                                "Attack Power\t+70"
                            );
                        }
                        return true;
                    } else {
                        System.out.println("You can't upgrade this weapon yet...Clear next stage to upgrade!");
                        return false;
                    }
                    
                    
                // wizard
                case 3:
                    if (weaponLvl < Player.getCurrentStage()-1){
                        this.currentWeapon = wizardWeapons[++weaponLvl];

                        System.out.println("Weapon upgraded successfully!!!");
                        System.out.println(wizardWeapons[weaponLvl-1] + " => " + getCurrentWeapon());

                        if (weaponLvl == 1) {
                            Wizard.setMaxHealth(Wizard.getMaxHealth() + 40);
                            Wizard.setAttINT(Wizard.getAttINT() + 20);
                            System.out.println(
                                "Player stat added : \n" +
                                "Health\t\t+40\n" + 
                                "Attack Power\t+20"
                            );
                        } else {
                            Wizard.setMaxHealth(Wizard.getMaxHealth() + 60);
                            Wizard.setAttINT(Wizard.getAttINT() + 30);
                            System.out.println(
                                "Player stat added : \n" +
                                "Health\t\t+60\n" + 
                                "Attack Power\t+30"
                            );
                        }
                        return true;
                    } else {
                        System.out.println("You can't upgrade this weapon yet...Clear next stage to upgrade!");
                        return false;
                    }
            }
        }return false;
    }


    @Override
    public String toString() {
        return getCurrentWeapon();
    }

}
