package mainclasses;

public abstract class Player{
    private String name;
    private int health;
    private int mana;
    private Backpack backpack;
    private int gold;
    private int currentStage = 1;
    private static int classID;

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

    public void usePotionHealth(){
        health += 8;
        backpack.healthPotion--;
    }

    public void usePotionMana(){
        mana += 3;
        backpack.manaPotion--;
    }

    //Constructor empty untuk player
    public Player(){}

    public Player(String name,int health,int mana){
        this.name = name;
        this.health = health;
        this.mana = mana;
    }

    //Method serangan player
    public void attack(){}
    public void skill1(){}
    public void skill2(){}
    public void skill3(){}
    public void skill4(){}
    
    //Multiplier empty player
    public abstract int multiplier();

}