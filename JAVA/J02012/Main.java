package J02012;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }

        for(int i = 0; i < n; i++){
            int minVal = a[i], minPos = i - 1;
            while(minPos >= 0 && a[minPos] > minVal){
                a[minPos + 1] = a[minPos];
                minPos--;
            }
            a[minPos + 1] = minVal;
            System.out.print("Buoc " + i + ": ");
            for(int j = 0; j <= i; j++){
                System.out.print(a[j] + " ");
            }
            System.out.println(); 
        }
        in.close();
    }
}
