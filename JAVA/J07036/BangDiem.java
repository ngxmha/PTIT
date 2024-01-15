package J07036;

public class BangDiem implements Comparable<BangDiem>{
    
    private Student st;
    private Subject sub;
    private float score;

    public BangDiem(Student st, Subject sub, float score) {
        this.st = st;
        this.sub = sub;
        this.score = score;
    }
    
    public String getGroupStudent()
    {
        return st.getGroup();
    }
    
    @Override
    public int compareTo(BangDiem o)
    {
        if(sub.getId().equals(o.sub.getId()))
            return st.getId().compareTo(o.st.getId());
        return sub.getId().compareTo(o.sub.getId());
    }
    
    @Override
    public String toString()
    {
        return st.getId() + " " + st.getName() + " " + sub.getId() + " " + sub.getName() + " " + (score == (int)score ? String.format("%.0f", score) : score);
    }
}
