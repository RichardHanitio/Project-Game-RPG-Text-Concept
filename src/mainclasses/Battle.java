package mainclasses;
import java.util.Scanner;

public class Battle {
    private Player player;
    private Enemy enemy;
    private static int turnCounter = 0;
    Scanner in = new Scanner(System.in);


    public static int getTurnCounter() {
        return turnCounter;
    }

    public static void setTurnCounter(int turnCounter) {
        Battle.turnCounter = turnCounter;
    }
    

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Enemy getEnemy() {
        return this.enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    


    public Battle(Player player,Enemy enemy){
        this.player = player;
        this.enemy  = enemy;
        beginBattle();
        while (player.getHealth() > 0 && enemy.getHealth() > 0){
            midBattle();
        }
        if(player.getHealth() < 0 ){
            System.out.println("Your character has been slain by " + enemy.getName());
            System.out.println("GAME OVER");
            System.exit(0);
        }
        else if (enemy.getHealth() < 0 ){
            System.out.println(enemy.getName() + " has been slain . . .");
            player.setCurrentStage(player.getCurrentStage() + 1);
        }
    }

    public void beginBattle(){
        player.toString();
        enemy.toString();
        turnCounter++;
    }

    public void midBattle(){
        int pilihan = 123;
        int enemyPilihan = 12313;
        if(evenChecker() == false){
            player.toString();
            pilihan = in.nextInt();

            switch(pilihan){
                case 1:
                    player.attack(turnCounter,enemy);
                    break;

                case 2:
                    player.skill1(turnCounter, enemy);
                    break;

                case 3:
                    player.skill2(turnCounter, enemy);
                    break;
                case 4:
                    player.skill3(turnCounter, enemy);
                    break;
                case 5:
                    player.skill4(turnCounter, enemy);
                    break;
                case 6:
                    player.openBackpack();
                    break;
                case 7:
                    System.out.println("GAME OVER");
                    System.exit(0);
            }
        }

        else if(evenChecker() == true){
            enemy.toString();
            enemyPilihan = enemy.decisionPick();

            switch(enemyPilihan){
                case 1:
                    enemy.attack(turnCounter, player);
                    break;
                case 2:
                    enemy.skill1(turnCounter, player);
                    break;
                case 3:
                    enemy.skill2(turnCounter, player);
                    break;
            }
        }
    }

    public boolean evenChecker(){
        if(turnCounter % 2 == 1) return false;
        else return true;
    }




}
