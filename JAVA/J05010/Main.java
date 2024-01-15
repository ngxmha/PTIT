package J05010;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> arr = new ArrayList<>();
        int n =  Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());
            arr.add(new Product(s1, s2, a, b));
        }
        
        arr.sort(new Comparator<Product>(){
            @Override
            public int compare(Product p1, Product p2){
                return -(int)(p1.getProfit() - p2.getProfit());
            }
        });
        
        for(Product p : arr){
            System.out.println(p);
        }
    }
}
