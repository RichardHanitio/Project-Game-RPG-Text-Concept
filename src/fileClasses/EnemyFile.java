package fileClasses;
import java.io.*;
import java.util.ArrayList;

import enemysubclasses.*;
import mainclasses.Enemy;

//Nama  : Ricky
//NIM   : 03082200012
//Penyimpanan data enemy
public class EnemyFile {
    public File enemyDat;
    public ArrayList<Enemy> enemyList = new ArrayList<Enemy>();


    public EnemyFile(){
        enemyDat = createFile();
    }

    public File createFile(){
        File enemyData = new File("EnemyData.txt");

        try {
            if(enemyData.createNewFile()){
                System.out.println("File Created : " + enemyData.getName());
                return enemyData;
            }
            else{
                System.out.println("File Already Exists");
                return enemyData;
            }
        } catch (IOException e) {
            System.out.println("Error : " );
            e.printStackTrace();
        }
        return enemyData;
    }


    public void writeEnemyData(Enemy enemy){
        try {
            BufferedWriter writeData = new BufferedWriter(new FileWriter(enemyDat,true));
            writeData.write(enemy.saveString());
            writeData.newLine();
            writeData.close();
        } catch (IOException e) {
            System.out.println("Error : ");
            e.printStackTrace();
        }
    }

    public void readEnemyData(){
        try {
            BufferedReader readData = new BufferedReader(new FileReader(enemyDat));
            String s;
            while((s = readData.readLine()) != null){
                System.out.println(s); 
            }
            readData.close();
        } catch (IOException e) {
            System.out.println("Error : ");
            e.printStackTrace();
        }
    }

    public void toEnemyObject(){
        try {
            BufferedReader readData = new BufferedReader(new FileReader(enemyDat));
            String nama;
            int health;
            int attackP;
            int resistSTR;
            int resistINT;

            String s;
            while((s = readData.readLine()) != null){
                String[] datas = s.split("-");


                if(datas[0].equals("Yamata no Orochi")){

                    nama = datas[0];
                    health = Integer.parseInt(datas[1]);
                    attackP = Integer.parseInt(datas[2]);
                    resistSTR = Integer.parseInt(datas[3]);
                    resistINT = Integer.parseInt(datas[4]);
                    Enemy orochi = new Orochi(nama, health, attackP, resistSTR, resistINT);
                    enemyList.add(orochi);

                }
                else if(datas[0].equals("Ogre")){

                    nama = datas[0];
                    health = Integer.parseInt(datas[1]);
                    attackP = Integer.parseInt(datas[2]);
                    resistSTR = Integer.parseInt(datas[3]);
                    resistINT = Integer.parseInt(datas[4]);
                    Enemy ogre = new Ogre(nama, health, attackP, resistSTR, resistINT);
                    enemyList.add(ogre);

                }
                else if(datas[0].equals("Yeti")){

                    nama = datas[0];
                    health = Integer.parseInt(datas[1]);
                    attackP = Integer.parseInt(datas[2]);
                    resistSTR = Integer.parseInt(datas[3]);
                    resistINT = Integer.parseInt(datas[4]);
                    Enemy yeti = new Yeti(nama, health, attackP, resistSTR, resistINT);
                    enemyList.add(yeti);

                }
                else if(datas[0].equals("Slime")){
                    nama = datas[0];
                    health = Integer.parseInt(datas[1]);
                    attackP = Integer.parseInt(datas[2]);
                    resistSTR = Integer.parseInt(datas[3]);
                    resistINT = Integer.parseInt(datas[4]);
                    Enemy slime = new Slime(nama, health, attackP, resistSTR, resistINT);
                    enemyList.add(slime);
                }
            }

        } catch (IOException e) {
            System.out.println("ERROR : ");
            e.printStackTrace();
        }
    }
}
