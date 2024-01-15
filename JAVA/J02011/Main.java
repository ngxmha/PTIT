package J02011;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = in.nextInt();
        int[] a = new int[n];
        
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        for(int i = 0; i < n - 1; i++){
            int minPos = i;
            for(int j = i + 1; j < n; j++){
                if(a[j] < a[minPos]){
                    minPos = j;
                }
            }
            int tmp = a[i];
                a[i] = a[minPos];
                a[minPos] = tmp;
                System.out.print("Buoc " + (i + 1) + ": ");
                for(int k = 0; k < n; k++){
                    System.out.print(a[k] + " ");
                }
                System.out.println();
        }
        in.close();
    }
}
