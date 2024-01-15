package J02034;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    
    public static int n;
    public static int[] a = new int[101];

    public static void implement(){
        n = in.nextInt();
        int[] b = new int[201];
        boolean check = false;

        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
            b[a[i]] = 1;
        }
        for(int i = 1; i <= a[n - 1]; i++){
            if(b[i] == 0){
                check = true;
                System.out.println(i);
            }
        }

        if(!check){
            System.out.println("Excellent!");
        }

    }
    public static void main(String[] args) {
        implement();
        in.close();
    }    
}
