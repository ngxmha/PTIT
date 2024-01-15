package J04016;

import java.util.Scanner;

public class Matrix {
    
    private int n;
    private int m;
    private int[][] arr;
    
    public Matrix(int n, int m)
    {
        this.n = n;
        this.m = m;
        arr = new int[n][m];
    }
    
    public void nextMatrix(Scanner sc)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();
        }
    }
            
    public Matrix mul(Matrix o)
    {
        Matrix matrix = new Matrix(n, o.m);
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                for(int k = 0; k < o.m; k++)
                {
                    matrix.arr[i][k] += arr[i][j] * o.arr[j][k]; 
                }
            }
        }
        
        return matrix;
    }
    
    @Override
    public String toString()
    {
        String res = "";
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                res += arr[i][j] + " ";
            }
            res += "\n";
        }
        
        return res;
    }
}
