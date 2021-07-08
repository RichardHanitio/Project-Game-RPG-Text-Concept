package playersubclasses;
import java.util.Random;
import mainclasses.Player;
import mainclasses.Enemy;
import mainclasses.Battle;

public class Wizard extends Player{
    
    public Wizard(String name){
        //Nama berasal dari player
        //health awal   : 100
        //mana awal     : 10
        super(name,100,10,0,5);
        super.setClassID(3);
    }

    public void attack(int turnCounter,Enemy enemy) {
        System.out.println("You attacking enemy with basic attack ");
        enemy.setHealth(enemy.getHealth() - (attINT * multiplier()));
        if(getMana() < 10) setMana(getMana() + 1);
        Battle.setTurnCounter(turnCounter += 1);

    }

    //Meteor
    public void skill1(int turnCounter, Enemy enemy) {
        if(this.getMana() >= 2){
            int manaCost = 2;
            System.out.println("Skill 1 : Meteor (Actived)");
            enemy.setHealth(enemy.getHealth() - ((attINT + 30 ) * multiplier()));
            setMana(getMana()-manaCost);
            Battle.setTurnCounter(turnCounter += 1);


        }
        else{
            System.out.println("Your mana is not enough to use this skill");
        }
    }

    //LifeDrain
    public void skill2(int turnCounter , Enemy enemy) {
        if(this.getMana() >= 4){
            int manaCost = 4;
            System.out.println("Skill 2 : LifeDrain (Actived)");
            int enemyHealth = enemy.getHealth();
            Double persenan = 0.15;
            int persenanEnemyHealth = (int)(enemyHealth * persenan); 

            enemy.setHealth(enemy.getHealth() - persenanEnemyHealth);
            setHealth(getHealth() + persenanEnemyHealth);
            setMana(getMana()-manaCost);

            Battle.setTurnCounter(turnCounter += 1);

        }
        else{
            System.out.println("Your mana is not enough to use this skill");
        }
    }

    //LightningSpell
    public void skill3(int turnCounter , Enemy enemy) {
        if(this.getMana() >= 3){
            int manaCost = 3;
            System.out.println("Skill 3 : LightingSpell (Actived)");
            enemy.setHealth(enemy.getHealth() - ((attINT * 50) * multiplier() * getMana()));
            setMana(getMana()-manaCost);
            Battle.setTurnCounter(turnCounter += 1);

        }
        else{
            System.out.println("Your mana is not enough to use this skill");
        }
    }

    //Mirror
    public void skill4(int turnCounter, Enemy enemy) {
        if(this.getMana() >= 7){
            int manaCost = 7;
            System.out.println("Skill 4 : Mirror (Actived)");
            enemy.setHealth(enemy.getHealth() - (enemy.getAttackPower() * multiplier()));
            setMana(getMana()-manaCost);
            Battle.setTurnCounter(turnCounter += 1);

        }
        else{
            System.out.println("Your mana is not enough to use this skill");
        }
    }


    @Override
    //Multiplier untuk Ranger
    public int multiplier() {
        Random rand = new Random();
        //multi memiliki nilai minimum 1 dan maksimum 4
        int multi = rand.nextInt(3) + 1;
        return multi;
    }


    @Override
    public String toString() {
        return 
        "Player Stats   : \n" + 
        "Nama           : " + getName() + "\n" +
        "Health         : " + getHealth() + "\n" +
        "Mana           : " + getMana() + "\n" +
        "Attack Power   : " + getAttINT() + "\n";
    }

    public void playerMenu(){
        System.out.println("---------------------------------------------------------");
        System.out.println("|                       Menu                             |");
        System.out.println("| 1.Meteor                           2.LifeDrain     (3) |");
        System.out.println("| 3.LightningSpell   (5)             4.MultiShot     (8) |");
        System.out.println("| 5.EMPTY                            6.Open Backpack     |");
        System.out.println("|              7.Surrender (Warning)                     |");
        System.out.println("----------------------------------------------------------");
        System.out.print(" Choose  : ");

    }

}
