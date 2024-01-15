package J08022;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    static Scanner sc = new Scanner(System.in);
    
    static void firstRightElement() {
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        
        Stack<Integer> st = new Stack<>();
        int[] r = new int[N];
        for(int i = N - 1; i >= 0; i--) {
            if(st.empty()) {
                r[i] = -1;
                st.add(a[i]);
            } else {
                while(!st.empty() && a[i] >= st.peek()) {
                    st.pop();
                }
                if(st.empty()) {
                    r[i] = -1;
                } else {
                    r[i] = st.peek();
                }
                st.add(a[i]);
            }
        }
        for(int i = 0; i < N; i++){
            System.out.print(r[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        while(T-- > 0) {
            firstRightElement();
        }
    }
}
