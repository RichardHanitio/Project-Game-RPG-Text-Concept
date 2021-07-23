package mainclasses;
import mainclasses.*;
import playersubclasses.*;

import java.util.ArrayList;

import enemysubclasses.*;
import fileClasses.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Story story = new Story();
        // story.story2();
        // Enemy slime = new Slime();
        // Player a = new Fighter("aaaa");
        // Battle abc = new Battle(a,slime);




        //--Test Sort Selection Sort
        // Sort sort = new Sort();
        // Enemy enemy1 = new Ogre();
        // Enemy enemy2 = new Yeti();
        // Enemy enemy3 = new Orochi();
        // Enemy enemy4 = new Slime();
        // Enemy listENEMY[] = {enemy1,enemy2,enemy3,enemy4};
        // Enemy sorted[] = sort.selectionSort(listENEMY);
        // // for(Enemy a : sorted){
        // //     System.out.println(a.toString());
        // // }



        //--Test Subclass Assassin--
        // // Player player = new Assassin("Ninja");
        // // Enemy enemy = new Orochi();
        // // Battle battle = new Battle(player, enemy);
        


        //--Test Sort Bubble Sort--
        // // Sort sort = new Sort();
        // Player assassin = new Assassin("Assassin");
        // Player fighter = new Fighter("Fighter");
        // Player ranger = new Ranger("Ranger");
        // Player wizard = new Wizard("Wizard");
        // // Player[] players = {assassin, fighter, ranger, wizard};
        // // Player[] sortedPlayers = sort.bubbleSort(players);
        // // int i = 1;
        // // System.out.println("LARGEST TO SMALLEST PLAYER HEALTH : ");
        // // for(Player p : sortedPlayers){
        // //     System.out.println(i+ ". \n" + p.printOriginalString()+"\n");
        // //     i++;
        // // }
        
        //--Test Sort Shell Sort
        // Sort sort = new Sort();
        // Enemy enemy1 = new Ogre();
        // Enemy enemy2 = new Yeti();
        // Enemy enemy3 = new Orochi();
        // Enemy enemy4 = new Slime();
        // Enemy listENEMY[] = {enemy1,enemy2,enemy3,enemy4};
        // Enemy sorted[] = sort.shellSort(listENEMY);
        // for(Enemy a : sorted){
        //     System.out.println(a.toString());
        // }


        //--Test Exception Handling StoryUAS--
        // // StoryUAS storyuas = new StoryUAS();
        // // storyuas.story2();
        



        // --Test Read & Write Enemy--
        // Enemy enemy1 = new Ogre();
        // Enemy enemy2 = new Yeti();
        // Enemy enemy3 = new Orochi();
        // Enemy enemy4 = new Slime();
        // EnemyFile enemyDatas = new EnemyFile();
        // // // for (int i =0; i < 4; i++){
        // // //     enemyDatas.writeEnemyData(sorted[i]);
        // // // }
        // enemyDatas.readEnemyData();
        // enemyDatas.toEnemyObject();
        // for(Enemy a : enemyDatas.enemyList){System.out.println(a.toString());}
        // // Enemy baru = enemyDatas.enemyList.get(0);
        // // Battle test= new Battle (assassin,baru);
        // // System.out.println(enemyDatas.enemyList.get(1).toString());



        //--Test Read & Write Player--
        // Player assassin = new Assassin("Assassin");
        // Player fighter = new Fighter("Fighter");
        // Player ranger = new Ranger("Ranger");
        // Player wizard = new Wizard("Wizard");
        // PlayerFile pf = new PlayerFile();
        // ArrayList<Player> arrlistPlayers = new ArrayList<Player>();
        // arrlistPlayers.add(assassin);
        // arrlistPlayers.add(fighter);
        // arrlistPlayers.add(ranger);
        // arrlistPlayers.add(wizard);
        // pf.writePlayerData(arrlistPlayers);
        // pf.readPlayerData();
        // pf.convertPlayerDataToObject();
        // for(Player ply : pf.retrievePlayer()){
        //     System.out.println(ply.printOriginalString());
        // }


        // --Test Read & Write Ogre--
        // Ogre ogre1 = new Ogre("Ricky");
        // Ogre ogre2 = new Ogre("Richard");
        // Ogre ogre3 = new Ogre("Setiawan");
        // Ogre ogre4 = new Ogre("Calvin");
        // OgreFile ogreDatas = new OgreFile();
        // // ogreDatas.writeOgreData(ogre1);
        // // ogreDatas.writeOgreData(ogre2);
        // // ogreDatas.writeOgreData(ogre3);
        // // ogreDatas.writeOgreData(ogre4);
        // ogreDatas.readOgreData();
        // ogreDatas.toOgreObject();
        // for(Enemy a : ogreDatas.ogreList){System.out.println(a.toString());}
    }
    
    public static void clearScreen() {
        //to clear screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


}
