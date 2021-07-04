package playersubclasses;
import java.util.Random;
import mainclasses.Player;
import mainclasses.Enemy;


public class Wizard extends Player{
    public int attINT = 5;

    public Wizard(String name){
        //Nama berasal dari player
        //health awal   : 100
        //mana awal     : 10
        super(name,100,10);
        
    }

    public void attack(int turnCounter,Enemy enemy) {
        if (this.getMana() >= 10){
            System.out.println("You attacking enemy with basic attack ");
            int enemyHealth = enemy.getHealth();
            int attackingEnemy = enemyHealth - (attINT * multiplier());
            enemy.setHealth(attackingEnemy);
            turnCounter++;
        }
        else{
            System.out.println("You attacking enemy with basic attack ");
            int enemyHealth = enemy.getHealth();
            int attackingEnemy = enemyHealth - (attINT * multiplier());
            enemy.setHealth(attackingEnemy);
            int manaAwal = this.getMana();
            int manaBaru = manaAwal++;
            setMana(manaBaru);
            turnCounter++;
        }
    }

    //Meteor
    public void skill1(int turnCounter, Enemy enemy) {
        if(this.getMana() >= 2){
            int manaCost = 2;
            System.out.println("Skill 1 : Meteor (Actived)");
            int enemyHealth = enemy.getHealth();
            int attackingEnemy = enemyHealth - ((attINT + 30) * multiplier());
            enemy.setHealth(attackingEnemy);
            int manaAwal = this.getMana();
            int manaBaru = manaAwal - manaCost;
            setMana(manaBaru);
            turnCounter++;

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
            int playerHealth = this.getHealth();
            int playerHealthBaru = playerHealth + persenanEnemyHealth;
            this.setHealth(playerHealthBaru);
            int manaAwal = this.getMana();
            int manaBaru = manaAwal - manaCost;
            setMana(manaBaru);
            turnCounter++;

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
            int enemyHealth = enemy.getHealth();
            int attackingEnemy = enemyHealth - ((attINT + 50) * multiplier() * this.getMana());
            enemy.setHealth(attackingEnemy);
            int manaAwal = this.getMana();
            int manaBaru = manaAwal - manaCost;
            setMana(manaBaru);
            turnCounter++;
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
            int enemyHealth = enemy.getHealth();
            int attackingEnemy = enemyHealth - (enemy.getAttackPower() * multiplier());
            enemy.setHealth(attackingEnemy);
            int manaAwal = this.getMana();
            int manaBaru = manaAwal - manaCost;
            setMana(manaBaru);
            turnCounter++;
        }
        else{
            System.out.println("Your mana is not enough to use this skill");
        }
    }


    @Override
    //Multiplier untuk Ranger
    public int multiplier() {
        Random rand = new Random();
        //multi memiliki nilai minimum 1 dan maksimum 6
        int multi = rand.nextInt(6) + 1;
        return multi;
    }
}
