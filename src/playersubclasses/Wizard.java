package playersubclasses;
import java.util.Random;
import mainclasses.Player;


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
        Random rand = new Random();
        //multi memiliki nilai minimum 1 dan maksimum 6
        int multi = rand.nextInt(6) + 1;
        return multi;
    }
    
}
