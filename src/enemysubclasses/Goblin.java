package enemysubclasses;

import mainclasses.Enemy;
import mainclasses.Player;
import mainclasses.Battle;

public class Goblin extends Enemy {

    // Nama : Setiawan Junior
    // NIM : 03082180037
    String goblin_name;
    int goblin_attackPower;
    int goblin_resistINT;
    int goblin_resistSTR;

    public Goblin() {
        // Health: 400
        // Attack Power: 20
        // Resist INT: 10
        // Resist STR: 10
        super("Goblin", 400, 20, 10, 10);
    }

    // Method
    @Override
    // Basic Attack
    public void attack(int turnCounter) {
        System.out.println("{ Goblin Attacks Player }");
        Player.setHealth(Player.getHealth() - 14);
        Battle.setTurnCounter(Battle.getTurnCounter() + 1);
    }

    @Override
    // SMACK!
    public void skill1(int turnCounter) {
        System.out.println("{ Goblin uses skill 1 : SMACK! }");
        Player.setHealth(Player.getHealth() - 28);
        Battle.setTurnCounter(Battle.getTurnCounter() + 1);
    }

    @Override
    // HOOMAN SLAYER!
    public void skill2(int turnCounter) {
        System.out.println("{ Goblin uses skill 2 : HOOMAN SLAYER! }");
        Player.setHealth(Player.getHealth() - (getAttackPower() + 50));
        Battle.setTurnCounter(Battle.getTurnCounter() + 1);
    }

    // HOOMAN SLAYER ( Method Overloading)
    public void skill2(int turnCounter, Player player) {
        if (player.getGold() > 20) {
            System.out.println("{ Goblin uses skill 2 : HOOMAN SLAYER!}");
            Player.setHealth(Player.getHealth() - 100);
            Battle.setTurnCounter(Battle.getTurnCounter() + 1);
        } else {
            System.out.println("{ Goblin uses skill 2 : HOOMAN SLAYER!}");
            System.out.println("LUCKY YOU I MISS!");
            Battle.setTurnCounter(Battle.getTurnCounter() + 1);
        }
    }

    @Override
    public String toString() {
        return "Enemy  Stats   : \n" + "Nama           : " + getName() + "\n" + "Health         : " + getHealth() + "\n"
                + "Resist STR     : " + getResistSTR() + "\n" + "Resist INT     : " + getResistINT() + "\n"
                + "Attack Power   : " + getAttackPower() + "\n";
    }
}
