package subclassplayer;
import java.util.Random;

import mainclass.*;


public class Wizard extends Player{
    public int attINT = 5;

    public Wizard(String name){
        //Nama berasal dari player
        //health awal   : 100
        //mana awal     : 10
        super(name,100,10);
        
    }


    @Override
    public void attack() {
    
    }

    @Override
    //Meteor
    public void skill1() {

    }

    @Override
    //LifeDrain
    public void skill2() {

    }

    @Override
    //LightningSpell
    public void skill3() {

    }

    @Override
    //Mirror
    public void skill4() {
  
    }


    @Override
    //Multiplier untuk Ranger
    public int multiplier() {
        
        return 0;
    }
    
}
