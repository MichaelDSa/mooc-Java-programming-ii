import java.util.ArrayList;
/**
 *
 * @author dsa21
 */
public class MisplacingBox extends Box {
    private ArrayList<Item> misplacedList;
    
    
    @Override
    public void add(Item item){
       super.add(new ArrayList<>());
    }
    
    @Override
    public boolean isInBox(Item item) {
        return this.equals(item);
    }
    
}
