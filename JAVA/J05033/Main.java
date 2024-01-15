package J05033;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Time> arr = new ArrayList<Time>();
        short n = sc.nextShort();
        for(int i = 0; i < n; i++){
            byte hh = sc.nextByte();
            byte mm = sc.nextByte();
            byte ss = sc.nextByte();
            arr.add(new Time(hh, mm ,ss));
        }
        
        arr.sort(new Comparator<Time>(){
            @Override
            public int compare(Time t1, Time t2){
                return t1.getSumOfTime() - t2.getSumOfTime();
            }
        });
        for(Time t : arr){
            System.out.println(t);
        }
    }
}
