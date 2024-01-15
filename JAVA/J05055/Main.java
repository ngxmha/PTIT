package J05055;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        ArrayList<Candidate> candidates = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++)
        {
            sc.nextLine();
            String name = sc.nextLine();
            String dob = sc.next();
            String begin = sc.next();
            String finish = sc.next();
            candidates.add(new Candidate(name, dob, begin, finish));
        }
        
        Collections.sort(candidates);
        
        candidates.get(0).setRank(1);
        
        for(int i = 1; i < candidates.size(); i++)
        {
            Candidate c1 = candidates.get(i - 1);
            Candidate c2 = candidates.get(i);
            if(c1.thanhTichXepHang() == c2.thanhTichXepHang())
                c2.setRank(c1.getRank());
            else 
                c2.setRank(i + 1);
        }
        
        Collections.sort(candidates, new Comparator<Candidate>()
        {
            @Override
            public int compare(Candidate c1, Candidate c2)
            {
                return c1.getId().compareTo(c2.getId());
            }
        });
        
        for(Candidate c : candidates)
        {
            System.out.println(c);
        }
    }
}
