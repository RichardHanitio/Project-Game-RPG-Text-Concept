package playersubclasses;
import java.util.Random;
import mainclasses.Enemy;
import mainclasses.Player;
import mainclasses.Weapon;
import mainclasses.Battle;

/*
Nama : Calvin Wendy
NIM : 03082200010
*/

public class Tank extends Player{
    //properties
    private Weapon weapon;

    //constructor
    public Tank(String name){
        //Nama berasal dari player
        //health awal   : 1000
        //str awal      : 5
        //mana awal     : 0
        super(name,1000,0,5,0);
        super.setClassID(1); //weapon tank = weapon fighter
        this.weapon = new Weapon(getClassID());
        super.setWeapon(weapon); 
    }

    public Tank(String name, int health, int mana, int attSTR, int attINT){
        setName(name);
        setClassOriginalHealth(health);
        setMana(mana);
        setClassOriginalINT(attINT);
        setClassOriginalSTR(attSTR);
    }
    
    //methods
    public int multiplier() {
        // Multiplier untuk Tank
        Random rand = new Random();
        // multi memiliki nilai minimum 1 dan maksimum 6
        int multi = rand.nextInt(4) + 1;
        return multi;
    }

    public void attack(int turnCounter, Enemy enemy) {
        System.out.println("{ You attack enemy with basic attack }");
        enemy.setHealth(enemy.getHealth() - (getAttSTR() * multiplier()));
        if(getMana()<10) setMana(getMana()+1);
        Battle.setTurnCounter(Battle.getTurnCounter()+1);
    }

    public void skill1(int turnCounter, Enemy enemy) {
        // Armored up
        if (this.getMana() >= 1){
            int manaCost = 1;
            System.out.println("{ You use Skill 1 : Armored up (Actived) }");
            int tambahHealth = (getHealth()*2);
            setHealth(getHealth()+tambahHealth);
            System.out.println("Your health has been upgraded");
            setMana(getMana()-manaCost);
            Battle.setTurnCounter(turnCounter += 1);
        }
        else{
            System.out.println("Your mana is not enough to use this skill");
        }
    }

    //Method overload skill1
    public void skill1(int manaCost, int turnCounter, Enemy enemy) {
        // Armored up
        if (this.getMana() >= manaCost){
            System.out.println("{ You use Skill 1 : Armored up (Actived) }");
            int tambahHealth = (getHealth()*2);
            setHealth(getHealth()+tambahHealth);
            System.out.println("Your health has been upgraded");
            setMana(getMana()-manaCost);
            Battle.setTurnCounter(turnCounter += 1);
        }
        else{
            System.out.println("Your mana is not enough to use this skill");
        }
    }

    public void skill2(int turnCounter, Enemy enemy) {
        // Damage up
        if(this.getMana() >= 3){
            int manaCost = 3;
            System.out.println("{ You Use Skill 2 : Damage up (Actived) }");
            enemy.setHealth(enemy.getHealth()-100);
            setMana(getMana()-manaCost);
            Battle.setTurnCounter(turnCounter += 1);
        }
        else{
            System.out.println("Your mana is not enough to use this skill");
        }
    }

    public void skill3(int turnCounter,Enemy enemy) {
        // Full armor
        if(this.getMana() >= 5){
            int manaCost = 5;
            System.out.println("{ You use Skill 3 : Full Armor }");
            int tambahHealth = (getHealth()*5);
            setHealth(getHealth()+tambahHealth);
            setMana(getMana()-manaCost);
            System.out.println("Your health has been upgraded");
            Battle.setTurnCounter(turnCounter += 1);
        }
        else{
            System.out.println("Your mana is not enough to use this skill");
        }
    }

    public void skill4(int turnCounter, Enemy enemy) {
        // EMPTY
        System.out.println("Your class doesn't have this skill");
    }


    @Override
    public String toString() {
        return 
        "Player Stats   : \n" + 
        "Name           : " + getName() + "\n" +
        "Health         : " + getHealth() + "\n" +
        "Mana           : " + getMana() + "\n" +
        "Attack Power   : " + getAttSTR() + "\n"+
        "Weapon         : " + weapon.toString();
    }


    @Override
    public String printOriginalString() {
        return "Player Stats   : \n" + "Name           : " + getName() + "\n" + "Health         : "
                + getClassOriginalHealth() + "\n" + "Mana           : " + getMana() + "\n" + "Attack Power   : "
                + getClassOriginalSTR() + "\n";

    }

    public void playerMenu(){
        System.out.println("------------------------------------------------------");
        System.out.println("|                     Menu                           |");
        System.out.println("| 1.Attack                        2.Armored up   (1) |");
        System.out.println("| 3.Damage up    (3)              4.Full armor   (5) |");
        System.out.println("| 5.EMPTY                         6.Open Backpack    |");
        System.out.println("|             7.Surrender (Warning)                  |");
        System.out.println("------------------------------------------------------");
        System.out.print(" Choose  : ");

    }

    @Override
    public String toSaveString() {
        return getName() + "-" + getClassOriginalHealth() + "-" + getMana() + "-" + getClassOriginalSTR() + "-"
                + getClassOriginalINT();
    }
}
