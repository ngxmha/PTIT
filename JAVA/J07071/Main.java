package J07071;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = null;
        
        List<String> list = new ArrayList<>();
        
        try
        {
            sc = new Scanner(new File("DANHSACH.in"));
        }
        catch(FileNotFoundException ex)
        {}
        
        int T = sc.nextInt();
        sc.nextLine();
        while(T-- > 0)
        {
            String name = sc.nextLine();
            list.add(name);
        }
        
        list.sort(new Comparator<String>()
        {
            @Override
            public int compare(String s1, String s2)
            {
                String[] arr1 = s1.split(" ");
                String[] arr2 = s2.split(" ");
                if(arr1[arr1.length - 1].equals(arr2[arr2.length - 1]))
                    return arr1[0].compareTo(arr2[0]);
                return arr1[arr1.length - 1].compareTo(arr2[arr2.length - 1]);
            }
        });
        
        int q = sc.nextInt();
        while(q-- > 0)
        {
            String search = sc.next().toUpperCase();

            for(String name : list)
            {
                boolean check = true;
               
                String[] arrName = name.split(" ");
                String tmp = "";
                for(int i = 0; i < arrName.length - 1; i++)
                {
                    tmp += arrName[i].substring(0, 1) + ".";
                }
                tmp += arrName[arrName.length - 1].substring(0, 1);
                
                if(search.length() != tmp.length())
                    continue;
                else
                {
                    for(int i = 0; i < tmp.length(); i += 2)
                    {
                        if(search.charAt(i) == '*')
                            continue;
                        else
                        {
                            if(search.charAt(i) != tmp.charAt(i))
                            {
                                check = false;
                                break;
                            }
                        }
                    }
                }
                
                if(check)
                    System.out.println(name);
            }
        }
    }
}
