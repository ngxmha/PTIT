package J07037;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        ArrayList<Enterprise> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int quantity = Integer.parseInt(sc.nextLine());
            list.add(new Enterprise(id, name, quantity));
        }
        
        list.sort(new Comparator<Enterprise>(){
            @Override
            public int compare(Enterprise e1, Enterprise e2){
                return e1.getId().compareTo(e2.getId());
            }
        });
        
        for(Enterprise e : list){
            System.out.println(e);
        }
    }
}
