package J05081;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> arr = new ArrayList<Product>();
        byte M = Byte.parseByte(sc.nextLine());
        for(int i = 0;  i < M; i++){
            String name = sc.nextLine();
            String unit = sc.nextLine();
            int priceBuy = Integer.parseInt(sc.nextLine());
            int priceSell = Integer.parseInt(sc.nextLine());
            arr.add(new Product(name, unit, priceBuy, priceSell));
        }
        
        arr.sort(new Comparator<Product>(){
            @Override
            public int compare(Product p1, Product p2){
                if(p1.getProfit() == p2.getProfit()){
                    return p1.getId().compareTo(p2.getId());
                } else {
                    return -(p1.getProfit() - p2.getProfit());
                }
            }
        });
        for(Product p : arr){
            System.out.println(p);
        }
    }
}
