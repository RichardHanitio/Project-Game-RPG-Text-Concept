package playersubclasses;
import java.util.Random;
import mainclasses.Enemy;
import mainclasses.Player;
import mainclasses.Battle;
public class Ranger extends Player{
    public int attSTR = 45;

    public int getAttSTR() {
        return this.attSTR;
    }

    public void setAttSTR(int attSTR) {
        this.attSTR = attSTR;
    }

    public Ranger(String name){
        //Nama berasal dari player
        //health awal   : 80
        //mana awal     : 0
        super(name,80,0);
        super.setClassID(2);
    }

    public void attack(int turnCounter,Enemy enemy) {
        System.out.println("You attacking enemy with basic attack ");
        enemy.setHealth(enemy.getHealth() - (attSTR * multiplier()));
        if (this.getMana() < 10) setMana(super.getMana() + 1);
        Battle.setTurnCounter(turnCounter += 1);
        
    }

    //ShockDart
    public void skill1(int turnCounter, Enemy enemy) {
        if(this.getMana() >= 3){
            int manaCost = 3;
            System.out.println("Skill 1 : ShockDart (Actived)");
            enemy.setHealth(enemy.getHealth()-attSTR);
            setMana(getMana()-manaCost);

            int counter = turnCounter + 2;
            while(turnCounter != counter){
                Battle.setTurnCounter(turnCounter += 1);
            }
    
        }
        else{
            System.out.println("Your mana is not enough to use this skill");
        }
    }

    //ChargeShot
    public void skill2(int turnCounter, Enemy enemy) {
        if(this.getMana() >= 5){
            int manaCost = 5;
            System.out.println("Skill 2 : ChargeShot (Actived)");
            enemy.setHealth(enemy.getHealth() - (attSTR * 5));
            setMana(getMana()-manaCost);
            Battle.setTurnCounter(turnCounter += 1);
            
        }
        else{
            System.out.println("Your mana is not enough to use this skill");
        }
    }
    
    //MultiShoot
    public void skill3(int turnCounter,Enemy enemy) {
        if(this.getMana() >= 8){
            int manaCost = 8;
            System.out.println("Skill 3 : Multishot (Actived)");
            enemy.setHealth(enemy.getHealth() - (attSTR * 2 * multiplier()));
            setMana(getMana() - manaCost);
            Battle.setTurnCounter(turnCounter += 1);

        }
        else{
            System.out.println("Your mana is not enough to use this skill");
        }
    }

    //EMPTY
    public void skill4(int turnCounter, Enemy enemy) {
        System.out.println("Your class doesn't this skill");
    }


    @Override
    //Multiplier untuk Ranger
    public int multiplier() {
        Random rand = new Random();
        //multi memiliki nilai minimum 3 dan maksimum 6
        int multi = rand.nextInt(3) + 4 ;
        return multi;
    
    }
    @Override
    public String toString() {
        return 
        "Player Stats   : \n" + 
        "Nama           : " + getName() + "\n" +
        "Health         : " + getHealth() + "\n" +
        "Mana           : " + getMana() + "\n" +
        "Attack Power   : " + getAttSTR() + "\n";
    }

    public void playerMenu(){
        System.out.println("-------------------------------------------------------");
        System.out.println("|                      Menu                           |");
        System.out.println("| 1.Attack                        2.ShockDart     (3) |");
        System.out.println("| 3.ChargeShot    (5)             4.MultiShot     (8) |");
        System.out.println("| 5.EMPTY                         6.Open Backpack     |");
        System.out.println("|              7.Surrender (Warning)                  |");
        System.out.println("-------------------------------------------------------");
        System.out.print(" Choose  : ");
    }
}
