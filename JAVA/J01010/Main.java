package J01010;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    
    public static void cutHalf(){
        String s = in.next();
        s = s.replace('8', '0');
        s = s.replace('9', '0');
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c != '0' && c != '1'){
                System.out.println("INVALID");
                return;
            }
        }
        long res = Long.parseLong(s);
        if(res == 0){
            System.out.println("INVALID");
            return;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int T = in.nextInt();
        while(T-- > 0){
            cutHalf();
        }

        in.close();
    }
}