
/**
 *
 * @author dsa21
 */
public class B extends A {
    
    private int savings;
    
    public B(int i, int s) {
        super(i); 
        this.savings = s;
    }
    @Override
    protected int inheritanceGiven() {
        return super.inheritanceGiven() + this.savings;
    }
    
}
