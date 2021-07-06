package enemysubclasses;
import mainclasses.Enemy;
import mainclasses.Player;

public class Ogre extends Enemy{
    public Ogre() {
        /*
            Ogre
            Health : 100
            Attack Power : 10
            ResistINT : 1
            ResistSTR : 1
        */
        super("Ogre", 100, 10, 1, 1);
    }

    @Override
    public void attack(int turnCounter, Player player) {
        System.out.println("Ogre Attacks Player");
        player.setHealth(player.getHealth()-10);
        turnCounter++;
    }

    @Override
    //Tornado Spin : damage 20
    public void skill1(int turnCounter, Player player) {
        System.out.println("Ogre Skill 1 : Tornado Spin");
        player.setHealth(player.getHealth()-20);
        turnCounter++;
    }

    @Override
    //Full Power : damage 25
    public void skill2(int turnCounter, Player player) {
        System.out.println("Ogre Skill 2 : Full Power");
        player.setHealth(player.getHealth()-25);
        turnCounter++;
    }
}
