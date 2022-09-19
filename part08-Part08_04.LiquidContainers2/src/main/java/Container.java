
/**
 *
 * @author dsa21
 */
public class Container {
    private int i;
    
    public Container() {
        this.i = 0;
    }
    public int contains() {
        return this.i;
    }   
    public void add(int amount) {
        this.i = amount < 0 ? this.i : amount + this.i > 100 ? 100 : amount + this.i;
    }
    
    public void remove(int amount) {
        this.i = amount < 0 ? this.i : this.i - amount < 0 ? 0 : this.i - amount;
    }
    
    @Override
    public String toString() {
        return this.i + "/" + 100;
    }
}
