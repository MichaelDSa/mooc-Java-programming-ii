import java.util.*;
/**
 *
 * @author dsa21
 */
public class ShoppingCart {
    private Map<String, Item> itemList;
    
    public ShoppingCart() {
        this.itemList = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if(this.itemList.containsKey(product)) {
            this.itemList.get(product).increaseQuantity();
        }
        this.itemList.putIfAbsent(product, new Item(product, 1, price));
    }
    
    public int price() {
        int total = 0;
        for(Item i : itemList.values()) {
            total += i.price();            
        }
        return total;
    }
    
    public void print() {
        for(Item i : itemList.values()) {
            System.out.println(i);
        }
    }
    
}
