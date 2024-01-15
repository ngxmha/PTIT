package HELLOJAR;

import java.util.ArrayList;
import java.util.Scanner;

public class PaymentController {
    private Invoice inv;
    
    public Invoice getInvoice(){
        Scanner sc = new Scanner(System.in);
        
        String codeSt = sc.nextLine();
        String nameSt = sc.nextLine();
        Student st = new Student(codeSt, nameSt);
        
        byte n = Byte.parseByte(sc.nextLine());
        ArrayList<Subject> arr = new ArrayList<Subject>();
        for(int i = 0; i < n; i++){
            String codeSub = sc.nextLine();
            String nameSub = sc.nextLine();
            byte credits = Byte.parseByte(sc.nextLine());
            arr.add(new Subject(codeSub, nameSub, credits));
        }
        
        String codeRu = sc.nextLine();
        String nameRu = sc.nextLine();
        int unitPrice = Integer.parseInt(sc.nextLine());
        Rule r = new Rule(codeRu, nameRu, unitPrice);
        
        return new Invoice(st, arr, r);
    }
}
