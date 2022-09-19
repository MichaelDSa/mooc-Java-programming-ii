
/**
 *
 * @author dsa21
 */
public class Person {
    private String name, address;
    
    public Person(String n, String a) {
        this.name = n;
        this.address = a;
    }
    @Override
    public String toString() {
        return this.name + "\n  " + address;
    }
}
