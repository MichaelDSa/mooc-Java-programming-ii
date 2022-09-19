import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author dsa21
 */
public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() { 
        this.history = new ArrayList<>(); 
    }
    
    public void add(double status) { this.history.add(status); }
    
    public void clear() { this.history.clear(); }
    
    @Override
    public String toString() { return String.valueOf(this.history); }
    
    public double maxValue() {
        return Collections.max(this.history);
    }
    
    public double minValue() {
        return Collections.min(this.history);
        
    }
    public double average() {
        if(this.history.isEmpty()) return 0.0;
        double sum = 0;        
        for(Double i : this.history) sum += i;       
        return sum / this.history.size();
        
    }
}
