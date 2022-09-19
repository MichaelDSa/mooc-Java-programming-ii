import java.util.ArrayList;
/**
 *
 * @author dsa21
 */
public class Pipe<T> {
    private ArrayList<T> a;
    
    public Pipe() {
        this.a = new ArrayList<>();
    }
    public void putIntoPipe(T value) {
        this.a.add(value);
    }
    public T takeFromPipe() {
        if(this.a.isEmpty()) return null;
        T b = this.a.get(0);
        this.a.remove(0);
        return b;
    }
    public boolean isInPipe() {
        return !this.a.isEmpty();
    }
    
}
