package J07060;

import java.text.SimpleDateFormat;

public class LichThi implements Comparable<LichThi>{
    
    private CaThi cathi;
    private MonThi monthi;
    private String group;
    private int quantity;

    public LichThi(CaThi cathi, MonThi monthi, String group, int quantity) {
        this.cathi = cathi;
        this.monthi = monthi;
        this.group = group;
        this.quantity = quantity;
    }
    
    @Override
    public int compareTo(LichThi o)
    {
        if(cathi.getDateExam().equals(o.cathi.getDateExam()))
        {
            if(cathi.getTimeExam().equals(o.cathi.getTimeExam()))
                return cathi.getId().compareTo(o.cathi.getId());
            return cathi.getTimeExam().compareTo(o.cathi.getTimeExam());
        }
        return cathi.getDateExam().compareTo(o.cathi.getDateExam());
    }
    
    @Override
    public String toString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateExam = sdf.format(cathi.getDateExam());
        sdf = new SimpleDateFormat("HH:mm");
        String timeExam = sdf.format(cathi.getTimeExam());
        
        return dateExam + " " + timeExam + " " + cathi.getRoom() + " " + monthi.getName() + " " + group + " " + quantity;
    }
}
