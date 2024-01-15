package J02101;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    
    public static int n;
    public static int[][] a = new int[100][100];

    public static void printMatrix(){
        n = in.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                for(int j = 0; j < n; j++){
                    System.out.print(a[i][j] + " ");
                }
            } else {
                for(int j = n - 1; j >= 0; j--){
                    System.out.print(a[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int T = in.nextInt();
        while(T-- > 0){
            printMatrix();
        }
        in.close();
    }
}
