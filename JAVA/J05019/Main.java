package J05019;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Place> places = new ArrayList<>();
        
        Set<String> set = new HashSet<>();
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            sc.nextLine();
            String name = sc.nextLine();
            String start = sc.nextLine();
            String end = sc.nextLine();
            int rain = sc.nextInt();
            
            int time = 0;
            try
            {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
                time = (int)(sdf.parse(end).getTime() - sdf.parse(start).getTime()) / 60000;

            }
            catch(ParseException ex)
            {}
            
            if(set.contains(name))
            {
                for(Place p : places)
                {
                    if(p.getName().equals(name))
                    {
                        p.setRain(p.getRain() + rain);
                        p.setTimeRain(p.getTimeRain() + time);
                    }
                }
            }
            else
            {
                set.add(name);
                places.add(new Place(name, rain, time));
            }
        }
        
        for(Place p : places)
        {
            System.out.println(p);
        }
    }
}
