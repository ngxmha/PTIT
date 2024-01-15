package J07027;

public class Exercise {
    
    private static int quantity = 1;
    
    private int stt;
    private String name;

    public Exercise(String name) {
        stt = quantity++;
        this.name = name;
    }

    public int getStt() {
        return stt;
    }

    public String getName() {
        return name;
    }
    
}
