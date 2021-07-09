package mainclasses;

import java.util.Scanner;

public abstract class Player{
    private String name;
    private static int health;
    private int mana;
    private Backpack backpack = new Backpack();
    private Weapon weapon;
    private int gold;
    private int currentStage = 1;
    private static int attSTR;
    private static int attINT;
    private int classID;

    Scanner masukan = new Scanner(System.in);

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getHealth() {
        return health;
    }

    public static void setHealth(int hp) {
        health = hp;
    }

    public int getMana() {
        return this.mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Backpack getBackpack() {
        return this.backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    public int getGold() {
        return this.gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getCurrentStage() {
        return this.currentStage;
    }

    public void setCurrentStage(int currentStage) {
        this.currentStage = currentStage;
    }

    public int getClassID() {
        return this.classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public static int getAttSTR() {
        return attSTR;
    }

    public static void setAttSTR(int attStrength) {
        attSTR = attStrength;
    }


    public static int getAttINT() {
        return attINT;
    }

    public static void setAttINT(int attIntelligence) {
        attINT = attIntelligence;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void openBackpack() {
        System.out.println("Menu Backpack :");
        int pilih;

        System.out.println("1.Use Health Potion ("+backpack.getHealthPotion()+" left)");
        System.out.println("2.Use Mana Potion ("+backpack.getManaPotion()+" left");
        System.out.println("3.Exit");
        System.out.print("Choose number : ");
        pilih = masukan.nextInt();
        
        
        if (pilih == 1){
            System.out.println("Using health potion.");
            System.out.println("Health : +80 ");
            backpack.setManaPotion(backpack.getManaPotion() - 1);
        }
        else if(pilih == 2){
            System.out.println("Using mana potion.");
            System.out.println("Mana : +3 ");
            backpack.setManaPotion(backpack.getManaPotion()-1);
        }
        else if(pilih == 3){
            System.out.println("Already exit");
            System.out.println("");
        }
        else{
            System.out.println("Pilihan anda salah");
        }
    }

    //Constructor empty untuk player
    public Player(){}

    public Player(String name,int hp,int mana,int STR, int INT){
        this.name = name;
        health = hp;
        this.mana = mana;
        attSTR = STR;
        attINT = INT;
    }

    //Method serangan player
    public abstract void  attack(int turnCounter, Enemy enemy);
    public abstract void skill1(int turnCounter, Enemy enemy);
    public abstract void skill2(int turnCounter, Enemy enemy);
    public abstract void skill3(int turnCounter, Enemy enemy);
    public abstract void skill4(int turnCounter, Enemy enemy);
    
    //Multiplier empty player
    public abstract int multiplier();

    public void playerMenu(){}

}