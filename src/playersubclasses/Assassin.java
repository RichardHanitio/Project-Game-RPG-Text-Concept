package playersubclasses;
import mainclasses.Enemy;
import mainclasses.Player;
import mainclasses.Weapon;
import mainclasses.Battle;

/*
Nama : Richard Hanitio
NIM : 03082200014
*/

public class Assassin extends Player{
    // properties
    private Weapon weapon;

    // constructors
    public Assassin(String name){
        // health  : 90
        // STR dmg : 80
        // mana    : 0
        super(name,90,0,80,0);
        super.setClassID(1); //weapon assassin sama dengan weapon fighter
        this.weapon = new Weapon(getClassID());
        super.setWeapon(weapon);
    }

    // methods
    @Override
    public int multiplier() {
        //multiplier assassin : min 2 max 5
        int crit = (int) Math.floor(Math.random() * (5 - 2 + 1) + 2);
        System.out.println((crit==5)?"VENOMOUS STRIKE!!! enemy : -"+getAttSTR()*5 : "");
        return crit;
    }

    @Override
    public void attack(int turnCounter, Enemy enemy) {
        System.out.println("{ You attack enemy with basic attack }");
        enemy.setHealth(enemy.getHealth() - (getAttSTR() * multiplier()));
        if (getMana() < 10) setMana(getMana() + 1);
        Battle.setTurnCounter(Battle.getTurnCounter() + 1);
    }

    @Override
    public void skill1(int turnCounter, Enemy enemy) {
        //shuriken : dmg 2 kali basic attack*multiplier
        //mana : 3
        if (getMana() >= 3) {
            System.out.println("{ You use Skill 1 : Throw Shuriken }");
            setMana(getMana()-3);
            enemy.setHealth(enemy.getHealth()-(2*getAttSTR()*multiplier()));
            Battle.setTurnCounter(Battle.getTurnCounter() + 1);
        } else {
            System.out.println("Your mana is not enough to use this skill");
        }
    }

    //METHOD OVERLOADING DARI SKILL 1
    //Kita bisa mengatur berapa harga mana dari skill ini
    public void skill1(int manaCost,int turnCounter, Enemy enemy){
        if (getMana() >= manaCost) {
            System.out.println("{ You use Skill 1 : Throw Shuriken }");
            setMana(getMana() - manaCost);
            enemy.setHealth(enemy.getHealth() - (2 * getAttSTR() * multiplier()));
            Battle.setTurnCounter(Battle.getTurnCounter() + 1);
        } else {
            System.out.println("Your mana is not enough to use this skill");
        }
    }

    @Override
    public void skill2(int turnCounter, Enemy enemy) {
        //massacre : dmg 3 kali basic attack*multiplier
        //mana : 5
        if (getMana() >= 5) {
            System.out.println("{ You use Skill 2 : Massacre }");
            setMana(getMana() - 3);
            enemy.setHealth(enemy.getHealth() - (3 * getAttSTR() * multiplier()));
            Battle.setTurnCounter(Battle.getTurnCounter() + 1);
        } else {
            System.out.println("Your mana is not enough to use this skill");
        }
    }

    @Override
    public void skill3(int turnCounter, Enemy enemy) {
        // killer's eye : nerf enemy basic attack damage -30% the whole battle
        // mana : 7
        if (getMana() >= 7) {
            System.out.println("{ You use Skill 3 : Killer's Eye }");
            setMana(getMana()-7);
            enemy.setAttackPower((int)Math.floor(0.7 * enemy.getAttackPower()));
            Battle.setTurnCounter(Battle.getTurnCounter() + 1);
        } else {
            System.out.println("Your mana is not enough to use this skill");
        }
    }

    @Override
    public void skill4(int turnCounter, Enemy enemy) {
        // EMPTY
        System.out.println("Your class doesn't have this skill");
    }

    @Override
    public String toString() {
        return "Player Stats   : \n" + "Name           : " + getName() + "\n" + "Health         : " + getHealth() + "\n"
                + "Mana           : " + getMana() + "\n" + "Attack Power   : " + getAttSTR() + "\n"
                + "Weapon         : " + weapon.toString();

    }

    @Override
    public String printOriginalString() {
        return "Player Stats   : \n" + "Name           : " + getName() + "\n" + "Health         : " + getClassOriginalHealth() + "\n"
                + "Mana           : " + getMana() + "\n" + "Attack Power   : " + getAttSTR() + "\n"
                + "Weapon         : " + weapon.toString();

    }

    public void playerMenu() {
        System.out.println("------------------------------------------------------");
        System.out.println("|                     Menu                           |");
        System.out.println("| 1.Attack                        2.Shuriken     (3) |");
        System.out.println("| 3.Massacre   (5)                4.Killer's Eye (7) |");
        System.out.println("| 5.EMPTY                         6.Open Backpack    |");
        System.out.println("|             7.Surrender (Warning)                  |");
        System.out.println("------------------------------------------------------");
        System.out.print(" Choose  : ");
    }
    
}
