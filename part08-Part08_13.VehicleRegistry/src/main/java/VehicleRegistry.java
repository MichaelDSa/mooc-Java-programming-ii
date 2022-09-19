import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author dsa21
 */
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> owner;
    
    public VehicleRegistry() {
        
        this.owner = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if(this.owner != null) {
            for(LicensePlate i : this.owner.keySet()) {
                if(i.equals(licensePlate)) return false;
            }
        }
        this.owner.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        return this.owner.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if(this.owner.get(licensePlate) == null) return false;
        this.owner.remove(licensePlate);
        return true;
    }
    
    public void printLicensePlates() {
        for(LicensePlate i : this.owner.keySet()){
            System.out.println(i);
        }
    }
    public void printOwners() {
        ArrayList<String> o = new ArrayList<>();
        for(String i : this.owner.values()) {
            if(o.contains(i)) continue;
            o.add(i);
        }
        for(String i : o) System.out.println(i);
    }
}
