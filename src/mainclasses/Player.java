package mainclasses;

import java.util.Scanner;

public abstract class Player{
    private String name;
    private int health;
    private int mana;
    private Backpack backpack = new Backpack();
    private int gold;
    private int currentStage = 1;
    private int attSTR;
    private int attINT;
    private int classID;

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

    public int getClassID() {
        return this.classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public int getAttSTR() {
        return this.attSTR;
    }

    public void setAttSTR(int attSTR) {
        this.attSTR = attSTR;
    }


    public int getAttINT() {
        return this.attINT;
    }

    public void setAttINT(int attINT) {
        this.attINT = attINT;
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

    public Player(String name,int health,int mana,int attSTR, int attINT){
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.attSTR = attSTR;
        this.attINT = attINT;
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