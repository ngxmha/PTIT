package J02020;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    
    public static int n, k, cnt = 0;
    public static int[] x = new int[10];

    public static void out(){
        for(int i = 1; i <= k; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    public static void Try(int i){
        for(int j = x[i - 1] + 1; j <= n - k + i; j++){
            x[i] = j;
            if(i == k){
                cnt++;
                out();
            } else {
                Try(i + 1);
            }
        }
    }
    public static void main(String[] args) {
        n = in.nextInt();
        k = in.nextInt();
        Try(1);
        System.out.printf("Tong cong co %d to hop", cnt);
        in.close();
    }
}
