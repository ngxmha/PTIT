package J02010;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = in.nextInt();
        int[] a = new int[n];
        int step = 0;
        
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++){
            boolean check = false;
            for(int j = i + 1; j < n; j++){
                if(a[i] > a[j]){
                    check = true;
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            if(check){
                step++;
                System.out.print("Buoc " + step + ": ");
                for(int k = 0; k < n; k++){
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
        }
        in.close();
    }
}
