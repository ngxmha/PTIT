package J05072;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<City> citys = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int giaCuoc = sc.nextInt();
            citys.add(new City(id, name, giaCuoc));
        }
        citys.add(new City(0, "Noi mang", 800));
        
        ArrayList<Phone> phones = new ArrayList<>();
        
        int m = sc.nextInt();
        for(int i = 0; i < m; i++)
        {
            String thueBao = sc.next();
            String begin = sc.next();
            String finish = sc.next();
            phones.add(new Phone(thueBao, begin, finish));
        }
        
        for(Phone p : phones)
        {
            if(p.getThueBao().charAt(0) != '0')
                p.setCity(citys.get(citys.size() - 1));
            else 
            {
                for(City c : citys)
                {
                    if(Integer.parseInt(p.getThueBao().substring(1, 3)) == c.getId())
                    {
                        p.setCity(c);
                        break;
                    }
                }
            }
        }
        
        Collections.sort(phones);
        
        for(Phone p : phones)
        {
            System.out.println(p);
        }
    }
}
