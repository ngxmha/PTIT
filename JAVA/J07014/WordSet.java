package J07014;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet 
{
    private TreeSet<String> treeSet;

    public WordSet(TreeSet<String> treeSet)
    {
        this.treeSet = treeSet;
    }
    
    public WordSet(String s) throws IOException
    {
        treeSet = new TreeSet<String>();
        Scanner sc = new Scanner(new File(s));
        
        while(sc.hasNext())
        {
            treeSet.add(sc.next().toLowerCase());
        }
    }
    
    public WordSet union(WordSet w)
    {
        TreeSet<String> tmp = new TreeSet<>();
        
        tmp.addAll(treeSet);
        tmp.addAll(w.treeSet);
        
        return new WordSet(tmp);
    }
    
    public WordSet intersection(WordSet w)
    {
        TreeSet<String> tmp = new TreeSet<>();
        
        tmp.addAll(treeSet);
        tmp.retainAll(w.treeSet);
        
        return new WordSet(tmp);
    }
    
    @Override
    public String toString()
    {
        String res = "";
        for(String s : treeSet)
        {
            res += s + " ";
        }
        return res;
    }
}
