package J07004;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] a = new int[1000];
        
        while(sc.hasNext()){
            int x = Integer.parseInt(sc.next());
            a[x]++;
        }
        for(int i = 0; i < 1000; i++){
            if(a[i] > 0){
                System.out.printf("%d %d\n", i, a[i]);
            }
        }
    }
}
