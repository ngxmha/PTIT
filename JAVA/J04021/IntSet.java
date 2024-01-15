package J04021;

import java.util.TreeSet;

public class IntSet {
    private TreeSet<Integer> arr = new TreeSet<>();
    
    public IntSet(int[] a){
        for(int i = 0; i < a.length; i++){
            arr.add(a[i]);
        }
    }
    
    public IntSet union(IntSet other){
        TreeSet<Integer> ts = new TreeSet<>();
        ts.addAll(arr);
        ts.addAll(other.arr);
        
        int i = 0;
        int[] a = new int[ts.size()];
        for(Integer x : ts){
            a[i++] = x;
        }
        return new IntSet(a);
    }
    
    @Override
    public String toString(){
        String s = "";
        for(Integer x : arr){
            s += x + " ";
        }
        return s;
    }
}
