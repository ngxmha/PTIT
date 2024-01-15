package J07045;

public class LoaiPhong implements Comparable<LoaiPhong>{
    private char symbol;
    public String type;
    public int unit;
    public double fee;

    public LoaiPhong(String s) {
        String[] arr = s.split(" ");
        symbol = arr[0].charAt(0);
        type = arr[1];
        unit = Integer.parseInt(arr[2]);
        fee = Double.parseDouble(arr[3]);
    }
    
    public String getType(){
        return type;
    }

    @Override
    public int compareTo(LoaiPhong l) {
        return type.compareTo(l.getType());
    }
    
    @Override
    public String toString() {
        return symbol + " " + type + " " + unit + " " + fee;
    }
        
}
