/**
 *
 * @author dsa21
 */
public class Hideout<T> {
    private T a;    
    
    public void putIntoHideout(T toHide) {
        this.a = toHide;
    }
    public T takeFromHideout() {
        T b = this.a;
        this.a = null;
        return b;
    }
    public boolean isInHideout() {
        return this.a != null;
    }
}
