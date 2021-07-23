package mainclasses;

import java.util.Scanner;
import java.util.Random;
import fileClasses.ReadWrite;

public class Casino {
    // Nama : Setiawan Junior
    // NIM : 03082180037
    Player player;
    ReadWrite read_write = new ReadWrite();
    Scanner sc = new Scanner(System.in);
    String output;
    int choice = 0;
    int playerGold = player.getGold();

    public static String slot_machine(int chips, int win, int lose) {
        //Method Slot Machine
        boolean run = true;
        System.out.println("You need 20 chips to play.");

        Random random = new Random();
        String writeData;
        Scanner scan = new Scanner(System.in);
        int rNum1 = 0;
        int rNum2 = 0;
        int rNum3 = 0;

        while (run) {
            if (chips < 20) {
                System.out.println("You don't have enough gold!");
                System.out.println("You've been kicked out from the casino.");
            } else {
                chips = chips - 20;
                rNum1 = random.nextInt(7) + 1;
                rNum2 = random.nextInt(7) + 1;
                rNum3 = random.nextInt(7) + 1;
                System.out.println(rNum1 + "|" + rNum2 + "|" + rNum3);
                if (rNum1 == 7 && rNum2 == 7 && rNum3 == 7) {
                    chips = chips + 60;
                    win = win + 1;
                    System.out.println("You win the BIG PRIZE!!!!");
                    System.out.println("");
                    System.out.println("You earned 60 chips!");
                    System.out.println("");
                    System.out.println("Your current chips are " + chips + ".");
                    System.out.println("");

                } else if ((rNum1 == 7 && rNum2 == 7) || (rNum2 == 7 && rNum3 == 7) || (rNum1 == 7 && rNum3 == 7)) {
                    chips = chips + 40;
                    win = win + 1;
                    System.out.println("You win the normal prize!");
                    System.out.println("");
                    System.out.println("You earned 40 chips!");
                    System.out.println("");
                    System.out.println("Your current chips are " + chips + ".");
                    System.out.println("");
                } else if (rNum1 == 7 || rNum2 == 7 || rNum3 == 8) {
                    chips = chips + 25;
                    win = win + 1;
                    System.out.println("You Win!");
                    System.out.println("");
                    System.out.println("You earned 25 chips!");
                    System.out.println("");
                    System.out.println("Your current chips are " + chips + ".");
                    System.out.println("");
                } else {
                    lose = lose + 1;
                    System.out.println("You Lose. . .");
                    System.out.println("");
                    System.out.println("Your current chips are " + chips + ".");
                    System.out.println("");
                }
            }
            System.out.println("Would you wish to play again? (y/n)");
            String choice = scan.nextLine();

            if (choice.equals("y") || choice.equals("Y")) {
            } else if (choice.equals("n") || choice.equals("N")) {
                run = false;
            } else {
                System.out.println("You entered a wrong value.");
                run = false;
            }

            System.out.println("Thank you for playing!");
        }
        writeData = (chips + "," + win + "," + lose);
        return writeData;
    }

    public static String blackjack(int chips, int win, int lose) {
        //Method Blackjack
        boolean run = true;
        boolean state = false;
        String anotherCard, choice;
        String writeData;
        int nextCard, card1, card2, dCard1, dCard2;
        int cardTotal = 0, dTotal = 0;
        System.out.println("You need 60 chips to play.");

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        if (chips < 60) {
            System.out.println("You don't have enough gold!");
            System.out.println("You've been kicked out from the casino.");
        } else {
            while (run) {
                chips = chips - 60;
                // Dealer card
                dCard1 = random.nextInt(10) + 1;
                dCard2 = random.nextInt(10) + 1;
                dTotal = dCard1 + dCard2;
                // player card
                card1 = random.nextInt(10) + 1;
                card2 = random.nextInt(10) + 1;
                cardTotal = card1 + card2;
                // Show card
                System.out.println("Dealer shows: " + "|" + dCard1 + "|");
                System.out.println("");
                System.out.println("");
                System.out.println("Your card: " + "|" + card1 + "|" + "|" + card2 + "|");
                System.out.println("");
                System.out.println("Total: " + cardTotal);
                System.out.println("");
                System.out.println("");
                System.out.println("Draw another card (y/n)?");
                anotherCard = scan.nextLine();

                while (state == false) {
                    while (anotherCard.equals("Y") || anotherCard.equals("y")) {
                        nextCard = random.nextInt(10) + 1;
                        cardTotal = cardTotal + nextCard;
                        System.out
                                .println("Your card: " + "|" + card1 + "|" + "|" + card2 + "|" + "|" + nextCard + "|");
                        System.out.println("");
                        System.out.println("Total: " + cardTotal);

                        if (cardTotal > 21) {
                            System.out.println("Busted, Dealer Wins!");
                            System.out.println("");
                            System.out.println("You lost 60 chips!");
                            System.out.println("");
                            System.out.println("Your current chips are " + chips + ".");
                            System.out.println("");
                            lose = lose + 1;
                            state = true;
                            anotherCard = "x";
                        } else if (cardTotal < 21) {
                            System.out.println("Draw another card (y/n)?");
                            anotherCard = scan.nextLine();
                        } else if (cardTotal == 21) {
                            System.out.println("BLACKJACK! You Win!");
                            System.out.println("");
                            System.out.println("You earned 250 chips!");
                            System.out.println("");
                            System.out.println("Your current chips are " + chips + ".");
                            System.out.println("");
                            chips = chips + 250;
                            win = win + 1;
                            state = true;
                            anotherCard = "x";
                        }
                    }
                    while (anotherCard.equals("N") || anotherCard.equals("n")) {
                        if (cardTotal > dTotal) {
                            System.out.println("You Win!");
                            System.out.println("");
                            System.out.println("You earned 120 chips!");
                            System.out.println("");
                            System.out.println("Your current chips are " + chips + ".");
                            System.out.println("");
                            chips = chips + 120;
                            win = win + 1;
                            state = true;
                            anotherCard = "x";
                        } else if (cardTotal < dTotal) {
                            System.out.println("You Lose! Dealer Wins!");
                            System.out.println("");
                            System.out.println("You lost 60 chips!");
                            System.out.println("");
                            System.out.println("Your current chips are " + chips + ".");
                            System.out.println("");
                            lose = lose + 1;
                            state = true;
                            anotherCard = "x";
                        } else if (cardTotal == dTotal) {
                            System.out.println("Draw");
                            chips = chips + 60;
                            state = true;
                            anotherCard = "x";
                        } else if (cardTotal == 21) {
                            System.out.println("BLACKJACK! You Win!");
                            System.out.println("");
                            System.out.println("You earned 250 chips!");
                            System.out.println("");
                            System.out.println("Your current chips are " + chips + ".");
                            System.out.println("");
                            chips = chips + 250;
                            win = win + 1;
                            state = true;
                            anotherCard = "x";
                        }
                    }
                }
                System.out.println("Would you wish to play again? (y/n)");
                choice = scan.nextLine();

                if (choice.equals("y") || choice.equals("Y")) {
                } else if (choice.equals("n") || choice.equals("N")) {
                    run = false;
                } else {
                    System.out.println("You entered a wrong value.");
                    run = false;
                }

                System.out.println("Thank you for playing!");
            }
        }
        writeData = (chips + "," + win + "," + lose);
        return writeData;
    }

