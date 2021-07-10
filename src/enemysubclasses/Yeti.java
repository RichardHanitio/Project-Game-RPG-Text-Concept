package enemysubclasses;
import mainclasses.Enemy;
import mainclasses.Player;
import mainclasses.Battle;

public class Yeti extends Enemy{
    // constructors
    public Yeti() {
        /*
            Yeti
            Health : 600
            Attack Power : 20
            ResistINT : 30
            ResistSTR : 20
        */
        super("Yeti", 600, 20, 30, 20);
    }

    // methods
    @Override
    public void attack(int turnCounter) {
        System.out.println("Yeti Attacks Player");
        Player.setHealth(Player.getHealth()-20);
        Battle.setTurnCounter(Battle.getTurnCounter() + 1);
    }

    @Override
    //Yeti Punch : damage 30
    public void skill1(int turnCounter) {
        System.out.println("Yeti Skill 1 : Yeti Punch");
        Player.setHealth(Player.getHealth()-30);
        Battle.setTurnCounter(Battle.getTurnCounter() + 1);   
    }

    @Override
    //Snow Cannon : damage 35
    public void skill2(int turnCounter) {
        System.out.println("Yeti Skill 2 : Yeti Punch");
        Player.setHealth(Player.getHealth() - 35);
        Battle.setTurnCounter(Battle.getTurnCounter() + 1);
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
