package playersubclasses;
import java.util.Random;
import mainclasses.Enemy;
import mainclasses.Player;

public class Ranger extends Player{
    public int attSTR = 45;

    public Ranger(String name){
        //Nama berasal dari player
        //health awal   : 60
        //mana awal     : 0
        super(name,60,0);
        
    }


    public void attack(int turnCounter,Enemy enemy) {
        if (this.getMana() >= 10){
            System.out.println("You attacking enemy with basic attack ");
            int enemyHealth = enemy.getHealth();
            int attackingEnemy = enemyHealth - (attSTR * multiplier());
            enemy.setHealth(attackingEnemy);
            turnCounter++;
        }
        else{
            System.out.println("You attacking enemy with basic attack ");
            int enemyHealth = enemy.getHealth();
            int attackingEnemy = enemyHealth - (attSTR * multiplier());
            enemy.setHealth(attackingEnemy);
            int manaAwal = this.getMana();
            int manaBaru = manaAwal++;
            setMana(manaBaru);
            turnCounter++;
        }
    }

    //ShockDart
    public void skill1(int turnCounter, Enemy enemy) {
        if(this.getMana() >= 3){
            System.out.println("Skill 1 : ShockDart (Actived)");
            int enemyHealth = enemy.getHealth();
            int attack = enemyHealth - attSTR;
            enemy.setHealth(attack);
            int counter = turnCounter + 1;
            while(turnCounter != counter){
                turnCounter++;
            }
        }
        else{
            System.out.println("Your mana is not enough to use this skill");
        }
    }

    //ChargeShot
    public void skill2(int turnCounter, Enemy enemy) {
        if(this.getMana() >= 5){
            System.out.println("Skill 2 : ChargeShot (Actived)");
            int enemyHealth = enemy.getHealth();
            int attack = enemyHealth - (attSTR * 5);
            enemy.setHealth(attack);
            turnCounter++;
        }
        else{
            System.out.println("Your mana is not enough to use this skill");
        }
    }
    
    //MultiShoot
    public void skill3(int turnCounter,Enemy enemy) {
        if(this.getMana() >= 8){
            int enemyHealth = enemy.getHealth();
            int attack = enemyHealth - (attSTR * 2 * multiplier());
            enemy.setHealth(attack);
            turnCounter++;
        }
        else{
            System.out.println("Your mana is not enough to use this skill");
        }
    }

    //EMPTY
    public void skill4() {
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
}
