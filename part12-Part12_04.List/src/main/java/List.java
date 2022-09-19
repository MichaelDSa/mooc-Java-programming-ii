/**
 *
 * @author dsa21
 */
public class List<T> {
    T[] l;       
    
    public List() {
        this.l = (T[]) new Object[1];        
    }
    
    public void add(T v) {
        if(this.l[0] == null && this.l.length == 1) {
            this.l[this.l.length-1] = v;            
        } else {
            grow();
            this.l[this.l.length-1] = v;
        }
    }
    
    public int size() {
        return this.l.length;
    }
    
    private void grow() {
        T[] l1 = (T[]) new Object[this.l.length + 1];
        copy(l1);
    }
    
    private void copy(T[] c) {
        for(int i = 0; i < this.l.length; i++) {
            c[i] = this.l[i];
        }
        this.l = c;
    }    
    
    private boolean except(int index) {
        if(index < 0 || index >= this.l.length) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + (this.l.length-1) + "]");
        }else {
            return true;
        }
    }
    
    public void remove(int index) {     
        if(except(index) && index == 0 && this.l.length == 1) {
            this.l[index] = null;   
            return;
        } else {
            for(int i = index; i < this.l.length; i++) {
                this.l[i] = i + 1 >= this.l.length ? null : this.l[i+1];
            }
            reduce();
        }        
    }
    
    private void reduce() {
        T[] l1 = (T[]) new Object[this.l.length-1];
        for(int i = 0; i < l1.length; i++) {
            l1[i] = this.l[i];
        }
        this.l = l1;
    }
    
    public boolean contains(T v) {
        boolean is = false;
        for(int i = 0; i < this.l.length; i++) {
            if(this.l[i] == v) {
                is = true;
            }
        }
        return is;
    }
    
    public T get(int index) {
        except(index);
        return this.l[index];        
    }
    
    public int getIndexOf(T v) {
        int index = -1;
        for(int i = 0; i < this.l.length; i++) {
            if(this.l[i] == v) {
                index = i;
            }
        }
        return index;
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < this.l.length; i++) {
            String space = i+1 < this.l.length ? ", " : "";
            str.append(this.l[i] + space);
        }
        return "[" + str + "]";
        
    }
}
