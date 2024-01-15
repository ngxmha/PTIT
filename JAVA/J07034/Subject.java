package J07034;

public class Subject {
    private String idSub, nameSub;
    private byte credits;

    public Subject(String idSub, String nameSub, byte credits) {
        this.idSub = idSub;
        this.nameSub = nameSub;
        this.credits = credits;
    }
    
    public String getNameSub(){
        return nameSub;
    }

    @Override
    public String toString() {
        return idSub + " " + nameSub + " " + credits;
    }
}
