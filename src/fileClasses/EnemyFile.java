package fileClasses;
import java.io.*;
import mainclasses.Enemy;

//Nama  : Ricky
//NIM   : 03082200012
//Penyimpanan data enemy
public class EnemyFile {
    File enemyDat;
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
            writeData.write(enemy.toString() + "|");
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
}
