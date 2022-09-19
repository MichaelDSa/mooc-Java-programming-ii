
/**
 *
 * @author dsa21
 */
public class CD implements Packable {
    private String artist, nameOfCD;
    private int pubYear;
    private double weight;
    
    public CD(String artist, String title, int pubYear) {
        this.artist = artist;
        this.nameOfCD = title;
        this.pubYear = pubYear;
        this.weight = 0.1;
    }
    
    @Override
    public double weight(){
        return this.weight;
    }
    public String toString() {
        return this.artist + ": " + this.nameOfCD + " (" + this.pubYear + ")";
    }
    
}
