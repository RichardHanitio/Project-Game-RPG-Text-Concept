package enemysubclasses;
import mainclasses.Enemy;
import mainclasses.Player;
import mainclasses.Battle;

public class Yeti extends Enemy{
    // constructors
    public Yeti() {
        /*
            Yeti
            Health : 1200
            Attack Power : 20
            ResistINT : 30
            ResistSTR : 20
        */
        super("Yeti", 1200, 20, 30, 20);
    }

    // methods
    @Override
    public void attack(int turnCounter) {
        System.out.println("{ Yeti Attacks Player }");
        Player.setHealth(Player.getHealth()-getAttackPower());
        Battle.setTurnCounter(Battle.getTurnCounter() + 1);
    }

    @Override
    //Yeti Punch : damage 40
    public void skill1(int turnCounter) {
        System.out.println("{ Yeti Uses Skill 1 : Yeti Punch }");
        Player.setHealth(Player.getHealth()-40);
        Battle.setTurnCounter(Battle.getTurnCounter() + 1);   
    }

    @Override
    //Snow Cannon : damage 50
    public void skill2(int turnCounter) {
        System.out.println("{ Yeti Uses Skill 2 : Yeti Punch }");
        Player.setHealth(Player.getHealth() - 45);
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
