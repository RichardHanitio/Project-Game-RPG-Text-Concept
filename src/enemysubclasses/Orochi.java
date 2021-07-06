package enemysubclasses;
import mainclasses.Enemy;
import mainclasses.Player;

public class Orochi extends Enemy{
    public Orochi() {
        /*
            Orochi
            Health : 500
            Attack Power : 40
            ResistINT : 1
            ResistSTR : 1
        */
        super("Yamata no Orochi", 500, 40, 1, 1);
    }

    @Override
    public void attack(int turnCounter, Player player) {
        System.out.println("Orochi Attacks Player");
        player.setHealth(player.getHealth()-40);    
        turnCounter++;
    }

    @Override
    //Snake Bite : 
    public void skill1(int turnCounter, Player player) {
        System.out.println("Orochi skill 1 : Snake Bite");       
        turnCounter++; 
    }

    @Override
    //Mad Snake : 
    public void skill2(int turnCounter, Player player) {
        System.out.println("Orochi skill 2 : Mad Snake");
        turnCounter++;
    }
}
