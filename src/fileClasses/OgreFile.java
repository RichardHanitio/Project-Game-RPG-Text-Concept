package fileClasses;
import java.io.*;
import java.util.ArrayList;

import enemysubclasses.*;

//Nama  : Calvin Wendy
//NIM   : 03082200010
//Penyimpanan data ogre goblin
public class OgreFile {
    public File ogreData;
    public ArrayList<Ogre> ogreList = new ArrayList<Ogre>();

    //Check ketersediaan file
    public OgreFile(){
        ogreData = createFile();
    }

    //Membuat file baru
    public File createFile(){
        File ogreData = new File("OgreData.txt");

        try {
            if(ogreData.createNewFile()){
                System.out.println("File Created : " + ogreData.getName());
                return ogreData;
            }
            else{
                System.out.println("File Already Exists");
                return ogreData;
            }
        } catch (IOException e) {
            System.out.println("Error : " );
            e.printStackTrace();
        }
        return ogreData;
    }

    //Method untuk menuliskan data ogre kedalam File
    public void writeOgreData(Ogre ogre){
        try {
            BufferedWriter writeData = new BufferedWriter(new FileWriter(ogreData,true));
            writeData.write(ogre.saveString());
            writeData.newLine();
            writeData.close();
        } catch (IOException e) {
            System.out.println("Error : ");
            e.printStackTrace();
        }
    }

    //Method untuk membaca data ogre yang ada didalam file
    public void readOgreData(){
        try {
            BufferedReader readData = new BufferedReader(new FileReader(ogreData));
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

    //Method membaca file untuk dijadikan object ogre
    public void toOgreObject(){
        try {
            BufferedReader readData = new BufferedReader(new FileReader(ogreData));
            String nama;
            int health;
            int attackP;
            int resistSTR;
            int resistINT;

            String s;
            while((s = readData.readLine()) != null){
                String[] datas = s.split("-");
            
                    nama = datas[0];
                    health = Integer.parseInt(datas[1]);
                    attackP = Integer.parseInt(datas[2]);
                    resistSTR = Integer.parseInt(datas[3]);
                    resistINT = Integer.parseInt(datas[4]);
                    Ogre ogre = new Ogre(nama, health, attackP, resistSTR, resistINT);
                    ogreList.add(ogre);
                }
            readData.close();

        } catch (IOException e) {
            System.out.println("ERROR : ");
            e.printStackTrace();
        }
    }
}
