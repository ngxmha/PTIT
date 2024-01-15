package J01001;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);     
        int l = in.nextInt();
        int w = in.nextInt();
        
        if(l <= 0 || w <= 0){
            System.out.println("0");
        } else {
            System.out.println((l + w) * 2 + " " + l * w);
        }

        in.close();
    }
}
