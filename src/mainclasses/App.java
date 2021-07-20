package mainclasses;
import mainclasses.*;
import playersubclasses.*;
import enemysubclasses.*;

public class App {
    public static void main(String[] args) throws Exception {
         // Story story = new Story();
        // story.story2();
        // Enemy slime = new Slime();
        // Player a = new Fighter("aaaa");
        // Battle abc = new Battle(a,slime);
        // Sort sort = new Sort();

        // Enemy enemy1 = new Ogre();
        // Enemy enemy2 = new Yeti();
        // Enemy enemy3 = new Orochi();
        // Enemy enemy4 = new Slime();

        // Enemy listENEMY[] = {enemy1,enemy2,enemy3,enemy4};
        // Enemy sorted[] = sort.selectionSort(listENEMY);
        // for(Enemy a : sorted){
        //     System.out.println(a.toString());
        // }

        // Player player = new Assassin("Ninja");
        // Enemy enemy = new Orochi();
        // Battle battle = new Battle(player, enemy);
        
        // Sort sort = new Sort();
        // Player assassin = new Assassin("Assassin");
        // Player fighter = new Fighter("Fighter");
        // Player ranger = new Ranger("Ranger");
        // Player wizard = new Wizard("Wizard");
        // Player[] players = {assassin, fighter, ranger, wizard};
        // Player[] sortedPlayers = sort.bubbleSort(players);
        // int i = 1;
        // System.out.println("LARGEST TO SMALLEST PLAYER HEALTH : ");
        // for(Player p : sortedPlayers){
        //     System.out.println(i+ ". \n" + p.printOriginalString()+"\n");
        //     i++;
        // }
    }
    
    public static void clearScreen() {
        //to clear screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static boolean isNumeric(String str) {
        int intValue;
        try {
            intValue = Integer.parseInt(str); //error apabila merupakan abjad
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
