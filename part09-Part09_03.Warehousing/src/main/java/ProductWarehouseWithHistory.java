
/**
 *
 * @author dsa21
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory ch;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.ch = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        this.ch.add(initialBalance);       
        
    }
    public String history() {
        return String.valueOf(this.ch);
    }
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.ch.add(super.getBalance());
    }
    @Override
    public double takeFromWarehouse(double amount) {
        double take = super.takeFromWarehouse(amount);
        this.ch.add(super.getBalance());
        return take;
    }
    public void printAnalysis() {
        System.out.println("Product: " + super.getName() + 
                            "\nHistory: " + this.history() +
                            "\nLargest amount of product: " + this.ch.maxValue() +
                            "\nSmallest amount of product: " + this.ch.minValue() + 
                            "\nAverage: " + this.ch.average());
    }
}
