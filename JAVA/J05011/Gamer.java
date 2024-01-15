package J05011;

public class Gamer {
    
    private String id;
    private String name;
    private String in;
    private String out;

    public Gamer(String id, String name, String in, String out) {
        this.id = id;
        this.name = name;
        this.in = in;
        this.out = out;
    }
    
    public int getTime() {
        int time = 0;
        time += Integer.parseInt(this.out.substring(0, 2)) * 60 + Integer.parseInt(this.out.substring(3, 5));
        time -= Integer.parseInt(this.in.substring(0, 2)) * 60 + Integer.parseInt(this.in.substring(3, 5));
        return time;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + (getTime() / 60) + " gio " + (getTime() % 60) + " phut ";
    }
}