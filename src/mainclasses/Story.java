package mainclasses;

import java.util.Scanner;
import playersubclasses.*;
import enemysubclasses.*;
import mainclasses.Player;

public class Story {
    static String name;
    static int playerID;

    private void pressAnyKeyToContinue() {
        System.out.println("Press Enter Key to Continue. . . ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    private void pressAnyKeyToContinueDialog() {
        System.out.println("->");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    private void orcBattle() {

    }

    public void setName(String nameInput) {
        this.name = nameInput;
    }

    public String getName() {
        return this.name;
    }

    public Player story1() {
        Player player = new Wizard ("BAMBANG");

        boolean status = true;
        int choices;
        Scanner choice = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\t\t Developed by SRRC");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        pressAnyKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\t\t\t\t\t\t\t\t\t       SRRC");
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\t\t     Presents");
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\t\t   CHRONOS ZERO");
        System.out.println("");
        System.out.println("");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your character name: ");
        String nameInput = scanner.next();
        setName(nameInput);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("");
        System.out.println("");
        System.out.println("Character " + getName() + " has been created.");
        System.out.println("");
        System.out.println("");
        pressAnyKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\t\t\t\t\t\t\t\t\t   Prologue");
        System.out.println("");
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\t\t The Awakening");
        System.out.println("");
        System.out.println("");
        pressAnyKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("");
        System.out.println("");
        System.out.println("A world where weapons and tools are not created but given by the gods.");
        System.out.println("");
        System.out.println("A born human will possessed their very own soul of constellation.");
        System.out.println("This soul of constellation will represents their role in this world.");
        System.out.println("");
        System.out.println("");
        pressAnyKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("");
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\t\t    Yes");
        System.out.println("");
        System.out.println("");
        pressAnyKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\t    This world is called");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        pressAnyKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\t\t   ZERO");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        pressAnyKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("");
        System.out.println("");
        System.out.println(getName() + " was born with a farmer constellation.");
        System.out
                .println("Yes, the gods has decided that " + getName() + " purpose in life will be all about farming.");
        System.out.println("");
        pressAnyKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(
                getName() + " was born into a happy family of both parents (Alex and Marie) and a sister (Alice).");
        System.out.println("They live a happy life for 25 years until that incident happened.");
        System.out.println("");
        pressAnyKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("It happened during his sister coming of age ceremony.");
        System.out.println("The sky darkened.");
        System.out.println("Thunder roars.");
        System.out.println("Suddenly a light shone through from the sky.");
        System.out.println("A godlike figure descends from the clouded sky like a saviour.");
        System.out.println("An appearance like a greek god, wields thunder on his right hand.");
        System.out.println("Yes, he's known as the rulers of the gods.");
        System.out.println("Zeus.");
        System.out.println("");
        pressAnyKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("A good fortune is expected when the gods descended to the mortal realm.");
        System.out.println("Everyone is delighted and kneel to greet the great god.");
        System.out.println("HOWEVER");
        System.out.println("");
        System.out.println("The next sentence that comes out from Zeus will change everything for " + getName());
        System.out.println("");
        System.out.println("Zeus: I'm interested with that young girl there.");
        pressAnyKeyToContinueDialog();
        System.out.println("Zeus: Give her to me as the sacred lady, and I will bless this land with fortune.");
        pressAnyKeyToContinueDialog();
        System.out.println("Everyone is delighted excepts the little girl and her family itself.");
        System.out.println("");
        pressAnyKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Alice father, Alex pleaded with tears on his eyes.");
        pressAnyKeyToContinueDialog();
        System.out.println("Alex: I don't ask for anything, but please don't take my daughter away from us.");
        pressAnyKeyToContinueDialog();
        System.out.println("Zeus: No can do, give her to me I'll bless this village with fortune.");
        pressAnyKeyToContinueDialog();
        System.out.println("Zeus: Else, I'll erase this village once and for all.");
        pressAnyKeyToContinueDialog();
        System.out.println("");
        System.out.println("Alex and Marie keep pleading, but its useless.");
        System.out.println("The villagers looked at the little girl like a hungry wolf looking at its prey");
        System.out.println("They drag the little girl forcefully.");
        System.out.println("Alice cried and shout");
        System.out.println("");
        pressAnyKeyToContinue();
        System.out.println("");
        System.out.println("");
        System.out.println("Alice: " + getName() + " please help me!!!!");
        System.out.println("");
        System.out.println("");

        while (status == true) {
            System.out.println("What are you going to do?");
            System.out.println("1. Fight and take your sister back.");
            System.out.println("2. Give up and just watch.");

            if (!choice.hasNextInt()) {
                System.out.println("Please enter number(1 & 2) only.");
                System.out.println("");
                choice.next();
                continue;
            } else {
                choices = choice.nextInt();
                if (choices == 1) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("You've decided to risk everything to save your family.");
                    System.out.println("and start to fight back to take your sister back.");
                    status = false;
                    pressAnyKeyToContinueDialog();
                } else if (choices == 2) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("You stand there watching your family break apart.");
                    System.out.println("You cannot do anything.");
                    System.out.println("and you've lost everything in your life.");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("\t\t\t\t\t\t\t\t\t    GAME OVER");
                    System.exit(0);
                } else {
                    System.out.println("Please input 1 or 2 only.");
                    System.out.println("");
                    pressAnyKeyToContinue();
                }
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

        status = true;
        System.out.println("However, everything is useless.");
        System.out.println("You and your mother Marie were kicked and tossed aside.");
        System.out.println("Your father Alex who keep strunggling were killed.");
        System.out.println("");
        pressAnyKeyToContinueDialog();

        System.out.println("Your sister is on the hand of Zeus.");
        System.out.println("Looking at you and asking for your help.");
        System.out.println("But you cannot do anything.");
        System.out.println("");
        pressAnyKeyToContinueDialog();

        System.out.println("");
        System.out.println("");
        System.out.println("All you can do is looking at your sister being taken away.");
        System.out.println("");
        System.out.println("");
        pressAnyKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Zeus took away your sister.");
        System.out.println("Your father Alex was killed from saving your sister.");
        System.out.println("You and your mother were banished from the village.");
        System.out.println("");
        pressAnyKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Your mom passed away two days after the event.");
        System.out.println("Leaving you alone with her last words.");
        System.out.println("Marie: Please forget about us and live a happy life, thats all I asked.");
        pressAnyKeyToContinueDialog();
        System.out.println("Marie: Thank you son, and good bye.");
        pressAnyKeyToContinueDialog();
        System.out.println("Marie: I'm sorry.");
        System.out.println("");
        pressAnyKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("You've lost everything.");
        System.out.println("You walk and meet a two end road.");
        System.out.println("The first one is a road into a cave, while the other one is a road to the cliff.");
        System.out.println("");

        while (status == true) {
            System.out.println("What are you going to do?");
            System.out.println("1. Go to the cave and Rest.");
            System.out.println("2. To the cliff and end this miserable life.");

            if (!choice.hasNextInt()) {
                System.out.println("Please enter number(1 & 2) only.");
                System.out.println("");
                choice.next();
                continue;
            } else {
                choices = choice.nextInt();
                if (choices == 1) {
                    System.out.println("");
                    System.out.println("You decided to go to the cave and think about your life.");
                    pressAnyKeyToContinue();
                    status = false;
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                } else if (choices == 2) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("You can't take it anymore and decided to take your life.");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("\t\t\t\t\t\t\t\t\t    GAME OVER");
                    System.exit(0);
                } else {
                    System.out.println("Please input 1 or 2 only.");
                    System.out.println("");
                    pressAnyKeyToContinue();
                }
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

        status = true;
        System.out.println("You sat down and think about your life.");
        System.out.println("You can't hold it anymore and cried for your weaknesses.");
        System.out.println("You keep crying until you fell asleep.");
        System.out.println("");
        pressAnyKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Suddenly a huge light appears and called you.");
        System.out.println("??: Hey Kid still alive?");
        pressAnyKeyToContinueDialog();
        System.out.println(getName() + ": ...");
        pressAnyKeyToContinueDialog();
        System.out.println("??: Hey Kid, you there?");
        pressAnyKeyToContinueDialog();
        System.out.println(getName() + ": ...");
        pressAnyKeyToContinueDialog();
        System.out.println("??: Hey Kid!!!!!!!");
        pressAnyKeyToContinueDialog();
        System.out.println(getName() + ": what do you want?");
        pressAnyKeyToContinueDialog();
        System.out.println("??: Do you want revenge kid?");
        pressAnyKeyToContinueDialog();
        System.out.println(getName() + ": Are you joking, I'm a farmer and you ask me to fight gods?!");
        pressAnyKeyToContinueDialog();
        System.out.println(getName() + ": And not any god, he's the ruler of all gods!");
        pressAnyKeyToContinueDialog();
        System.out.println("??: I can give you power and guide you to fight him.");
        pressAnyKeyToContinueDialog();
        System.out.println(getName() + ": Who are you kidding, if you're here to scam me then go away.");
        pressAnyKeyToContinueDialog();
        System.out.println("??: Have you heard of Chronos?");
        pressAnyKeyToContinueDialog();
        System.out.println(getName() + ": Chronos, the fallen tyrant god Chronos?");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos(?): Yes I am that Chronos.");
        pressAnyKeyToContinueDialog();
        System.out.println(getName() + ": as I've told you, if you want to scam go away Chronos is long gone.");
        pressAnyKeyToContinueDialog();
        System.out.println(getName() + ": He got his ass kicked and he's long gone.");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos(?): Yes kid, I'm that Chronos who got his ass kicked.");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: Zeus, that shitty son of mine tried to kill me.");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: He thought he had killed me.");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: And as you can see I managed to survive.");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: So, are you going to have your revenge?");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: If its a power you want, you'll get it.");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: I'll guide you to have your revenge.");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: So what is it?");
        pressAnyKeyToContinueDialog();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        while (status == true) {
            System.out.println("What are you going to do?");
            System.out.println("1. Accept his offer.");
            System.out.println("2. Reject his offer.");

            if (!choice.hasNextInt()) {
                System.out.println("Please enter number(1 & 2) only.");
                System.out.println("");
                choice.next();
                continue;
            } else {
                choices = choice.nextInt();
                if (choices == 1) {
                    status = false;
                    System.out.println("");
                    System.out.println("You accept his offer.");
                    System.out.println("");
                    System.out.println(getName() + ": I accept your offer.");
                    pressAnyKeyToContinueDialog();
                    System.out.println(getName() + ": Give me power and guide me to achieve my revenge.");
                    pressAnyKeyToContinueDialog();
                } else if (choices == 2) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("You lost your only chance to change your fate.");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("\t\t\t\t\t\t\t\t\t    GAME OVER");
                    System.exit(0);
                } else {
                    System.out.println("Please input 1 or 2 only.");
                    System.out.println("");
                    pressAnyKeyToContinue();
                }
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        status = true;
        System.out.println("Chronos: Alright then.");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: Let's change that useless class of yours.");
        System.out.println("");
        pressAnyKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        while (status == true) {
            System.out.println("Select your class: ");
            System.out.println("---------------------------");
            System.out.println("1. Fighter");
            System.out.println("2. Ranger");
            System.out.println("3. Wizard");
            System.out.println("0. Exit Game");
            System.out.println("");
            System.out.print("You choose : ");

            if (!choice.hasNextInt()) {
                System.out.println("Please enter number(1 & 2) only.");
                System.out.println("");
                choice.next();
                continue;
            } else {
                choices = choice.nextInt();
                if (choices == 1) {
                    status = false;
                    System.out.println("");
                    System.out.println("You choose Fighter.");
                    Player playeraa = new Fighter(getName());
                    playerID = 1;
                    System.out.println("");
                    System.out.println("");
                    System.out.println(getName() + " has changed Class from Farmer to Fighter.");
                    System.out.println("");
                    pressAnyKeyToContinue();
                    return playeraa;
                } else if (choices == 2) {
                    status = false;
                    System.out.println("");
                    System.out.println("You choose Ranger.");
                    Player playeraa = new Ranger(getName());
                    playerID = 2;
                    System.out.println("");
                    System.out.println("");
                    System.out.println(getName() + " has changed Class from Farmer to Ranger.");
                    System.out.println("");
                    pressAnyKeyToContinue();
                    return playeraa;
                } else if (choices == 3) {
                    status = false;
                    System.out.println("");
                    System.out.println("You choose Wizard.");
                    Player playeraa = new Wizard(getName());
                    playerID = 3;
                    System.out.println("");
                    System.out.println("");
                    System.out.println(getName() + " has changed Class from Farmer to Wizard.");
                    System.out.println("");
                    pressAnyKeyToContinue();
                    return playeraa;
                } else if (choices == 0) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("The game has ended.");
                    System.exit(0);
                } else {
                    System.out.println("Please input 1 or 2 only.");
                    System.out.println("");
                    pressAnyKeyToContinue();
                }
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
            return player;
        }
        return player;
    }

    public void story2() {
        Player playeraa = story1();
        Enemy enemy1 = new Ogre();
        Enemy enemy2 = new Yeti();
        Enemy enemy3 = new Orochi();
    
        boolean status = true;
        boolean state = true;
        int choices;
        Scanner choice = new Scanner(System.in);



        System.out.println("Chronos: Congratulations " + getName() + ", you're now qualified to fight.");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: How do you feel " + getName() + "?");
        pressAnyKeyToContinueDialog();
        System.out.println(getName() + ": I feel amazing!");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: Remember, your class represents your purpose in this world.");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: Everyone were given a weapon or tools befitting their class.");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: However, every person will have different weapon potential than the others.");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: I can sense you have a huge potentials in becoming a god or even to rule them.");
        pressAnyKeyToContinueDialog();
        System.out.println(getName() + ": becoming a god?");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: Yes, whenever you defeated a monster or finished a certain quest.");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: You will received a special gold.");
        pressAnyKeyToContinueDialog();
        System.out.println("This gold will be the only way to unlock your weapon potential.");
        pressAnyKeyToContinueDialog();
        System.out.println(getName() + ": This cheap looking weapon? Are you sure?");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: Why don't you try it by beating some monsters?");
        pressAnyKeyToContinueDialog();
        System.out.println(getName() + ": Alright then.");
        pressAnyKeyToContinueDialog();
        System.out.println(
                "Chronos: Before that, I need to tell you the qualifications of standing the equal grounds with the gods.");
        pressAnyKeyToContinueDialog();
        System.out.println(getName() + ": qualifications of standing equally with the gods?");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: Yes, you have to defeat at least 4 guardians of the land.");
        pressAnyKeyToContinueDialog();
        System.out.println(getName() + ": Guardians of the land?");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: Yes, There are various guardians.");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: Fenrir, Orochi, Lupus, Basilisk, and more");
        pressAnyKeyToContinueDialog();
        System.out.println(getName() + ": Orochi?! Isn't that. . . ");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: Yeah, lucky you Orochi is nearby in this area.");
        pressAnyKeyToContinueDialog();
        System.out.println(getName()
                + ": I have to defeat at least 4 guardians to earn the qualifications to enter the realm of the gods right?");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: Yes.");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: Its time for you to go.");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: Wake up and go northwest to a town name Brightwood");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: Accept quests, kill monsters, and upgrade your weapons");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: Wake up and go northwest to a town name Brightwood");
        pressAnyKeyToContinueDialog();
        System.out.println("Chronos: Once you're ready, go and kill the guardians.");
        pressAnyKeyToContinueDialog();
        System.out.println(getName() + ": Alright, thank you very much Chronos.");
        System.out.println("");
        pressAnyKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\t\t\t\t\t\t\t\t\t Chapter Prologue");
        System.out.println("");
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\t\t  The Awakening");
        System.out.println("");
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\t\t       Ended");
        pressAnyKeyToContinue();

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\t\t\t\t\t\t\t\t\t Chapter One");
        System.out.println("");
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\t\t  The Beginning");
        System.out.println("");
        System.out.println("");
        pressAnyKeyToContinue();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("A few months has passed.");
        System.out.println("");
        pressAnyKeyToContinueDialog();
        System.out.println(getName() + ": I was nothing a moment ago.");
        pressAnyKeyToContinueDialog();
        System.err.println(getName() + ": Who knows I have the chance to have my revenge and save my sister.");
        pressAnyKeyToContinueDialog();
        System.out.println(getName() + ": Just you wait Zeus, I'll show you that karma is a bitch.");
        pressAnyKeyToContinueDialog();
        System.out.println(getName() + ": Chronos told me to go to the village, well I'm strong enough now why not.");
        pressAnyKeyToContinueDialog();
        System.err.println("");
        System.err.println("");
        System.out.println("On your way to the village, you met a grandma who's attacked by an orc.");

        while (status == true) {
            System.out.println("What are you going to do?");
            System.out.println("1. Fight the Orc and save her.");
            System.out.println("2. Leave her alone.");

            if (!choice.hasNextInt()) {
                System.out.println("Please enter number(1 & 2) only.");
                System.out.println("");
                choice.next();
                continue;
            } else {
                choices = choice.nextInt();
                if (choices == 1) {
                    System.out.println("Grandma: Help Me!!!!!!!!!");
                    System.out.println("");
                    pressAnyKeyToContinue();

                    if (playerID == 1) {
                        Battle battle = new Battle(playeraa, enemy1);
                    } else if (playerID == 2) {
                        Battle battle = new Battle(playeraa, enemy1);
                    } else if (playerID == 3) {
                        Battle battle = new Battle(playeraa, enemy1);
                    }
                    status = false;
                    pressAnyKeyToContinue();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Grandma: Thank you very much young man, you've saved my dear life!");
                    pressAnyKeyToContinueDialog();
                    System.out.println("Grandma: What a great noble hero you are.");
                    pressAnyKeyToContinueDialog();
                    System.out.println("Grandma: Here are some gold for you young hero.");
                    if (playerID == 1) {
                        playeraa.setGold(playeraa.getGold() + 20);
                        System.out.println("Obtained 20 gold!");
                    } else if (playerID == 2) {
                        playeraa.setGold(playeraa.getGold() + 20);
                        System.out.println("Obtained 20 gold!");
                    } else if (playerID == 3) {
                        playeraa.setGold(playeraa.getGold() + 20);
                        System.out.println("Obtained 20 gold!");
                    }
                    System.out.println(getName() + ": Thank you Grandma.");
                    System.out.println("");
                    pressAnyKeyToContinue();
                } else if (choices == 2) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("You left that poor grandma to death.");
                    System.out.println("Life is cruel.");
                    System.out.println("");
                    System.out.println("");
                    status = false;
                } else {
                    System.out.println("Please input 1 or 2 only.");
                    System.out.println("");
                    pressAnyKeyToContinue();
                }
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Obtained 20 gold!");

            System.out.println("You decided to go to the village.");
            System.out.println("");
            pressAnyKeyToContinue();
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("\t\t\t\t\t\t\t\t\t Brightwood Village");
            System.out.println("");
            System.out.println("");
            System.out.println("\t\t\t\t\t\t\t\t\t  Village of Peace");
            System.out.println("");
            System.out.println("");
            pressAnyKeyToContinue();
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("You enter the village.");
            while (state == true) {
                System.out.println("What are you going to do?");
                System.out.println("1. Visit Shop.");
                System.out.println("2. Visit Guild");

                if (!choice.hasNextInt()) {
                    System.out.println("Please enter number(1 & 2) only.");
                    System.out.println("");
                    choice.next();
                    continue;
                } else {
                    choices = choice.nextInt();
                    if (choices == 1) {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("You enter the shop.");
                        if (playerID == 1) {
                            Shop shop = new Shop(playeraa);
                        } else if (playerID == 2) {
                            Shop shop = new Shop(playeraa);
                        } else if (playerID == 3) {
                            Shop shop = new Shop(playeraa);
                        }

                    } else if (choices == 2) {
                        System.out.print("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("You enter the guild.");
                        while (status == true) {
                            System.out.println("Welcome to the Guild.");
                            System.out.println("Here are your quest.");
                            System.out.println("");
                            System.out.println("1. Ogre Subjugation Quest.");
                            System.out.println("2. Yeti Subjugation Quest.");
                            System.out.println("3. Orochi Subjugation Quest.");
                            System.out.println("4. Exit.");
                            if (!choice.hasNextInt()) {
                                System.out.println("Please enter number(1 & 2) only.");
                                System.out.println("");
                                choice.next();
                                continue;
                            } else {
                                choices = choice.nextInt();
                                if (choices == 1) {
                                    System.out.println("Ogre Subjugation Quest Has Started.");
                                    if (playerID == 1) {
                                        Battle battle = new Battle(playeraa, enemy1);
                                        playeraa.setGold(playeraa.getGold() + 20);
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        System.out.println("Ogre Subjugation Quest Completed");
                                        System.out.println("");
                                        System.out.println("Quest Reward 20 gold.");
                                        System.out.println("");
                                        pressAnyKeyToContinue();
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        status = false;
                                    } else if (playerID == 2) {
                                        Battle battle = new Battle(playeraa, enemy1);
                                        playeraa.setGold(playeraa.getGold() + 20);
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        System.out.println("Ogre Subjugation Quest Completed");
                                        System.out.println("");
                                        System.out.println("Quest Reward 20 gold.");
                                        System.out.println("");
                                        pressAnyKeyToContinue();
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        status = false;
                                    } else if (playerID == 3) {
                                        Battle battle = new Battle(playeraa, enemy1);
                                        playeraa.setGold(playeraa.getGold() + 20);
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        System.out.println("Ogre Subjugation Quest Completed");
                                        System.out.println("");
                                        System.out.println("Quest Reward 20 gold.");
                                        System.out.println("");
                                        pressAnyKeyToContinue();
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        status = false;
                                    }

                                } else if (choices == 2) {
                                    System.out.println("Yeti Subjugation Quest Has Started.");
                                    if (playerID == 1) {
                                        Battle battle = new Battle(playeraa, enemy2);
                                        playeraa.setGold(playeraa.getGold() + 40);
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        System.out.println("Yeti Subjugation Quest Completed");
                                        System.out.println("");
                                        System.out.println("Quest Reward 40 gold.");
                                        System.out.println("");
                                        pressAnyKeyToContinue();
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        status = false;
                                    } else if (playerID == 2) {
                                        Battle battle = new Battle(playeraa, enemy2);
                                        playeraa.setGold(playeraa.getGold() + 40);
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        System.out.println("Yeti Subjugation Quest Completed");
                                        System.out.println("");
                                        System.out.println("Quest Reward 40 gold.");
                                        System.out.println("");
                                        pressAnyKeyToContinue();
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        status = false;
                                    } else if (playerID == 3) {
                                        Battle battle = new Battle(playeraa, enemy2);
                                        playeraa.setGold(playeraa.getGold() + 40);
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        System.out.println("Yeti Subjugation Quest Completed");
                                        System.out.println("");
                                        System.out.println("Quest Reward 40 gold.");
                                        System.out.println("");
                                        pressAnyKeyToContinue();
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        status = false;
                                    }

                                } else if (choices == 3) {
                                    System.out.println("Orochi Subjugation Quest Has Started.");
                                    if (playerID == 1) {
                                        Battle battle = new Battle(playeraa, enemy3);
                                        playeraa.setGold(playeraa.getGold() + 60);
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        System.out.println("Orochi Subjugation Quest Completed");
                                        System.out.println("");
                                        System.out.println("Quest Reward 60 gold.");
                                        System.out.println("");
                                        pressAnyKeyToContinue();
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        status = false;
                                        state = false;
                                    } else if (playerID == 2) {
                                        Battle battle = new Battle(playeraa, enemy3);
                                        playeraa.setGold(playeraa.getGold() + 60);
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        System.out.println("Orochi Subjugation Quest Completed");
                                        System.out.println("");
                                        System.out.println("Quest Reward 60 gold.");
                                        System.out.println("");
                                        pressAnyKeyToContinue();
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        status = false;
                                        state = false;
                                    } else if (playerID == 3) {
                                        Battle battle = new Battle(playeraa, enemy1);
                                        playeraa.setGold(playeraa.getGold() + 60);
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        System.out.println("Orochi Subjugation Quest Completed");
                                        System.out.println("");
                                        System.out.println("Quest Reward 60 gold.");
                                        System.out.println("");
                                        pressAnyKeyToContinue();
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        status = false;
                                        state = false;
                                    } else if (playerID == 4) {
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();
                                        System.out.println("Thank you very much, Please come again!");
                                        System.out.println("");
                                        status = false;
                                        pressAnyKeyToContinue();
                                    }
                                } else {
                                    System.out.println("Please input 1 or 2 only.");
                                    System.out.println("");
                                    pressAnyKeyToContinue();
                                }
                            }
                        }
                    } else {
                        System.out.println("Please input 1 or 2 only.");
                        System.out.println("");
                        pressAnyKeyToContinue();
                    }
                }
            }

            System.out.println("You have defeated Orochi.");
            System.out.println("You have obtained the first right of the gods.");
            System.out.println("");
            System.out.println("To be continue.");
            System.out.println("");
            pressAnyKeyToContinue();
        }
    }
}