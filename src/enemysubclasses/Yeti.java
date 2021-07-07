package enemysubclasses;
import mainclasses.Enemy;
import mainclasses.Player;
import mainclasses.Battle;

public class Yeti extends Enemy{

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


    @Override
    public void attack(int turnCounter, Player player) {
        System.out.println("Yeti Attacks Player");
        player.setHealth(player.getHealth()-20);
        Battle.setTurnCounter(turnCounter += 1);
    }

    @Override
    //Yeti Punch : damage 30
    public void skill1(int turnCounter, Player player) {
        System.out.println("Yeti Skill 1 : Yeti Punch");
        player.setHealth(player.getHealth()-30);
        Battle.setTurnCounter(turnCounter += 1);   
    }

    @Override
    //Snow Cannon : damage 35
    public void skill2(int turnCounter, Player player) {
        System.out.println("Yeti Skill 2 : Yeti Punch");
        player.setHealth(player.getHealth() - 35);
        Battle.setTurnCounter(turnCounter += 1);
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
