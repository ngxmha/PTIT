package J02004;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    
    public static void symmetricArray(){
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }

        int l = 0, r = n - 1;
        while(l < r){
            if(a[l] != a[r]){
                System.out.println("NO");
                return;
            }
            l++;
            r--;
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        int T = in.nextInt();
        while(T-- > 0){
            symmetricArray();
        }
    
        in.close();
    }
}
