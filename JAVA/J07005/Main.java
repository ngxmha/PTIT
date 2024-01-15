package J07005;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        
        int[] arr = new int[1000];

        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream("DATA.IN"));
            for (int i = 0; i < 100000; i++) {
                arr[dataInputStream.readInt()]++;
            }
            dataInputStream.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        for(int i = 0; i < 1000; i++) {
            if(arr[i] > 0) {
                System.out.println(i + " " + arr[i]);
            }
        }
    }
}
