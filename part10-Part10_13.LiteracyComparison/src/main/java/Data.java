
/**
 *
 * @author dsa21
 */
public class Data implements Comparable<Data> {
    private String gender, country, year;
    private double percent;
    
    public Data(String g, String c, String y, String p) {
        String[] part = g.split(" ");
        this.gender = part[1];
        this.country = c;
        this.year = y;
        this.percent = Double.valueOf(p);
    }
    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.percent;
    }
    
    public double getPercent() { return this.percent; }
//    below, I will see if c.percent works. the IDE does not show an error. c.percent should be private.
//    It worked.       
    @Override
    public int compareTo(Data c) {
        if(this.percent < c.percent) return -1;
        else if(this.percent == c.getPercent()) return 0;
        else return 1;  
    }
}
