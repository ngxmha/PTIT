package J05064;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher> teachers = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int basicSalary = Integer.parseInt(sc.nextLine());
            teachers.add(new Teacher(id, name, basicSalary));
        }
        
        int[] mark = {0, 0};
        for(Teacher t : teachers) {
            if(t.getId().substring(0, 2).equals("HT")) {
                if(mark[0] == 0)
                    mark[0] = 1;
                else
                    continue;
            } else if(t.getId().substring(0, 2).equals("HP")) {
                if(mark[1] < 2)
                    mark[1]++;
                else
                    continue;
            }
            System.out.println(t);
        }
    }
}
