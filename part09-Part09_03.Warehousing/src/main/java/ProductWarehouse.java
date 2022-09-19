
/**
 *
 * @author dsa21
 */
public class ProductWarehouse extends Warehouse {
    private String product;
    
    public ProductWarehouse(String ProductName, double capacity) {
        super(capacity);
        this.product = ProductName;
    }
    
    public String getName() { return this.product; }
    
    public void setName(String newName){ this.product = newName; }
    
    @Override
    public String toString() {
        return this.getName() + ": " + super.toString();
    }
}
