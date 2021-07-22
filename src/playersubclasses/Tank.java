package playersubclasses;
import java.util.Random;
import mainclasses.Enemy;
import mainclasses.Player;
import mainclasses.Weapon;
import mainclasses.Battle;

/*
Nama : Calvin Wendy
NIM : 03082200010
*/

public class Tank extends Player{
    //properties
    private Weapon weapon;

    //constructor
    public Tank(String name){
        //Nama berasal dari player
        //health awal   : 1000
        //str awal      : 5
        //mana awal     : 0
        super(name,1000,0,5,0);
        super.setClassID(1); //weapon tank = weapon fighter
        this.weapon = new Weapon(getClassID());
        super.setWeapon(weapon); 
    }

    public Tank(String name, int health, int mana, int attSTR, int attINT){
        
    }    
}
