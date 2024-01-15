package J02007;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static int n;
    
    public static int[] cnt = new int[100001];

    public static void occurences(){
        n = in.nextInt();

        int[] a = new int[n]; 
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
            cnt[a[i]]++;
        }

        for(int i = 0; i < n; i++){
            if(cnt[a[i]] != 0){
                System.out.printf("%d xuat hien %d lan\n", a[i], cnt[a[i]]);
                cnt[a[i]] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int T = in.nextInt();
        int t = 1;
        while(t <= T){
            System.out.println("Test " + t + ":");
            occurences();
            t++;
        }
        in.close();
    }
}
