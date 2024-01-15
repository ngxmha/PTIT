package J07048;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        ArrayList<Product> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            int guarantee = Integer.parseInt(sc.nextLine());
            list.add(new Product(id, name, price, guarantee));
        }
        
        list.sort(new Comparator<Product>(){
            @Override
            public int compare(Product p1, Product p2) {
                if(p1.getPrice() == p2.getPrice()){
                    return p1.getId().compareTo(p2.getId());
                } else {
                    return p2.getPrice() - p1.getPrice();
                }
            }
        });
        
        for(Product p : list){
            System.out.println(p);
        }
    }
}
