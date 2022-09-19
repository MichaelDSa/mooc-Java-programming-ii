import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author dsa21
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> hash;
    
    public StorageFacility() {
        this.hash = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.hash.putIfAbsent(unit, new ArrayList<>());
        this.hash.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return this.hash.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        if(!this.hash.containsKey(storageUnit)) return;
        this.hash.get(storageUnit).remove(item);
        if(this.hash.get(storageUnit).isEmpty()) {
            this.hash.remove(storageUnit);
        }
       
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for(String i : this.hash.keySet()) {
            units.add(i);
        }
        return units;
    }
}
