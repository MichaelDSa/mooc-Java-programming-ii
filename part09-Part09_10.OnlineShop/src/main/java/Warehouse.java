import java.util.*;
/**
 *
 * @author dsa21
 */
public class Warehouse {
    private Map<String, Integer> inventory;
    private Map<String, Integer> priceList;
    
    public Warehouse() {
        this.inventory = new HashMap<>();
        this.priceList = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {          
        this.priceList.replace(product, price);
        this.inventory.put(product, stock);
        this.priceList.put(product, price);
    }
    
    public int price(String product) {                    
        return this.priceList.getOrDefault(product, -99);
    }
    
    
    
    //part 2
    public int stock(String product) {
        return this.inventory.getOrDefault(product, 0);
    }
    public boolean take(String product) {
        boolean taken = this.inventory.getOrDefault(product, 0) > 0;
        this.inventory.computeIfPresent(product, (k,v) -> v == 0 ? 0 : v - 1);
        return taken;
                
    }
    
    //part 3
    public Set<String> products() {
        Set<String> productList = new HashSet<>();
        for(String i : this.inventory.keySet()) {
            productList.add(i);
        }        
        return productList;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Warehouse other = (Warehouse) obj;
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Objects.equals(this.priceList, other.priceList)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.inventory);
        hash = 79 * hash + Objects.hashCode(this.priceList);
        return hash;
    }

   
    
}
