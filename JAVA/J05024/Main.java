package J05024;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String stClass = sc.nextLine();
            String email = sc.nextLine();
            list.add(new Student(id, name, stClass, email));
        }
        
        int q = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < q; i++) {
            String s = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + s.toUpperCase() + ":");
            String search = "";
            String[] arr = s.split(" ");
            search += arr[0].substring(0, 1).toUpperCase() + arr[1].substring(0, 1).toUpperCase();
            for(Student st : list) {
                if(st.getId().substring(5, 7).equals(search)) {
                    if(!((search.equals("AT") || search.equals("CN")) && st.getStClass().charAt(0) == 'E')) {
                         System.out.println(st);
                    }
                }
            }
        }
    }
}