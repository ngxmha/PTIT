package J07050;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        ArrayList<Product> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String name = sc.nextLine();
            String group = sc.nextLine();
            double purchase = Double.parseDouble(sc.nextLine());
            double price = Double.parseDouble(sc.nextLine());
            list.add(new Product(name, group, purchase, price));
        }
        
        list.sort(new Comparator<Product>(){
            @Override
            public int compare(Product p1, Product p2) {
                return (int)(p2.getProfit() - p1.getProfit());
            }
        });
        
        for(Product p : list){
            System.out.println(p);
        }
    }
}
