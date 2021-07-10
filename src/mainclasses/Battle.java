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
        setTurnCounter(0);
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
        System.out.println(player.toString());
        System.out.println("\t\tVS\n");
        System.out.println(enemy.toString());
        player.setGold(player.getGold()+enemy.getHealth());
        System.out.println("=======================");
        turnCounter++;
    }

    public void midBattle(){
        int pilihan = 123;
        int enemyPilihan = 12313;
        if(evenChecker() == false){
            System.out.println(player.toString());
            player.playerMenu();
            pilihan = in.nextInt();
            System.out.println("");

            switch(pilihan){
                case 1:
                    player.attack(turnCounter,enemy);
                    waitingTime();
                    System.out.println("");

                    break;

                case 2:
                    player.skill1(turnCounter, enemy);
                    waitingTime();
                    System.out.println("");
                    break;

                case 3:
                    player.skill2(turnCounter, enemy);
                    waitingTime();
                    System.out.println("");
                    break;
                case 4:
                    player.skill3(turnCounter, enemy);
                    waitingTime();
                    System.out.println("");
                    break;
                case 5:
                    player.skill4(turnCounter, enemy);
                    waitingTime();
                    System.out.println("");
                    break;
                case 6:
                    player.openBackpack();
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("GAME OVER");
                    waitingTime();
                    System.exit(0);
            }
        }

        else if(evenChecker() == true){
            System.out.println(enemy.toString());
            enemyPilihan = enemy.decisionPick();

            switch(enemyPilihan){
                case 1:
                    enemy.attack(turnCounter, player);
                    waitingTime();
                    System.out.println("");
                    break;
                case 2:
                    enemy.skill1(turnCounter, player);
                    waitingTime();
                    System.out.println("");
                    break;
                case 3:
                    enemy.skill2(turnCounter, player);
                    waitingTime();
                    System.out.println("");
                    break;
            }
        }
    }

    public boolean evenChecker(){
        if(turnCounter % 2 == 1) return false;
        else return true;
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
