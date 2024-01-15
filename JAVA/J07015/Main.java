package J07015;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
    
    static int[] prime = new int[10000];
    
    static void makePrime() {
        for(int i = 2; i < 10000; i++) {
            prime[i] = 1;
        }
        for(int i = 2; i <= 100; i++) {
            if(prime[i] == 1) {
                for(int j = i * i; j < 10000; j += i) {
                    prime[j] = 0;
                }
            }
        } 
    }

    
    public static void main(String[] args) {
        
        makePrime();
        int[] arr = new int[10000];
        
        try {
            ObjectInputStream  objectInputStram = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
            ArrayList<Integer> arrayList = (ArrayList<Integer>)objectInputStram.readObject();
            for(Integer i : arrayList) {
                if(arr[i] > 0) {
                    arr[i]++;
                } else {
                    if(prime[i] == 0) {
                        continue;
                    } else {
                        arr[i]++;
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        for(int i = 2; i < 10000; i++) {
            if(arr[i] > 0) {
                System.out.println(i + " " + arr[i]);
            }
        }
    }
}
