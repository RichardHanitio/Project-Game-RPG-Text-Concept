package mainclasses;

import java.util.Scanner;

public abstract class Player{
    private String name;
    private int health;
    private int mana;
    private Backpack backpack;
    private int gold;
    private int currentStage = 1;
    private static int classID;

    Scanner masukan = new Scanner(System.in);

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
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

    public static int getClassID() {
        return classID;
    }

    public void setClassID(int aClassID) {
        classID = aClassID;
    }

    public void openBackpack() {
        System.out.println("Menu Backpack :");
        int pilih;

        System.out.println("1.Use Health Potion");
        System.out.println("2.Use Mana Potion");
        System.out.println("3.Exit");
        System.out.print("Choose number : ");
        pilih = masukan.nextInt();
        
        
        if (pilih == 1){
            System.out.println("Using health potion.");
            System.out.println("Health : +8 ");
            setHealth(getHealth()+80);
            backpack.setHealthPotion(backpack.getHealthPotion()-1);
        }
        else if(pilih == 2){
            System.out.println("Using mana potion.");
            System.out.println("Mana : +3 ");
            setMana(getMana()+3);
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

    public Player(String name,int health,int mana){
        this.name = name;
        this.health = health;
        this.mana = mana;
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