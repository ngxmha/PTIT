package J07024;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set;
    

    public WordSet(String file) throws IOException {
        Scanner sc = new Scanner(new File(file));
        set = new TreeSet<>();
        
        while(sc.hasNext())
        {
            set.add(sc.next().toLowerCase());
        }
    }
    
    public WordSet(TreeSet<String> set)
    {
        this.set = set;
    }
    
    public WordSet difference(WordSet o)
    {
        TreeSet<String> tmp = new TreeSet<>(set);
        tmp.removeAll(o.set);
        return new WordSet(tmp);
    }
    
    @Override
    public String toString()
    {
        String res = "";
        
        for(String s : set)
        {
            res += s + " ";
        }
        
        return res;
    }
}
