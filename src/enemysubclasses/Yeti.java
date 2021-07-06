package enemysubclasses;
import mainclasses.Enemy;
import mainclasses.Player;

public class Yeti extends Enemy{

    public Yeti() {
        /*
            Yeti
            Health : 200
            Attack Power : 20
            ResistINT : 1
            ResistSTR : 1
        */
        super("Yeti", 200, 20, 1, 1);
    }


    @Override
    public void attack(int turnCounter, Player player) {
        System.out.println("Yeti Attacks Player");
        player.setHealth(player.getHealth()-20);
        turnCounter++;
    }

    @Override
    //Yeti Punch : damage 30
    public void skill1(int turnCounter, Player player) {
        System.out.println("Yeti Skill 1 : Yeti Punch");
        player.setHealth(player.getHealth()-30);
        turnCounter++;     
    }

    @Override
    //Snow Cannon : damage 35
    public void skill2(int turnCounter, Player player) {
        System.out.println("Yeti Skill 2 : Yeti Punch");
        player.setHealth(player.getHealth() - 35);
        turnCounter++;
    }

}
