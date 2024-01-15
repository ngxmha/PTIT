package J04013;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String code = in.nextLine();
        String name = in.nextLine();
        float markMath = in.nextFloat();
        float markPhys = in.nextFloat();
        float markChem = in.nextFloat();
        Candidate c = new Candidate(code, name, markMath, markPhys, markChem);
        System.out.println(c);
        in.close();
    }

}