package J07035;

public class BangDiem implements Comparable<BangDiem>{
    
    private Student st;
    private Subject sub;
    private float score;

    public BangDiem(Student st, Subject sub, float score) {
        this.st = st;
        this.sub = sub;
        this.score = score;
    }
    
    public String getIdSub()
    {
        return sub.getId();
    }
    
    @Override
    public int compareTo(BangDiem o)
    {
        if(score == o.score)
            return st.getId().compareTo(o.st.getId());
        return o.score > score ? 1 : -1;
    }
    
    @Override
    public String toString()
    {
        return st.getId() + " " + st.getName() + " " + st.getGroup() + " " + (score == (int)score ? String.format("%.0f", score) : score);
    }
}
