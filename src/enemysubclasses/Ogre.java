package enemysubclasses;
import mainclasses.Enemy;
import mainclasses.Player;
import mainclasses.Battle;

public class Ogre extends Enemy{
    //constructors
    public Ogre() {
        /*
            Ogre
            Health : 600
            Attack Power : 10
            ResistINT : 10
            ResistSTR : 20
        */
        super("Ogre", 600, 10, 10, 20);
    }

    //methods
    @Override
    public void attack(int turnCounter) {
        System.out.println("{ Ogre Attacks Player }");
        Player.setHealth(Player.getHealth()-10);
        Battle.setTurnCounter(Battle.getTurnCounter() + 1);
    }

    @Override
    //Tornado Spin : damage 20
    public void skill1(int turnCounter) {
        System.out.println("{ Ogre Uses Skill 1 : Tornado Spin }");
        Player.setHealth(Player.getHealth()-20);
        Battle.setTurnCounter(Battle.getTurnCounter() + 1);
    }

    @Override
    //Full Power : damage 25
    public void skill2(int turnCounter) {
        System.out.println("{ Ogre Uses Skill 2 : Full Power }");
        Player.setHealth(Player.getHealth()-25);
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
