package mainclasses;
import playersubclasses.*;
import enemysubclasses.*;

public class App {
    public static void main(String[] args) throws Exception {
        Player player1 = new Fighter("Laplace");
        Enemy enemy1 = new Ogre();
        Battle battle = new Battle(player1, enemy1);
        


    }
}
