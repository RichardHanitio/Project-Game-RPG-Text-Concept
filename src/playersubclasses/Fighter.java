package playersubclasses;
import java.util.Random;
import mainclasses.Enemy;
import mainclasses.Player;

public class Fighter extends Player {
    public int attSTR = 25;

    public Fighter(String name){
        //Nama berasal dari player
        //health awal   : 200
        //mana awal     : 0
        super(name,200,0);
        
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


    //Heal
    //sementara memakai turnCount karena mekanisme battle belum terbuat
    public void skill1(int turnCounter) {

        if (this.getMana() >= 2){
            int manaCost = 2;
            System.out.println("Skill 1 : Heal (Actived)");
            Double persenan = 0.15;
            int tambahHealth = (int)(this.getHealth()*persenan);
            int finalHealth = this.getHealth()+tambahHealth;
            this.setHealth(finalHealth);
            System.out.println("Your health has been healed");
            int manaAwal = this.getMana();
            int manaBaru = manaAwal - manaCost;
            setMana(manaBaru);
            turnCounter++;
        }
        else{
            System.out.println("Your mana is not enough to use this skill");
        }
    }

    
    //WarCry
    //sementara memakai turnCount karena mekanisme battle belum terbuat
    public void skill2(int turnCounter) {

        if(this.getMana() >= 3){
            int manaCost = 3;
            System.out.println("Skill 2 : WarCry (Actived)");
            int counter = turnCounter+2;
            Double persenan = 0.20;
            int tambahAttSTR = (int) (attSTR * persenan);
            int finaltambahSTR = attSTR + tambahAttSTR;
            int manaAwal = this.getMana();
            int manaBaru = manaAwal - manaCost;
            setMana(manaBaru);
            while(turnCounter != counter){
                attSTR = finaltambahSTR;
            }
            turnCounter++;
        }
        else{
            System.out.println("Your mana is not enough to use this skill");
        }
    }

    //OnePUNCH
    public void skill3(int turnCounter,Enemy enemy) {
        if(this.getMana() >= 7){
            int manaCost = 7;
            System.out.println("Skill 3 : OnePUNCH");
            int enemyHealth = enemy.getHealth();
            int finalenemyHealth = enemyHealth - (attSTR * 6);
            enemy.setHealth(finalenemyHealth);
            int manaAwal = this.getMana();
            int manaBaru = manaAwal - manaCost;
            setMana(manaBaru);
            turnCounter++;
        }
    }

    //EMPTY
    public void skill4() {
        System.out.println("Your class doesn't this skill");
    }

    //Multiplier untuk Fighter
    public int multiplier() {
        Random rand = new Random();
        //multi memiliki nilai minimum 1 dan maksimum 6
        int multi = rand.nextInt(6) + 1;
        return multi;
    }
    
}
