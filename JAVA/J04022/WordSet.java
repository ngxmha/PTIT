package J04022;

import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> ts = new TreeSet<>();
    
    public WordSet(String s){
        String[] arrStr = s.split(" ");
        for(int i = 0; i < arrStr.length; i++){
            ts.add(arrStr[i].toLowerCase());
        }
    }
    
    public WordSet union(WordSet other){
        TreeSet<String> res = new TreeSet<>();
        res.addAll(ts);
        res.addAll(other.ts);
        String s = "";
        for(String x : res){
            s += x + " ";
        }
        return new WordSet(s);
    }
    
    public WordSet intersection(WordSet other){
        TreeSet<String> res = new TreeSet<>();
        res.addAll(ts);
        res.retainAll(other.ts);
        String s = "";
        for(String x : res){
            s += x + " ";
        }
        return new WordSet(s);
    }

    @Override
    public String toString() {
        String s = "";
        for(String x : ts){
            s += x + " ";
        }
        return s;
    }    
}
