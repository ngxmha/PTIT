package J02014;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    
    public static int n;
    public static int[] a = new int[1000001]; 

    public static void balancedPoint(){
        n = in.nextInt();
        int sum = 0, sum1 = 0, res = -1;

        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
            sum += a[i];
        }
        for(int i = 0; i < n; i++){
            sum1 += a[i];
            if(sum1 == sum - sum1 + a[i]){
                res = i + 1;
                break;
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int T = in.nextInt();
        while(T-- > 0){
            balancedPoint();
        }
        in.close();
    }
}
