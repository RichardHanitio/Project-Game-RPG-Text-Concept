package playersubclasses;
import java.util.Random;
import mainclasses.Player;

public class Fighter extends Player {
    public int attSTR = 25;

    public Fighter(String name){
        //Nama berasal dari player
        //health awal   : 200
        //mana awal     : 0
        super(name,200,0);
        
    }


    @Override
    public void attack() {
    
    }

    @Override
    //Heal
    public void skill1() {

    }

    @Override
    //WarCry
    public void skill2() {

    }

    @Override
    //OnePUNCH
    public void skill3() {

    }

    @Override
    //EMPTY
    public void skill4() {
  
    }


    @Override
    //Multiplier untuk Fighter
    public int multiplier() {
        
        return 0;
    }
    
}
