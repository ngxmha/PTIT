package J07046;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        ArrayList<Customer> list = new ArrayList<>();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String nameCus = sc.nextLine();
            String room = sc.nextLine();
            Date dayArrive = df.parse(sc.nextLine());
            Date dayPart = df.parse(sc.nextLine());
            int dayStay = (int)((dayPart.getTime() - dayArrive.getTime()) / (1000l * 60 * 60 * 24));
            list.add(new Customer(nameCus, room, dayStay));
        }
                
        list.sort(new Comparator<Customer>(){
           @Override
           public int compare(Customer c1, Customer c2){
               return (int)(c2.getDayStay() - c1.getDayStay());
           }
        });
        
        for(Customer c : list){
            System.out.println(c);
        }
    }
}
