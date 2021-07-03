package playersubclasses;
import java.util.Random;
import mainclasses.Player;

public class Ranger extends Player{
    public int attSTR = 45;

    public Ranger(String name){
        //Nama berasal dari player
        //health awal   : 50
        //mana awal     : 0
        super(name,60,0);
        
    }


    public void attack() {
    
    }

    //ShockDart
    public void skill1() {

    }

    //ChargeShot
    public void skill2() {

    }
    
    //MultiShoot
    public void skill3() {

    }

    //EMPTY
    public void skill4() {
  
    }


    @Override
    //Multiplier untuk Ranger
    public int multiplier() {
        Random rand = new Random();
        //multi memiliki nilai minimum 3 dan maksimum 6
        int multi = rand.nextInt(3) + 4 ;
        return multi;
    
    }
}
