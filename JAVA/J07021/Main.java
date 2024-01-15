package J07021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String s = sc.nextLine().trim();
            if(s.equals("END")){
                break;
            }
            String[] a = s.split("\\s+");
            for(int i = 0; i < a.length; i++){
                System.out.print(a[i].substring(0, 1).toUpperCase()+ a[i].substring(1).toLowerCase() + " ");
            }
            System.out.println();
        }
    }
}
