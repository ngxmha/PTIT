package J07006;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;



public class Main {
    
    public static void main(String[] args) {
        
        int[] arr = new int[1000];
        
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("DATA.in"));
            ArrayList<Integer> arrayList = (ArrayList<Integer>)objectInputStream.readObject();
            for(int i = 0; i < arrayList.size(); i++) {
                arr[arrayList.get(i)]++;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        for(int i = 0; i < 1000; i++) {
            if(arr[i] > 0) {
                System.out.println(i + " " + arr[i]);
            }
        }
    }
}
