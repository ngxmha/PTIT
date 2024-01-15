package J02105;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    
    public static int n;
    
    public static void adjacentList(){
        int n = in.nextInt();
        byte[][] a = new byte[n + 1][n + 1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                a[i][j] = in.nextByte();
            }
        }

        for(int i = 1; i <= n; i++){
            System.out.printf("List(%d) = ", i);
            for(int j = 1; j <= n; j++){
                if(a[i][j] == 1){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        adjacentList();
        in.close();
    }    
}
