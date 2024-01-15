package J07051;

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
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList<Customer> list = new ArrayList<>();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String cusName = sc.nextLine();
            int room = Integer.parseInt(sc.nextLine());
            Date dayArrive = df.parse(sc.nextLine()); 
            Date dayPart = df.parse(sc.nextLine());
            int serviceFee = Integer.parseInt(sc.nextLine());
            list.add(new Customer(cusName, room, dayArrive, dayPart, serviceFee));
        }
        
        list.sort(new Comparator<Customer>(){
            @Override
            public int compare(Customer c1, Customer c2){
                return c2.getTotalMoney() - c1.getTotalMoney();
            }
        });
        
        for(Customer c : list){
            System.out.println(c);
        }
    }
}
