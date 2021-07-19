package enemysubclasses;
import mainclasses.Enemy;
import mainclasses.Player;
import mainclasses.Battle;

//Nama  : Ricky
//NIM   : 03082200012
public class Slime extends Enemy{
    public Slime() {
        /*
            Slime
            Health : 10
            Attack Power : 10
            ResistINT : 10
            ResistSTR : 10
        */
        super("Slime", 10, 10, 10, 10);
    }

    //Method
    @Override
    //Basic Attack
    public void attack(int turnCounter) {
        System.out.println("{ Slime Attacks Player }");
        Player.setHealth(Player.getHealth()-10);
        Battle.setTurnCounter(Battle.getTurnCounter() + 1);
    }

    @Override
    //Tackle
    public void skill1(int turnCounter) {
        System.out.println("{ Slime uses skill 1 : Tackle }");
        Player.setHealth(Player.getHealth() - 10);
        Battle.setTurnCounter(Battle.getTurnCounter() + 1);
    }

    @Override
    //Jump-Attack
    public void skill2(int turnCounter) {
        System.out.println("{ Slime uses skill 2 : Jump-Attack }");
        Player.setHealth(Player.getHealth() - (getAttackPower() + 10));
        Battle.setTurnCounter(Battle.getTurnCounter() + 1);
    }

    //Jump-Attack ( Method Overloading)
    public void skill2(int turnCounter , Player player){
        if(player.getMana() > 5){
            System.out.println("{ Slime uses skill 2 : Jump-Attack + ASHIAPPPP}");
            Player.setHealth(Player.getHealth() - 30);
            Battle.setTurnCounter(Battle.getTurnCounter() + 1);
        }
        else{
            System.out.println("{ Slime uses skill 2 : Jump-Attack + ASHIAPPPP}");
            System.out.println("NO DAMAGE");
            Battle.setTurnCounter(Battle.getTurnCounter() + 1);
        }
    }

    @Override
    public String toString() {
        return 
        "Enemy  Stats   : \n" + 
        "Nama           : " + getName() + "\n" +
        "Health         : " + getHealth() + "\n" +
        "Resist STR     : " + getResistSTR() + "\n" +
        "Resist INT     : " + getResistINT() + "\n" + 
        "Attack Power   : " + getAttackPower() + "\n";
    }
}
