package mainclasses;
import java.util.Scanner;
import playersubclasses.*;
import enemysubclasses.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Player player1 = new Fighter("Laplace");
        // Enemy enemy1 = new Ogre();
        // Battle battle = new Battle(player1, enemy1);

        Scanner scanner = new Scanner(System.in);
        int choice;
        String charName = null;
        char confirm;

        do{
            clearScreen();
            System.out.println("---------------------------");
            System.out.println("Select Your Class : ");
            System.out.println("---------------------------");
            System.out.println("1. Fighter");
            System.out.println("2. Ranger");
            System.out.println("3. Wizard");
            System.out.println("0. Exit Game");
            System.out.print("You choose : ");
            choice = scanner.nextInt();
            if(choice!=0) {
                do {
                    System.out.print("Enter your character's name : ");
                    scanner.nextLine();
                    charName = scanner.nextLine();
                    if(isNumeric(charName)){
                        System.out.println("Your name MUST NOT be a number...");
                    } else break;
                } while(true);
            }

            switch(choice){
                case 1 :    
                    Player fighter = new Fighter(charName); 
                    System.out.println("\nYou choose : Fighter");
                    System.out.println(fighter);
                    break;
                case 2:
                    Player ranger = new Ranger(charName);
                    System.out.println("\nYou choose : Ranger");
                    System.out.println(ranger);
                    break;
                case 3:
                    Player wizard = new Wizard(charName);
                    System.out.println("\nYou choose : Wizard");
                    System.out.println(wizard);
                    break;
                case 0 :
                    System.out.println("Thank you...");
                    System.exit(0);    
            }
            while(true){
                System.out.print("Confirm (y/n) ? ");
                confirm = scanner.nextLine().toLowerCase().charAt(0);
                if (confirm=='y' || confirm=='n') break;
            }
            if(confirm=='y') break;
        } while (true);

        System.out.println("Starting game, please wait...");
        Thread.sleep(2000);
        scanner.close();
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
