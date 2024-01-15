package J07038;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc;
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Enterprise> enterprises = new ArrayList<>();

        try {
            sc = new Scanner(new File("SINHVIEN.in"));
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                String id = sc.next();
                sc.nextLine();
                String name = sc.nextLine();
                String group = sc.next();
                String email = sc.next();
                students.add(new Student(id, name, group, email));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return st1.getId().compareTo(st2.getId());
            }
        });

        try {
            sc = new Scanner(new File("DN.in"));
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                String id = sc.next();
                sc.nextLine();
                String name = sc.nextLine();
                int quantity = sc.nextInt();
                enterprises.add(new Enterprise(id, name, quantity));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            sc = new Scanner(new File("THUCTAP.in"));
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                String idStudent = sc.next();
                String idEnterprise = sc.next();
                for (Enterprise e : enterprises) {
                    if (e.getId().equals(idEnterprise)) {
                        for (Student st : students) {
                            if (st.getId().equals(idStudent)) {
                                st.setIdEnterprise(idEnterprise);
                                break;
                            }
                        }
                        break;
                    }
                }
            }

            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                String idEnterprise = sc.next();
                int limit = 0;

                for (Enterprise e : enterprises) {
                    if (e.getId().equals(idEnterprise)) {
                        System.out.println("DANH SACH THUC TAP TAI " + e.getName() + ":");
                        limit = e.getQuantity();
                        break;
                    }
                }

                int cnt = 0;
                for (Student st : students) {
                    if (st.getIdEnterprise() != null && st.getIdEnterprise().equals(idEnterprise)) {
                        if(cnt < limit) {
                            System.out.println(st);
                            cnt++;
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
