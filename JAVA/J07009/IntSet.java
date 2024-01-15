package J07009;

import java.util.TreeSet;

public class IntSet 
{
    private TreeSet<Integer> treeSet;
    
    public IntSet(int a[])
    {
        treeSet = new TreeSet<>();
        for(int i = 0; i < a.length; i++)
        {
            treeSet.add(a[i]);
        }
    }
    
    public IntSet intersection(IntSet o)
    {
        TreeSet<Integer> tmp = new TreeSet<>();
        
        tmp.addAll(treeSet);
        tmp.retainAll(o.treeSet);
        
        int[] arr = new int[tmp.size()];
        int index = 0;
        for(Integer i : tmp)
            arr[index++] = i;
        
        return new IntSet(arr);
    }
    
    @Override
    public String toString()
    {
        String res = "";
        for(Integer i : treeSet)
            res += i + " ";
        
        return res;
    }
}
