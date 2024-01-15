package J07060;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        
        Scanner sc = new Scanner(new File("MONTHI.in"));
        
        ArrayList<MonThi> list_monthi = new ArrayList<>();
        int n = sc.nextInt();
        while(n-- > 0)
        {
            String id = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            String form = sc.nextLine();
            list_monthi.add(new MonThi(id, name, form));
        }
        
        sc = new Scanner(new File("CATHI.in"));
        
        ArrayList<CaThi> list_cathi = new ArrayList<>();
        int m = sc.nextInt();
        while(m-- > 0)
        {
            String dateExam = sc.next();
            String timeExam = sc.next();
            String room = sc.next();
            list_cathi.add(new CaThi(dateExam, timeExam, room));
        }
        
        sc = new Scanner(new File("LICHTHI.in"));
        
        ArrayList<LichThi> list_lichthi = new ArrayList<>();
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String idCaThi = sc.next();
            String idMonThi = sc.next();
            String group = sc.next();
            int quantity = sc.nextInt();
            
            CaThi caThi = null;
            for(CaThi ca : list_cathi)
            {
                if(ca.getId().equals(idCaThi))
                {
                    caThi = ca;
                    break;
                }
            }
                    
            MonThi monThi = null;
            for(MonThi mon : list_monthi)
            {
                if(mon.getId().equals(idMonThi))
                {
                    monThi = mon;
                    break;
                }
            }
            
            list_lichthi.add(new LichThi(caThi, monThi, group, quantity));
        }
        
        Collections.sort(list_lichthi);
        
        for(LichThi l : list_lichthi)
        {
            System.out.println(l);
        }
    }
}
