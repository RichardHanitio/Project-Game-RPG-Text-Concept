package playersubclasses;
import java.util.Random;
import mainclasses.Player;
import mainclasses.Weapon;
import mainclasses.Enemy;
import mainclasses.Battle;

public class Wizard extends Player{
    // properties
    private Weapon weapon;

    // constructors
    public Wizard(String name){
        //Nama berasal dari player
        //health awal   : 100
        //mana awal     : 10
        super(name,100,10,0,5);
        super.setClassID(3);
        this.weapon = new Weapon(getClassID());
        super.setWeapon(weapon);
    }

    // methods
    public int multiplier() {
        // Multiplier untuk Wizard
        Random rand = new Random();
        // multi memiliki nilai minimum 1 dan maksimum 4
        int multi = rand.nextInt(3) + 1;
        return multi;
    }

    public void attack(int turnCounter,Enemy enemy) {
        System.out.println("{ You attack enemy with basic attack } ");
        enemy.setHealth(enemy.getHealth() - (getAttINT() * multiplier()));
        if(getMana() < 10) setMana(getMana() + 1);
        Battle.setTurnCounter(turnCounter += 1);

    }

    public void skill1(int turnCounter, Enemy enemy) {
        // Meteor
        if(this.getMana() >= 2){
            int manaCost = 2;
            System.out.println("{ You Use Skill 1 : Meteor (Actived) }");
            enemy.setHealth(enemy.getHealth() - ((getAttINT() + 30 ) * multiplier()));
            setMana(getMana()-manaCost);
            Battle.setTurnCounter(turnCounter += 1);


        }
        else{
            System.out.println("Your mana is not enough to use this skill");
        }
    }


    public void skill2(int turnCounter , Enemy enemy) {
        // LifeDrain
        if(this.getMana() >= 4){
            int manaCost = 4;
            System.out.println("{ You Use Skill 2 : LifeDrain (Actived) }");
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


    public void skill3(int turnCounter , Enemy enemy) {
        // LightningSpell
        if(this.getMana() >= 3){
            int manaCost = 3;
            System.out.println("{ You Use Skill 3 : LightingSpell (Actived) }");
            enemy.setHealth(enemy.getHealth() - ((getAttINT() * 50) * multiplier() * getMana()));
            setMana(getMana()-manaCost);
            Battle.setTurnCounter(turnCounter += 1);

        }
        else{
            System.out.println("Your mana is not enough to use this skill");
        }
    }


    public void skill4(int turnCounter, Enemy enemy) {
        // Mirror
        if(this.getMana() >= 7){
            int manaCost = 7;
            System.out.println("{ You Use Skill 4 : Mirror (Actived) }");
            enemy.setHealth(enemy.getHealth() - (enemy.getAttackPower() * multiplier()));
            setMana(getMana()-manaCost);
            Battle.setTurnCounter(turnCounter += 1);

        }
        else{
            System.out.println("Your mana is not enough to use this skill");
        }
    }

    @Override
    public String toString() {
        return 
        "Player Stats   : \n" + 
        "Name           : " + getName() + "\n" +
        "Health         : " + getHealth() + "\n" +
        "Mana           : " + getMana() + "\n" +
        "Attack Power   : " + getAttINT() + "\n"+
        "Weapon         : " + weapon.toString();
    }

    public void playerMenu(){
        System.out.println("--------------------------------------------------------------");
        System.out.println("|                       Menu                                 |");
        System.out.println("| 1.Attack                          2.Meteor             (3) |");
        System.out.println("| 3.LifeDrain   (5)                 4.LightningSpell     (8) |");
        System.out.println("| 5.Mirror                          6.Open Backpack          |");
        System.out.println("|              7.Surrender (Warning)                         |");
        System.out.println("--------------------------------------------------------------");
        System.out.print(" Choose  : ");

    }

}
