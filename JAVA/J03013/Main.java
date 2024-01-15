package J03013;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte T = sc.nextByte();
        while(T-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            String diff = a.subtract(b).abs().toString();
            
            int len = Math.max(a.toString().length(), b.toString().length());
            while(diff.length() < len){
                diff = "0" + diff;
            }
            System.out.println(diff);
        }
    }
}
