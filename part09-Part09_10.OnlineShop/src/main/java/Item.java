import java.util.*;
/**
 *
 * @author dsa21
 */
//part3
public class Item {
    private String product;
    private int qty, unitPrice;
    
    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        return this.unitPrice * this.qty;    
    }

    public void increaseQuantity() {
        this.qty +=1;
    }
    @Override
    public String toString() {
        return this.product + ": " + this.qty;
    }
}
