package J07076;

import java.io.File;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        Scanner sc = null;
        
        try 
        {
            sc = new Scanner(new File("MATRIX.in"));
        } 
        catch (Exception e) 
        {}
        
        int t = sc.nextInt();
        for(int j = 0; j < t; j++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int i = sc.nextInt();
            
            int[][] arr = new int[n + 1][m + 1];
            for(int u = 1; u <= n; u++)
            {
                for(int v = 1; v <= m; v++)
                {
                    arr[u][v] = sc.nextInt();
                }
            }
            
            for(int u = 1; u < n; u++)
            {
                for(int v = u + 1; v <= n; v++)
                {
                    if(arr[u][i] > arr[v][i])
                    {
                        int tmp = arr[u][i];
                        arr[u][i] = arr[v][i];
                        arr[v][i] = tmp;
                    }
                }
            }
            
            for(int u = 1; u <= n; u++)
            {
                for(int v = 1; v <= m; v++)
                {
                    System.out.print(arr[u][v] + " ");
                }
                System.out.println("");
            }
        }
    }
}
