package fileClasses;
import mainclasses.*;
import playersubclasses.*;
import java.io.*;
import java.util.ArrayList;


/*
    Nama : Richard Hanitio
    NIM : 03082200014
*/
//Menyimpan data-data player yang telah dibuat
public class PlayerFile {

    private ArrayList<Player> listPlayers = new ArrayList<Player>();
    private ArrayList<Player> loadPlayers = new ArrayList<Player>();
    
    // function untuk write data ke file
    // create file secara otomatis apabila tidak ada
    public void writePlayerData(ArrayList<Player> players) {
        this.listPlayers = players;
        try {
            BufferedWriter bw = new BufferedWriter(
                new FileWriter("PlayersData.txt")
            );
            for (Player item : listPlayers){
                bw.write(item.toSaveString() + "\n");
            }            
            bw.close();
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }


    //function untuk read data dri file
    public void readPlayerData() {
        try {
            BufferedReader br = new BufferedReader(
                new FileReader("PlayersData.txt")
            );
            String s;
            while ((s = br.readLine()) != null){
                System.out.println(s);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    //function utk mengubah data yang disimpan menjadi object
    public void convertPlayerDataToObject() {
        String name;
        int health, mana, attSTR, attINT;

        try {
            BufferedReader br = new BufferedReader(
                new FileReader("PlayersData.txt")
            );
            String s;
            while ((s = br.readLine()) != null){
                String[] datas = s.split("-");
                name = datas[0];
                health = Integer.parseInt(datas[1]);
                mana = Integer.parseInt(datas[2]);
                attSTR = Integer.parseInt(datas[3]);
                attINT = Integer.parseInt(datas[4]);
                if (name.equals("Assassin")){
                    Assassin assassin = new Assassin(name, health, mana, attSTR, attINT);
                    loadPlayers.add(assassin);
                } else if (name.equals("Fighter")){
                    Fighter fighter = new Fighter(name, health, mana, attSTR, attINT);
                    loadPlayers.add(fighter);
                } else if (name.equals("Ranger")){
                    Ranger ranger = new Ranger(name, health, mana, attSTR, attINT);
                    loadPlayers.add(ranger);
                } else if (name.equals("Wizard")){
                    Wizard wizard = new Wizard(name, health, mana, attSTR, attINT);
                    loadPlayers.add(wizard);
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    //ambil objek2nya
    public ArrayList<Player> retrievePlayer() {
        return this.loadPlayers;
    }

}



