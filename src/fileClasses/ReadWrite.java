package fileClasses;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

    // Nama : Setiawan Junior
    // NIM : 03082180037
    // method penyimpanan data (data chip, data menang, data kalah) untuk casino
public class ReadWrite {
    //Membaca data di record.txt
    public int read_data(int data) {
        String path = "Record.txt";
        String line = "";
        int number = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                number = Integer.parseInt(values[data]);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return number;
    }

    public static void write_data(String data) {
        //Menulis data tanpa overwrite di record.txt
        try {
            FileWriter fileWriter = new FileWriter("record.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data + "\n");
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void write_data_overwrite(String data) {
        //Menulis data dengan overwrite di record.txt
        try {
            FileWriter myWriter = new FileWriter("record.txt");
            myWriter.write(data);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
