package mainclasses;
import java.util.Scanner;
import playersubclasses.*;
import enemysubclasses.*;
public class App {
    public static void main(String[] args) throws Exception {

        Story story = new Story();
        story.story2();
        
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
