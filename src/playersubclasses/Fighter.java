package playersubclasses;
import java.util.Random;
import mainclasses.Enemy;
import mainclasses.Player;
import mainclasses.Weapon;
import mainclasses.Battle;
public class Fighter extends Player {
    //properties
    private Weapon weapon;

    //constructors
    public Fighter(String name){
        //Nama berasal dari player
        //health awal   : 200
        //mana awal     : 0
        super(name,200,0,25,0);
        super.setClassID(1);
        this.weapon = new Weapon(getClassID());
        super.setWeapon(weapon);
    }
    
    //methods
    public int multiplier() {
        // Multiplier untuk Fighter
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
        // Heal
        if (this.getMana() >= 2){
            int manaCost = 2;
            System.out.println("{ You use Skill 1 : Heal (Actived) }");
            Double persenan = 0.15;
            int tambahHealth = (int)(getHealth()*persenan);
            setHealth(getHealth()+tambahHealth);
            System.out.println("Your health has been healed");
            setMana(getMana()-manaCost);
            Battle.setTurnCounter(turnCounter += 1);
        }
        else{
            System.out.println("Your mana is not enough to use this skill");
        }
    }

    public void skill2(int turnCounter, Enemy enemy) {
        // WarCry
        if(this.getMana() >= 3){
            int manaCost = 3;
            System.out.println("{ You Use Skill 2 : WarCry (Actived) }");
            enemy.setHealth(enemy.getHealth()-getAttSTR());
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

    public void skill3(int turnCounter,Enemy enemy) {
        // OnePUNCH
        if(this.getMana() >= 7){
            int manaCost = 7;
            System.out.println("{ You use Skill 3 : OnePUNCH }");
            enemy.setHealth(enemy.getHealth()-(getAttSTR() * 6));
            setMana(getMana()-manaCost);
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
