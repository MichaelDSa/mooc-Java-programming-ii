import java.util.HashMap;
/**
 *
 * @author dsa21
 */
public class IOU {
    private HashMap<String,Double> hash;
    
    public IOU() {
        this.hash = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        this.hash.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return this.hash.getOrDefault(toWhom, 0.0);
    }
}
