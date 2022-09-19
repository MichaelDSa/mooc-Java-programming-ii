import java.util.ArrayList;
/**
 * 
 *By studying this I have learned that a HashMap:
 * > is indexed with hash values
 * > is a multi-dimensional array
 * > uses its 'outer' array as an index, and it's inner array can store multiple values
 * > the index number of the outer loop (which is a hashvalue) is created using the key's hashvalue.
 *      > this hashvalue is the absolute value: Math.abs(key.hashCode() % this.value.length)
 *          > this index number (or hashvalue) will always be within the bounds of the outer array's index.
 *          > there may be more than one key/value pair at each index.
 *              >this happens when there are "hash collisions", or when the hash number of one key is the same as that of another.
 *                  > usually hash collisions are not good. I tested the hash number for colissions using an array length of 10, but it should really be 
 *                      a length of 32 --- but it still works if there are hash colissions. ( I was actually testing to see if grow() would work, and was too lazy to
 *                      make entries in Main, so I just shortened the array length. this is when I noticed collisions. later, a video made by "Computerphile" on YouTube
 *                      identified these as "hash collisions" - I still dont know if this is the right word for it. )
 *              > each outer index stores an inner array.
 *              > each key/value pair is stored in this inner array, within which, more pairs can be stored at the same outer index.
 * > What makes the HashMap especially fast at retrieving values is that it's index position is first calculated 
 *   using the key's hash value (see the Math.abs code above). This way the list in that position is quickly identified
 *   without having to traverse every single value. The list in the calculated index is very short, and takes very little time to traverse.
 *              
 *  
 * @author dsa21
 */
public class HashMap<K,V> {
    private ArrayList<Pair<K,V>>[] map;
    private int idx;
    
    public HashMap() {
        this.map = new ArrayList[32];
        this.idx = 0;
    }
    
    public void add(K k, V v) {        
        
        if(!pairExists(k,v)) {
            this.map[hash(k)].add(pair(k,v));
            this.idx++;
            if(1.0 * this.idx / this.map.length > 0.75) {
                expand();
            }
        } else { 
            setValue(k,v);
        }
        
    }
    
    public void remove(K k) {
        if(keyExists(k)) {
            for(int i = 0; i < this.map[hash(k)].size(); i++) {
                if(this.map[hash(k)].get(i).getK().equals(k)) {
                    this.map[hash(k)].remove(i);
                }
            }
        }
    }
    public void setValue(K k, V v) {
        if(pairExists(k,v)) {
            return;
        }
        for(Pair i : this.map[hash(k)]) {
            if(i.getK().equals(k)) {
                i.set(v);
                return;
            }
        }                
    }
    
    public V get(K k) {
        
        if(keyExists(k)) {
            for(Pair i : this.map[hash(k)]) {
                if(i.getK().equals(k)) {
                    return (V) i.get();
                }
            }
        } 
        return null;
    }
    
    

    private int hash(K k) {
        return Math.abs(k.hashCode() % this.map.length);
    }
    
    private Pair<K,V> pair(K k, V v) {
        return new Pair<>(k,v);
    }
    
    private boolean pairExists(K k, V v) {
        if(this.map[hash(k)] == null) {
            this.map[hash(k)] = new ArrayList<>();
            return false;
        } else if( this.map[hash(k)].contains(pair(k,v))){
                return true;
        }        
        return false;
    }
    
    private boolean keyExists(K k) {
        boolean keyExists = false;
        if(this.map[hash(k)] == null) {
            return keyExists;
        }        
        for(int i = 0; i < this.map[hash(k)].size(); i++) {
            if(this.map[hash(k)].get(i).getK().equals(k)) {
                if(this.map[hash(k)] == null) {
                    return keyExists;
                }
                keyExists = true;
                break;
            }
        }
        return keyExists;
    }
    
    private void expand() {
        ArrayList<Pair<K,V>>[] newMap = new ArrayList[this.map.length * 2];    
        
        for(int i = 0; i < this.idx; i++) {
            if(this.map[i] == null) {  
                this.map[i] = new ArrayList<>();                
            } else {
                for(int j = 0; j < this.map[i].size(); j++) {
                    int newHash = Math.abs(this.map[i].get(j).getK().hashCode() % newMap.length);
                    if(newMap[newHash] == null) {
                        newMap[newHash] = new ArrayList<>();
                    }
                    newMap[newHash].add(this.map[i].get(j));
                }
            }
        }        
        this.map = newMap;                
    }
    
}
