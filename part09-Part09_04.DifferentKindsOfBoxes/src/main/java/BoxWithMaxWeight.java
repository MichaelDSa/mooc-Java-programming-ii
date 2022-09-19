import java.util.ArrayList;
/**
 *
 * @author dsa21
 */
public class BoxWithMaxWeight extends Box{
    private int maxWeight;
    private ArrayList<Item> itemList;
    
    public BoxWithMaxWeight (int capacity) {         
        this.maxWeight = capacity; 
        this.itemList = new ArrayList<>();
        
    }
    @Override 
    public void add(Item item) {
        this.itemList.add(item);
        
    }
    
    @Override
    public boolean isInBox(Item item) {
        
        if(!this.itemList.contains(item)) return false;
        
        int limit = 0;
        
        for(int i = 0 ; i < this.itemList.size() ; i++) {            
            limit += this.itemList.get(i).getWeight();             
            if(this.itemList.get(i).equals(item)) break;            
        }
        
        if(limit > this.maxWeight) {
            this.itemList.remove(item);
            return false;
        }
        return true;
    }
}
