package mainclasses;
import java.util.Scanner;

public class Battle {
    //properties
    private Player player;
    private Enemy enemy;
    private static int turnCounter = 0;
    Scanner in = new Scanner(System.in);

    //getter setter
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

    //constructors
    public Battle(Player player,Enemy enemy){
        this.player = player;
        this.enemy  = enemy;
        setTurnCounter(0);
        beginBattle();

        while (Player.getHealth() > 0 && enemy.getHealth() > 0) midBattle();

        if(Player.getHealth() < 0 ){
            System.out.println("Your character has been slain by " + enemy.getName());
            System.out.println("GAME OVER");
            System.exit(0);
        }
        else if (enemy.getHealth() < 0 ){
            System.out.println(enemy.getName() + " has been slain . . .");
            player.setCurrentStage(player.getCurrentStage() + 1); 
        }
    }

    //methods
    public void beginBattle(){
        System.out.println("=================================");
        System.out.println("\t\tBATTLE " + player.getCurrentStage());
        System.out.println(player.toString());
        System.out.println("\t\tVS\n");
        System.out.println(enemy.toString());
        player.setGold(player.getGold()+enemy.getHealth());
        System.out.println("=================================");
        waitingTime();
        setTurnCounter(getTurnCounter()+1);
    }

    public void midBattle(){
        int pilihan, enemyPilihan;
        //Player's turn
        if(evenChecker() == false){
            System.out.println(player.toString());
            player.playerMenu();
            pilihan = in.nextInt();
            System.out.println("");

            switch(pilihan){
                case 1:
                    player.attack(turnCounter,enemy);
                    waitingTime();
                    System.out.println();
                    break;

                case 2:
                    player.skill1(turnCounter, enemy);
                    waitingTime();
                    System.out.println();
                    break;

                case 3:
                    player.skill2(turnCounter, enemy);
                    waitingTime();
                    System.out.println();
                    break;
                case 4:
                    player.skill3(turnCounter, enemy);
                    waitingTime();
                    System.out.println();
                    break;
                case 5:
                    player.skill4(turnCounter, enemy);
                    waitingTime();
                    System.out.println();
                    break;
                case 6:
                    player.openBackpack();
                    System.out.println();
                    break;
                case 7:
                    System.out.println("YOU LOSE, GAME OVER");
                    System.exit(0);
            }
        }

        else if(evenChecker() == true){
            System.out.println(enemy.toString());
            enemyPilihan = enemy.decisionPick();

            switch(enemyPilihan){
                case 1:
                    enemy.attack(turnCounter);
                    waitingTime();
                    System.out.println();
                    break;
                case 2:
                    enemy.skill1(turnCounter);
                    waitingTime();
                    System.out.println();
                    break;
                case 3:
                    enemy.skill2(turnCounter);
                    waitingTime();
                    System.out.println();
                    break;
            }
        }
    }

    public boolean evenChecker(){
        return turnCounter%2==0;
    }
    public void clearScreen() {
        //to clear screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public void waitingTime(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }



}
