package J02106;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
       
    public static int n;

    public static void binMatrix(){
        n = in.nextInt();
        byte[][] a = new byte[n][3];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                a[i][j] = in.nextByte();
            }
        }

        int res = 0;
        for(int i = 0 ; i < n; i++){
            byte cnt = 0;
            for(int j = 0; j < 3; j++){
                if(a[i][j] == 1){
                    cnt++;
                }
            }
            if(cnt >= 2){
                res++;
            }
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        binMatrix();
        in.close();
    }
}
