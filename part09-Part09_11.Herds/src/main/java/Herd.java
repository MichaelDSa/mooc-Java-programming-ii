
/**
 *
 * @author dsa21
 */
import java.util.*;
public class Herd implements Movable {
    private List<Movable> herdMembers;
    
    public Herd() {
        this.herdMembers = new LinkedList<>();
    }
    public void addToHerd(Movable movable) {
        this.herdMembers.add(movable);
    }
    @Override
    public void move(int dx, int dy) {
        for(Movable i : herdMembers) {
            i.move(dx,dy);
        }
    }
    @Override
    public String toString() {
        String positions = "";
        for(Movable i : herdMembers) {
            positions += i + "\n";
        }
        return positions;
    }   
    
    
}
