package J02006;

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static int n, m;
   
    public static void unionArr(){
        n = in.nextInt();
        m = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] c = new int[1000];

        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
            c[a[i]] = 1;
        }
        for(int i = 0; i < m; i++){
            b[i] = in.nextInt();
            c[b[i]] = 1;
        }

        for(int i = 0; i < 1000; i++){
            if(c[i] == 1){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        unionArr();
        in.close();
    }
}