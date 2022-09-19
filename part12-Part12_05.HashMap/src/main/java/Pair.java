/**
 *
 * @author dsa21
 */
public class Pair<K,V> {
    private K k;
    private V v;
    
    public Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }
    
    public V get() {
        return this.v;
    }
    public void set(V v) {
        this.v = v;
    }
    public K getK() {
        return this.k;
    }
}
