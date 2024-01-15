package J07033;

public class Student {
    private String idSt, nameSt, classSt, emailSt;

    public Student(String idSt, String nameSt, String classSt, String emailSt) {
        this.idSt = idSt;
        String s = "";
        String[] arr = nameSt.trim().split("\\s+");
        for(int i = 0; i < arr.length; i++){
            s += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }
        this.nameSt = s;
        this.classSt = classSt;
        this.emailSt = emailSt;
    }
    
    public String getIdSt(){
        return idSt;
    }
    
    @Override
    public String toString(){
        return idSt + " " + nameSt + " " + classSt + " " + emailSt;
    }
}
