package playersubclasses;
import java.util.Random;
import mainclasses.Enemy;
import mainclasses.Player;
import mainclasses.Battle;
public class Fighter extends Player {
    public int attSTR = 25;

    public int getAttSTR() {
        return this.attSTR;
    }

    public void setAttSTR(int attSTR) {
        this.attSTR = attSTR;
    }

    public Fighter(String name){
        //Nama berasal dari player
        //health awal   : 200
        //mana awal     : 0
        super(name,200,0);
        super.setClassID(1);
    }

    public void attack(int turnCounter, Enemy enemy) {
        System.out.println("You attacking enemy with basic attack ");
        enemy.setHealth(enemy.getHealth() - (attSTR * multiplier()));
        if(this.getMana()<10) setMana(super.getMana()+1);
        Battle.setTurnCounter(turnCounter += 1);
        
    }


    //Heal
    //sementara memakai turnCount karena mekanisme battle belum terbuat
    public void skill1(int turnCounter, Enemy enemy) {

        if (this.getMana() >= 2){
            int manaCost = 2;
            System.out.println("Skill 1 : Heal (Actived)");
            Double persenan = 0.15;
            int tambahHealth = (int)(this.getHealth()*persenan);
            setHealth(getHealth()+tambahHealth);
            System.out.println("Your health has been healed");
            setMana(getMana()-manaCost);
            Battle.setTurnCounter(turnCounter += 1);

        }
        else{
            System.out.println("Your mana is not enough to use this skill");
        }
    }

    
    //WarCry
    //sementara memakai turnCount karena mekanisme battle belum terbuat
    public void skill2(int turnCounter, Enemy enemy) {

        if(this.getMana() >= 3){
            int manaCost = 3;
            System.out.println("Skill 2 : WarCry (Actived)");
            int counter = turnCounter+6;
            Double persenan = 0.20;
            int tambahAttSTR = (int) (attSTR * persenan);
            int finaltambahSTR = attSTR + tambahAttSTR;
            setMana(getMana()-manaCost);
            while(turnCounter != counter){
                attSTR = finaltambahSTR;
            }
            Battle.setTurnCounter(turnCounter += 1);
            
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
            enemy.setHealth(enemy.getHealth()-(attSTR * 6));
            setMana(getMana()-manaCost);
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

    //Multiplier untuk Fighter
    public int multiplier() {
        Random rand = new Random();
        //multi memiliki nilai minimum 1 dan maksimum 6
        int multi = rand.nextInt(6) + 1;
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
        System.out.println("------------------------------------------------------");
        System.out.println("|                     Menu                           |");
        System.out.println("| 1.Attack                        2.Heal         (2) |");
        System.out.println("| 3.WarCry    (3)                 4.OnePUNCH     (7) |");
        System.out.println("| 5.EMPTY                         6.Open Backpack    |");
        System.out.println("|             7.Surrender (Warning)                  |");
        System.out.println("------------------------------------------------------");
        System.out.print(" Choose  : ");

    }
    
}
