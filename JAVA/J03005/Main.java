package J03005;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    
    static void standardFullName(){
        String name = in.nextLine().trim();
        String[] s = name.split("\\s+");
        int i;
        for(i = 1; i < s.length - 1; i++){
            System.out.print(s[i].substring(0, 1).toUpperCase() + s[i].substring(1).toLowerCase() + " ");
        }
        System.out.print(s[i].substring(0, 1).toUpperCase() + s[i].substring(1).toLowerCase() + ", ");
        System.out.println(s[0].toUpperCase());
    }
    
    public static void main(String[] args) {
        int T = Integer.parseInt(in.nextLine());
        while(T-- > 0){
            standardFullName();
        }
        in.close();
    }
}
