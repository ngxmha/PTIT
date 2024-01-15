package J05014;

public class Teacher implements Comparable<Teacher> {
    
    private static int quantity = 1;
    
    private String id;
    private String name;
    private String idXetTuyen;
    private double diemTin;
    private double diemChuyenMon;

    public Teacher(String name, String idXetTuyen, double diemTin, double diemChuyenMon) {
        this.id = "GV" + String .format("%02d", quantity++);
        this.name = name;
        this.idXetTuyen = idXetTuyen;
        this.diemTin = diemTin;
        this.diemChuyenMon = diemChuyenMon;
    }
    
    public String getMonXetTuyen() {
        if(idXetTuyen.charAt(0) == 'A')
            return "TOAN";
        else if(idXetTuyen.charAt(0) == 'B')
            return "LY";
        return "HOA";
    }
    
    public double getDiemXetTuyen() {
        if(idXetTuyen.charAt(1) == '1')
            return diemTin * 2 + diemChuyenMon + 2;
        else if(idXetTuyen.charAt(1) == '2')
            return diemTin * 2 + diemChuyenMon + 1.5;
        if(idXetTuyen.charAt(1) == '3')
            return diemTin * 2 + diemChuyenMon + 1;
        return diemTin * 2 + diemChuyenMon;
    }
    
    public String getResult() {
        if(getDiemXetTuyen() >= 18)
            return "TRUNG TUYEN";
        return "LOAI";
    }
    
    @Override
    public int compareTo(Teacher t) {
        return getDiemXetTuyen() > t.getDiemXetTuyen() ? -1 : 1;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " "  + getMonXetTuyen() + " " + String.format("%.1f", getDiemXetTuyen()) + " " + getResult();
    }
}
