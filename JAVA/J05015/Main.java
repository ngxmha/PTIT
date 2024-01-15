package J05015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<RacingBoy> racingboys = new ArrayList<>();

        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            String area = sc.nextLine();
            String time = sc.next();
            racingboys.add(new RacingBoy(name, area, time));
        }

        Collections.sort(racingboys);

        for(RacingBoy rb : racingboys) {
            System.out.println(rb);
        }
    }
}
