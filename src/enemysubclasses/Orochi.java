package enemysubclasses;
import mainclasses.Enemy;
import mainclasses.Player;
import mainclasses.Battle;

public class Orochi extends Enemy{
    // constructors
    public Orochi() {
        /*
            Orochi
            Health : 3000
            Attack Power : 40
            ResistINT : 50
            ResistSTR : 50
        */
        super("Yamata no Orochi", 3000, 40, 50, 50);
    }

    // methods
    @Override
    public void attack(int turnCounter) {
        System.out.println("{ Orochi Attacks Player }");
        Player.setHealth(Player.getHealth()-getAttackPower());    
        Battle.setTurnCounter(Battle.getTurnCounter() + 1);
    }

    @Override
    //Lifesteal : damages and steal
    public void skill1(int turnCounter) {
        System.out.println("{ Orochi Uses Skill 1 : Lifesteal }");  
        Player.setHealth(Player.getHealth()-80);
        setHealth(getHealth() + 40);
        Battle.setTurnCounter(Battle.getTurnCounter() + 1);
    }

    @Override
    //Snake Bite : damage 90
    public void skill2(int turnCounter) {
        System.out.println("{ Orochi skill 2 : Snake Bite }");
        Player.setHealth(Player.getHealth()-90);
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