    public Casino(Player players) {
        this.player = players;

        while (choice != 6) {
            menu();
        }
    }

    public void menu() {
        //Method menu casino
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Welcome to the Casino!(Use number to choose item)");
        System.out.println("");
        System.out.println(
                "                                                                Gold    : " + player.getGold());
        System.out.println("1. Play Slot Machine                                      Price   : 20  chips");
        System.out.println("2. Play BlackJack                                         Price   : 60  chips");
        System.out.println("3. Buy Chips                                              Price   : 1 gold = 1 chips");
        System.out.println("4. Exchange Chips                                         Price   : 1 gold = 1 chips");
        System.out.println("5. Check Win Lose Records");
        System.out.println("6. Exit from Casino");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.print("Choose : ");
        choice = sc.nextInt();
        System.out.println("");

        if (choice == 1) {
            int chips = read_write.read_data(0);
            int slot_win = read_write.read_data(1);
            int slot_lose = read_write.read_data(2);

            output = slot_machine(chips, slot_win, slot_lose);
            read_write.write_data_overwrite(output);
        }

        else if (choice == 2) {
            int chips = read_write.read_data(0);
            int slot_win = read_write.read_data(1);
            int slot_lose = read_write.read_data(2);

            output = blackjack(chips, slot_win, slot_lose);
            read_write.write_data_overwrite(output);
        }

        else if (choice == 3) {
            if (player.getGold() <= 0) {
                System.out.println("Sorry sir,your money is not enough to play in this casino");
            } else {
                System.out
                        .println("----------------------------------------------------------------------------------");
                System.out.println("Want to Buy Chips?(Use number to choose item)");
                System.out.println("");
                System.out.println("                                                                Gold    : "
                        + player.getGold());
                System.out.println("1. Buy 10 chips                                      Price   : 20  gold");
                System.out.println("2. Exit from Casino");
                System.out
                        .println("----------------------------------------------------------------------------------");
                System.out.print("Choose : ");
                choice = sc.nextInt();
                System.out.println("");

                if (choice == 1) {
                    int chips = read_write.read_data(0);
                    int slot_win = read_write.read_data(1);
                    int slot_lose = read_write.read_data(2);

                    chips = chips + 10;
                    playerGold = playerGold - 10;
                    player.setGold(playerGold);
                    read_write.write_data_overwrite(output);
                    System.out.println("Bought 10 chips!");
                } else if (choice == 2) {
                    System.out.println(" ");
                }
            }
        }

        else if (choice == 4) {
            int chips = read_write.read_data(0);
            int slot_win = read_write.read_data(1);
            int slot_lose = read_write.read_data(2);
            if (chips <= 0) {
                System.out.println("Sorry sir,your chips is not enough to exchange.");
            } else {
                System.out
                        .println("----------------------------------------------------------------------------------");
                System.out.println("Want to exchange Chips?(Use number to choose item)");
                System.out.println("");
                System.out.println("                                                                Gold    : "
                        + player.getGold());
                System.out.println("1. exchange 10 chips                                      Price   : 20  gold");
                System.out.println("2. Exit from Casino");
                System.out
                        .println("----------------------------------------------------------------------------------");
                System.out.print("Choose : ");
                choice = sc.nextInt();
                System.out.println("");

                if (choice == 1) {

                    chips = chips - 10;
                    playerGold = playerGold + 10;
                    player.setGold(playerGold);
                    read_write.write_data_overwrite(output);
                    System.out.println("Earned 10 chips!");
                } else if (choice == 2) {
                    System.out.println(" ");
                }
            }
        }

        if (choice == 1) {
            int chips = read_write.read_data(0);
            int slot_win = read_write.read_data(1);
            int slot_lose = read_write.read_data(2);

            System.out.println("You win : " + slot_win + " times.");
            System.out.println("You lost : " + slot_lose + " times.");
            System.out.println("");
            System.out.println("You have : " + chips + "chips.");
        }

        else if (choice == 6) {
            System.out.println(" ");
        }

        else {
            System.out.println("Your input is invalid please try again . . . ");
            System.out.println("");
        }
        System.out.println("");

    }

}
