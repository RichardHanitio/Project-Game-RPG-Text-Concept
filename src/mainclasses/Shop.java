package mainclasses;
import java.util.Scanner;

public class Shop {
    Player player;
    Scanner in = new Scanner(System.in);
    int playerMoney = player.getGold();
    Backpack playerBP = player.getBackpack();

    int pilih = 1234;
    public Shop(Player player){
        this.player = player;
        while(pilih != 3){
            menu();
        }
    }

    public void menu(){
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Welcome to my shop,please buy something from my shop : (Use number to choose item)");
        System.out.println("");
        System.out.println("1. Buy Health Potion                                            Price   : 200 Golds");
        System.out.println("2. Buy Mana Potion                                              Price   : 100 Golds");
        System.out.println("3. Exit from shop");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.print("Choose : ");
        pilih = in.nextInt();
        
        if(pilih == 1){
            int healthPCost = 200;
            if(playerMoney < healthPCost){
                System.out.println("Sorry sir,your money is not enough to buy this Health Potion");
            }
            else{
                if (playerBP.getHealthPotion() >= 5){
                    System.out.println("HealthPotion Full");
                }
                else {
                    playerBP.setHealthPotion(playerBP.getHealthPotion() + 1);
                    System.out.println("Your have " + playerBP.getHealthPotion() + "Health Potion now");
                    int afterBuy = playerMoney - healthPCost;
                    player.setGold(afterBuy);
                }
            }
        }

        else if(pilih == 2){
            int manaPCost = 100;
            if(playerMoney < manaPCost){
                System.out.println("Sorry sir,your money is not enough to buy this Health Potion");
            }
            else{
                if (playerBP.getManaPotion() >= 3){
                    System.out.println("ManaPotion Full");
                }
                else {
                    playerBP.setManaPotion(playerBP.getManaPotion()+1);
                    System.out.println("Your have " + playerBP.getManaPotion() + "Mana Potion now");
                    int afterBuy = playerMoney - manaPCost;
                    player.setGold(afterBuy);
                }
            }
        }

        else{
            System.out.println("Your input is invalid please try again . . . ");
            System.out.println("");
        }
        System.out.println("");
    }
}
