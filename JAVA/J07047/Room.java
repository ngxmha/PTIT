package J07047;

public class Room {
    
    private char sign;
    private String type;
    private int unit;
    private double fee;

    public Room(char sign, String type, int unit, double fee) {
        this.sign = sign;
        this.type = type;
        this.unit = unit;
        this.fee = fee;
    }

    public char getSign() {
        return sign;
    }

    public int getUnit() {
        return unit;
    }

    public double getFee() {
        return fee;
    }
    
    
}
