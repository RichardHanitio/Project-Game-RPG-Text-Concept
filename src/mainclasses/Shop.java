package mainclasses;
import java.util.Scanner;



public class Shop {
    Player player;
    Scanner in = new Scanner(System.in);

    int pilih = 1234;
    public Shop(Player players){
        this.player = players;

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
        System.out.println("");
        
        if(pilih == 1){
            int healthPCost = 200;
            if(player.getGold() < healthPCost){
                System.out.println("Sorry sir,your money is not enough to buy this Health Potion");
            }
            else{
                if (player.getBackpack().getHealthPotion() >= 5){
                    System.out.println("HealthPotion Full");
                }
                else {
                    player.getBackpack().setHealthPotion(player.getBackpack().getHealthPotion() + 1);
                    System.out.println("Your have " + player.getBackpack().getHealthPotion() + "Health Potion now");
                    int afterBuy = player.getGold() - healthPCost;
                    player.setGold(afterBuy);
                }
            }
        }

        else if(pilih == 2){
            int manaPCost = 100;
            if(player.getGold() < manaPCost){
                System.out.println("Sorry sir,your money is not enough to buy this Health Potion");
            }
            else{
                if (player.getBackpack().getManaPotion() >= 3){
                    System.out.println("ManaPotion Full");
                }
                else {
                    player.getBackpack().setManaPotion(player.getBackpack().getManaPotion()+1);
                    System.out.println("Your have " + player.getBackpack().getManaPotion() + " Mana Potion now");
                    int afterBuy = player.getGold() - manaPCost;
                    player.setGold(afterBuy);
                }
            }
        }
        else if(pilih == 3){
            System.out.println("");
        }
        else{
            System.out.println("Your input is invalid please try again . . . ");
            System.out.println("");
        }
        System.out.println("");
    }
}
