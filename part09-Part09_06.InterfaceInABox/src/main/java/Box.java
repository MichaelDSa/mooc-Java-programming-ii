import java.util.ArrayList;
/**
 *
 * @author dsa21
 */
public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> boxItems;
    
    public Box(double capacity) {
        this.capacity = capacity;
        this.boxItems = new ArrayList<>();
    }
    
    public void add(Packable i) {
        if(this.weight() + i.weight() <= this.capacity) {
            this.boxItems.add(i);            
        }
    }
    @Override
    public double weight() {
        double wAmount = 0.0;
        for(Packable i : boxItems) {
            wAmount += i.weight();
        }
        return wAmount;
    }
    
    public String toString() {
        return "Box: " + boxItems.size() + " items," + " total weight " + this.weight() + " kg";
    }
    
}
