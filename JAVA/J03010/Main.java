package J03010;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static HashMap<String, Integer> hm = new HashMap<String, Integer>();
    
    static void emailAddress(){
        String[] s = in.nextLine().trim().split("\\s+");
        String email = s[s.length - 1].toLowerCase();
        
        for(int i = 0; i < s.length - 1; i++){
            email = email + s[i].substring(0, 1).toLowerCase();
        }
        if(hm.containsKey(email)){
            int fre = hm.get(email);
            fre++;
            hm.put(email, fre);
        } else {
            hm.put(email, 1);
        }
        
        int cnt = hm.get(email);
        email = email + (cnt == 1 ? "" : cnt) + "@ptit.edu.vn";
        System.out.println(email);
    }
    
    public static void main(String[] args) {
        int T = Integer.parseInt(in.nextLine());
        while(T-- > 0){
            emailAddress();
        }
        in.close();
    }
}
