import java.util.ArrayList;
/**
 *
 * @author dsa21
 */
public class OneItemBox extends Box {
    private ArrayList<Item> oneItemList;
    
    public OneItemBox() { this.oneItemList = new ArrayList<>(); }
    
    @Override
    public void add(Item item) {
        this.oneItemList.add(item);
    }
    
    @Override
    public boolean isInBox(Item item) {
        if(this.oneItemList.isEmpty()) return false;
        if(this.oneItemList.get(0).equals(item)) {
            return true;
        }        
        return false;
    }
}
