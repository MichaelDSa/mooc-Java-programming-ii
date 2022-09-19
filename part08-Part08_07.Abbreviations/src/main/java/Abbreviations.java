import java.util.HashMap;
/**
 *
 * @author dsa21
 */
public class Abbreviations {
    private HashMap<String, String> hash;

    public Abbreviations() {
        this.hash = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        this.hash.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return hash.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation) {
        return hash.get(abbreviation);
    }
    
    
}
