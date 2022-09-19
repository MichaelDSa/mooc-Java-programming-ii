
/**
 *
 * @author dsa21
 */
public class CustomTacoBox implements TacoBox {
    private int tacos;
    
    public CustomTacoBox(int t) {
        this.tacos = t;
    }
    @Override
    public int tacosRemaining() {
        return this.tacos;
        
    } 
    public void eat() {
        if(this.tacos <= 0) return;
        this.tacos -= 1;
    }
    
}
