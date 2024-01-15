package J07007;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordSet {

    private ArrayList<String> list = new ArrayList<String>();

    public WordSet(String s) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(s));
        while (sc.hasNext()) {
            String c = sc.next().toLowerCase();
            if(!list.contains(c)){
                list.add(c);
            }
        }
        Collections.sort(list);
    }

    @Override
    public String toString() {
        String s = "";
        for(String i : list){
            s += i + "\n";
        }
        return s;
    }
}

